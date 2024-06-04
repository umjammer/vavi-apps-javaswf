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


/**
 * Various SWF Constant Values
 */
public interface SWFConstants {

    int TWIPS = 20; // number of TWIPS per pixel
    int TAG_END = 0;
    int TAG_SHOWFRAME = 1;
    int TAG_DEFINESHAPE = 2;
    int TAG_FREECHARACTER = 3;
    int TAG_PLACEOBJECT = 4;
    int TAG_REMOVEOBJECT = 5;
    int TAG_DEFINEBITS = 6;
    int TAG_DEFINEBUTTON = 7;
    int TAG_JPEGTABLES = 8;
    int TAG_SETBACKGROUNDCOLOR = 9;
    int TAG_DEFINEFONT = 10;
    int TAG_DEFINETEXT = 11;
    int TAG_DOACTION = 12;
    int TAG_DEFINEFONTINFO = 13;
    int TAG_DEFINESOUND = 14;
    int TAG_STARTSOUND = 15;

    // ???
    int TAG_DEFINEBUTTONSOUND = 17;
    int TAG_SOUNDSTREAMHEAD = 18;
    int TAG_SOUNDSTREAMBLOCK = 19;
    int TAG_DEFINEBITSLOSSLESS = 20;
    int TAG_DEFINEBITSJPEG2 = 21;
    int TAG_DEFINESHAPE2 = 22;
    int TAG_DEFINEBUTTONCXFORM = 23;
    int TAG_PROTECT = 24;

    // ???
    int TAG_PLACEOBJECT2 = 26;

    // ???
    int TAG_REMOVEOBJECT2 = 28;

    // ???
    int TAG_DEFINESHAPE3 = 32;
    int TAG_DEFINETEXT2 = 33;
    int TAG_DEFINEBUTTON2 = 34;
    int TAG_DEFINEBITSJPEG3 = 35;
    int TAG_DEFINEBITSLOSSLESS2 = 36;
    int TAG_DEFINETEXTFIELD = 37;
    int TAG_DEFINEQUICKTIMEMOVIE = 38;
    int TAG_DEFINESPRITE = 39;
    int TAG_NAMECHARACTER = 40;
    int TAG_SERIALNUMBER = 41;
    int TAG_GENERATOR_TEXT = 42;
    int TAG_FRAMELABEL = 43;

    // ???
    int TAG_SOUNDSTREAMHEAD2 = 45;
    int TAG_DEFINEMORPHSHAPE = 46;

    // ???
    int TAG_DEFINEFONT2 = 48;
    int TAG_TEMPLATECOMMAND = 49;

    // ???
    int TAG_FLASHGENERATOR = 51;
    int TAG_GEN_EXTERNAL_FONT = 52;

    // ???
    // ???
    // ???
    int TAG_EXPORT = 56;
    int TAG_IMPORT = 57;
    int TAG_ENABLEDEBUG = 58;
    int TAG_DOINITACTION = 59;

    // ???
    // ???
    int TAG_DEFINEFONTINFO2 = 62;

    // ???
    int TAG_ENABLEDEBUGGER2 = 64;

    // Fill Types
    int FILL_SOLID = 0x00;
    int FILL_LINEAR_GRADIENT = 0x10;
    int FILL_RADIAL_GRADIENT = 0x12;
    int FILL_TILED_BITMAP = 0x40;
    int FILL_CLIPPED_BITMAP = 0x41;

    // Clip Action Conditions
    int CLIP_ACTION_ON_LOAD = 0x01;
    int CLIP_ACTION_ENTER_FRAME = 0x02;
    int CLIP_ACTION_UNLOAD = 0x04;
    int CLIP_ACTION_MOUSE_MOVE = 0x08;
    int CLIP_ACTION_MOUSE_DOWN = 0x10;
    int CLIP_ACTION_MOUSE_UP = 0x20;
    int CLIP_ACTION_KEY_DOWN = 0x40;
    int CLIP_ACTION_KEY_UP = 0x80;
    int CLIP_ACTION_DATA = 0x100;

    // Font Info flags
    int FONT_UNICODE = 0x20;
    int FONT_SHIFTJIS = 0x10;
    int FONT_ANSI = 0x08;
    int FONT_ITALIC = 0x04;
    int FONT_BOLD = 0x02;
    int FONT_WIDECHARS = 0x01;

