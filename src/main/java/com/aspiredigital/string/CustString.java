/*
Name: CustString
Description: A custom string class that encapsulates a character array and provides a toString method.
Author: Aspiredigital
 */

package com.aspiredigital.string;

public class CustString {
    private final char[] characters;

    // Constructor
    public CustString(char[] characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return new String(this.characters);
    }
}
