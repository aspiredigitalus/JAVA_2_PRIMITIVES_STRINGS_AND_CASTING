package com.aspiredigital;

import com.aspiredigital.string.CustString;
import com.aspiredigital.primitive.Primitive;
import com.aspiredigital.casting.Casting;

public class Main {
    public static void main(String[] args) {
        // Use com.aspiredigital.string
        char[] arr = {'C','h','a','r',' ','A','r','r','a','y',' ','T','o',' ','S','t','r','i','n','g'};
        CustString cString = new CustString(arr);
        System.out.println(cString.toString());

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
        float f = 5.750000f;
        primitive.describeFloat(f);
        double d = 19.990000;
        primitive.describeDouble(d);
        char c = 'A';
        primitive.describeChar(c);


        // Use casting methods
        Casting casting = new Casting();
        int i1 = 100;
        casting.implicitCasting(i1);
        double d1 = 99.99;
        casting.explicitCasting(d1);
        i1 = 130;
        casting.dataLossCasting(i1);
        char c1 = 'Z';
        casting.charToIntCasting(c1);
        i1 = 66;
        casting.intToCharCasting(i1);



    }
}