    // DefineFont2 flags
    int FONT2_HAS_LAYOUT = 0x80;
    int FONT2_SHIFTJIS = 0x40;
    int FONT2_UNICODE = 0x20;
    int FONT2_ANSI = 0x10;
    int FONT2_32OFFSETS = 0x08;
    int FONT2_WIDECHARS = 0x04;
    int FONT2_ITALIC = 0x02;
    int FONT2_BOLD = 0x01;

    // Text Field flags
    int TEXTFIELD_HAS_LAYOUT = 0x2000; // author always sets this
    int TEXTFIELD_NO_SELECTION = 0x1000;
    int TEXTFIELD_DRAW_BORDER = 0x0800;
    int TEXTFIELD_HTML = 0x0200;
    int TEXTFIELD_FONT_GLYPHS = 0x0100;
    int TEXTFIELD_HAS_TEXT = 0x0080;
    int TEXTFIELD_WORD_WRAP = 0x0040;
    int TEXTFIELD_IS_MULTILINE = 0x0020;
    int TEXTFIELD_IS_PASSWORD = 0x0010;
    int TEXTFIELD_DISABLE_EDIT = 0x0008;
    int TEXTFIELD_HAS_TEXT_COLOR = 0x0004; // author always sets this
    int TEXTFIELD_LIMIT_CHARS = 0x0002;
    int TEXTFIELD_HAS_FONT = 0x0001; // author always sets this

    // Text Field alignment
    int TEXTFIELD_ALIGN_LEFT = 0;
    int TEXTFIELD_ALIGN_RIGHT = 1;
    int TEXTFIELD_ALIGN_CENTER = 2;
    int TEXTFIELD_ALIGN_JUSTIFY = 3;

    // Used by TagDefineText(2)..
    int TEXT_HAS_FONT = 0x08;
    int TEXT_HAS_COLOR = 0x04;
    int TEXT_HAS_YOFFSET = 0x02;
    int TEXT_HAS_XOFFSET = 0x01;

    // Action Conditions for DefineButton2..
    int BUTTON2_OVERDOWN2IDLE = 0x100;
    int BUTTON2_IDLE2OVERDOWN = 0x080;
    int BUTTON2_OUTDOWN2IDLE = 0x040;
    int BUTTON2_OUTDOWN2OVERDOWN = 0x020;
    int BUTTON2_OVERDOWN2OUTDOWN = 0x010;
    int BUTTON2_OVERDOWN2OVERUP = 0x008;
    int BUTTON2_OVERUP2OVERDOWN = 0x004;
    int BUTTON2_OVERUP2IDLE = 0x002;
    int BUTTON2_IDLE2OVERUP = 0x001;

    // Formats for DefineBitsLossless..
    int BITMAP_FORMAT_8_BIT = 3;
    int BITMAP_FORMAT_16_BIT = 4;
    int BITMAP_FORMAT_32_BIT = 5;

    // Sound Constants..
    int SOUND_FORMAT_RAW = 0;
    int SOUND_FORMAT_ADPCM = 1;
    int SOUND_FORMAT_MP3 = 2;
    int SOUND_FORMAT_RAW_LITTLEENDIAN = 3;
    int SOUND_FORMAT_NELLYMOSER = 6;
    int SOUND_FREQ_5_5KHZ = 0; // 5.5 kHz
    int SOUND_FREQ_11KHZ = 1;
    int SOUND_FREQ_22KHZ = 2;
    int SOUND_FREQ_44KHZ = 3;

    // Language Codes for DefineFontInfo2       
    int LANGUAGE_CODE_NONE = 0;
    int LANGUAGE_CODE_LATIN = 1;
    int LANGUAGE_CODE_JAPANESE = 2;
    int LANGUAGE_CODE_KOREAN = 3;
    int LANGUAGE_CODE_SIMPLIFIED_CHINESE = 4;
    int LANGUAGE_CODE_TRADITIONAL_CHINESE = 5;

    // String Encodings
    String STRING_ENCODING_PRE_MX = "US-ASCII";
    String STRING_ENCODING_MX = "UTF-8";

    // MX Version number
    int FLASH_MX_VERSION = 6;
}
