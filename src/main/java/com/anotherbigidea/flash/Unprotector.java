/*
 * Copyright (c) 2001, David N. Main, All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the
 * following conditions are met:
 *
 * 1. Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials
 * provided with the distribution.
 *
 * 3. The name of the author may not be used to endorse or
 * promote products derived from this software without specific
 * prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.anotherbigidea.flash;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.anotherbigidea.flash.interfaces.SWFTags;
import com.anotherbigidea.flash.readers.SWFReader;
import com.anotherbigidea.flash.writers.SWFWriter;


/**
 * Utility to unprotect a SWF.
 * First arg is input filename.
 * Second arg is output filename.
 */
public class Unprotector implements SWFTags {
    protected SWFTags writer;

    public Unprotector(SWFTags writer) {
        this.writer = writer;
    }

    /**
     * Interface SWFTags
     */
    public void header(int version, long length, int twipsWidth, int twipsHeight, int frameRate, int frameCount) throws IOException {
        writer.header(version, -1, twipsWidth, twipsHeight, frameRate, frameCount);
    }

    /**
     * Interface SWFTags
     */
    public void tag(int tagType, boolean longTag, byte[] contents) throws IOException {
        if (tagType == SWFConstants.TAG_PROTECT) {
            return; //skip protect tag
        }

        writer.tag(tagType, longTag, contents);
    }

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[0]);
        FileOutputStream out = new FileOutputStream(args[1]);

        SWFWriter writer = new SWFWriter(out);
        Unprotector unprotector = new Unprotector(writer);
        SWFReader reader = new SWFReader(unprotector, in);
        reader.readFile();

        in.close();
        out.flush();
        out.close();
    }
}
