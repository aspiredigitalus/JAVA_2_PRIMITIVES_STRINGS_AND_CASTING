package com.aspiredigital.primitive;

public class Primitive {
    public void describeByte(byte b) {
        System.out.printf("Byte: 8-bit (-128 - 127), example: %d%n", b);
    }

    public void describeShort(short s) {
        System.out.printf("Short: 16-bit (-32,768 - 32,767), example: %d%n", s);
    }

    public void describeInt(int i) {
        System.out.printf("Int: 32-bit (-2,147,483,648 - 2,147,483,647), example: %d%n", i);
    }

    public void describeLong(long l) {
        System.out.printf("Long: 64-bit (-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807), example: %d%n", l);
    }

    public void describeFloat(float f) {
        System.out.printf("Float: 32-bit ~7 digit precision, example: %f%n", f);
    }

    public void describeDouble(double d) {
        System.out.printf("Double: 64-bit ~15 digit precision, example: %f%n", d);
    }

    public void describeChar(char c) {
        System.out.printf("Char: 16-bit Unicode character, example: %c%n", c);
    }

    public void describeBoolean(boolean bool) {
        System.out.printf("Boolean: true or false, example: %b%n", bool);
    }
}
