package com.aspiredigital.casting;

public class Casting {

    // Implicit casting (widening)
    public void implicitCasting(int num) {
        double widened = num; // int to double
        System.out.printf("Implicit Casting: int (%d) -> double (%.2f)%n", num, widened);
    }

    // Explicit casting (narrowing)
    public void explicitCasting(double num) {
        int narrowed = (int) num; // double to int
        System.out.printf("Explicit Casting: double (%.2f) -> int (%d)%n", num, narrowed);
    }

    // Casting with potential data loss
    public void dataLossCasting(int num) {
        byte narrowed = (byte) num; // int to byte
        System.out.printf("Data Loss Casting: int (%d) -> byte (%d)%n", num, narrowed);
    }

    // Casting between char and int
    public void charToIntCasting(char c) {
        int ascii = c; // char to int (ASCII value)
        System.out.printf("Char to Int Casting: char ('%c') -> int (%d)%n", c, ascii);
    }

    public void intToCharCasting(int num) {
        char c = (char) num; // int to char
        System.out.printf("Int to Char Casting: int (%d) -> char ('%c')%n", num, c);
    }
}
