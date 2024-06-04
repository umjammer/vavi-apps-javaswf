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

package com.anotherbigidea.flash.interfaces;

import java.io.IOException;


/**
 * Interface for passing Action Codes
 * <p>
 * Lifecycle is -
 * 1. start(..) is called with any condition flags (e.g. event codes) for the
 * action array
 * 2. action methods are called
 * 3. end() is called to terminate array
 * 4. 1..3 is repeated for any subsequent condition blocks
 * 5. done() is called to terminate all action passing
 */
public interface SWFActions {

    /**
     * Start of actions
     */
    void start(int flags) throws IOException;

    /**
     * End of all action blocks
     */
    void done() throws IOException;

    /**
     * End of actions
     */
    void end() throws IOException;

    /**
     * Pass through a blob of actions
     */
    void blob(byte[] blob) throws IOException;

    /**
     * Unrecognized action code
     *
     * @param data may be null
     */
    void unknown(int code, byte[] data) throws IOException;

    /**
     * Target label for a jump - this method call immediately precedes the
     * target action.
     */
    void jumpLabel(String label) throws IOException;

    /**
     * Comment Text - useful for debugging purposes
     */
    void comment(String comment) throws IOException;

    // Flash 3 Actions:
    void gotoFrame(int frameNumber) throws IOException;

    void gotoFrame(String label) throws IOException;

    void getURL(String url, String target) throws IOException;

    void nextFrame() throws IOException;

    void prevFrame() throws IOException;

    void play() throws IOException;

    void stop() throws IOException;

    void toggleQuality() throws IOException;

    void stopSounds() throws IOException;

    void waitForFrame(int frameNumber, String jumpLabel) throws IOException;

    void setTarget(String target) throws IOException;

    // Flash 4 Actions:
    void push(String value) throws IOException;

    void push(float value) throws IOException;

    void pop() throws IOException;

    void add() throws IOException;

    void substract() throws IOException;

    void multiply() throws IOException;

    void divide() throws IOException;

    void equals() throws IOException;

    void lessThan() throws IOException;

    void and() throws IOException;

    void or() throws IOException;

    void not() throws IOException;

    void stringEquals() throws IOException;

    void stringLength() throws IOException;

    void concat() throws IOException;

    void substring() throws IOException;

    void stringLessThan() throws IOException;

    void stringLengthMB() throws IOException;

    void substringMB() throws IOException;

    void toInteger() throws IOException;

    void charToAscii() throws IOException;

    void asciiToChar() throws IOException;

    void charMBToAscii() throws IOException;

    void asciiToCharMB() throws IOException;

    void jump(String jumpLabel) throws IOException;

    void ifJump(String jumpLabel) throws IOException;

    void call() throws IOException;

    void getVariable() throws IOException;

    void setVariable() throws IOException;

    // --------------------------------------------------------
    int GET_URL_SEND_VARS_NONE = 0; // don't send variables
    int GET_URL_SEND_VARS_GET = 1; // send vars using GET
    int GET_URL_SEND_VARS_POST = 2; // send vars using POST
    int GET_URL_MODE_LOAD_MOVIE_INTO_LEVEL = 0;
    int GET_URL_MODE_LOAD_MOVIE_INTO_SPRITE = 1;
    int GET_URL_MODE_LOAD_VARS_INTO_LEVEL = 3;
    int GET_URL_MODE_LOAD_VARS_INTO_SPRITE = 4;

    void getURL(int sendVars, int loadMode) throws IOException;

    // --------------------------------------------------------
    void gotoFrame(boolean play) throws IOException;

    void setTarget() throws IOException;

    void getProperty() throws IOException;

    void setProperty() throws IOException;

    void cloneSprite() throws IOException;

    void removeSprite() throws IOException;

    void startDrag() throws IOException;

    void endDrag() throws IOException;

    void waitForFrame(String jumpLabel) throws IOException;

    void trace() throws IOException;

    void getTime() throws IOException;

    void randomNumber() throws IOException;

    // Flash 5 Actions
    void callFunction() throws IOException;

    void callMethod() throws IOException;

    void lookupTable(String[] values) throws IOException;

    // startFunction(..) is terminated by matching endBlock()
    void startFunction(String name, String[] paramNames) throws IOException;

    void endBlock() throws IOException;

    void defineLocalValue() throws IOException;

    void defineLocal() throws IOException;

    void deleteProperty() throws IOException;

    void deleteThreadVars() throws IOException;

    void enumerate() throws IOException;

    void typedEquals() throws IOException;

    void getMember() throws IOException;

    void initArray() throws IOException;

    void initObject() throws IOException;

    void newMethod() throws IOException;

    void newObject() throws IOException;

    void setMember() throws IOException;

    void getTargetPath() throws IOException;

    void startWith() throws IOException; // terminated by matching endBlock()

    void convertToNumber() throws IOException;

    void convertToString() throws IOException;

    void typeOf() throws IOException;

    void typedAdd() throws IOException;

    void typedLessThan() throws IOException;

    void modulo() throws IOException;

    void bitAnd() throws IOException;

    void bitOr() throws IOException;

    void bitXor() throws IOException;

    void shiftLeft() throws IOException;

    void shiftRight() throws IOException;

    void shiftRightUnsigned() throws IOException;

    void decrement() throws IOException;

    void increment() throws IOException;

    void duplicate() throws IOException;

    void returnValue() throws IOException;

    void swap() throws IOException;

    void storeInRegister(int registerNumber) throws IOException;

    void push(double value) throws IOException;

    void pushNull() throws IOException;

    void pushRegister(int registerNumber) throws IOException;

    void push(boolean value) throws IOException;

    void push(int value) throws IOException;

    void lookup(int dictionaryIndex) throws IOException;

    // Flash 6 Actions
    void instanceOf() throws IOException;

    void enumerateObject() throws IOException;

    void strictEquals() throws IOException;

    void greaterThan() throws IOException;

    void stringGreaterThan() throws IOException;
}
