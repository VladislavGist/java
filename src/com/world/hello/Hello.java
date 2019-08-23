package com.world.hello;

public class Hello {
    public static void main(String[] args) {
        byte b1 = 127;
        short s1 = 32000;
        char c1 = 'F';
        int i1 = 64000;
        long l1 = 123_123_123;
        float f1 = 1.0f;
        double d1 = 34.32;

        System.out.println(l1);

        d1 = l1;

        System.out.println(d1);
    }
}
