package com.aspiredigital;

import com.aspiredigital.string.CustString;
import com.aspiredigital.primitive.Primitive;

public class Main {
    public static void main(String[] args) {
        // Use com.aspiredigital.string
        char[] charArray = {'C', 'h', 'a', 'r', ' ', 'A', 'r', 'r', 'a', 'y', ' ', 'T', 'o', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
        System.out.println(new CustString(charArray));

        // Use com.aspiredigital.primitive
        Primitive primitive = new Primitive();

        byte b = 10;
        primitive.describeByte(b);

        short s = 300;
        primitive.describeShort(s);

        int i = 20000;
        primitive.describeInt(i);

        long l = 900000L;
        primitive.describeLong(l);

        float f = 5.75f;
        primitive.describeFloat(f);

        double d = 19.99;
        primitive.describeDouble(d);

        char c = 'A';
        primitive.describeChar(c);

        boolean bool = true;
        primitive.describeBoolean(bool);


    }
}
