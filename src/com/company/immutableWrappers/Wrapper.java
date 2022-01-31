package com.company.immutableWrappers;

public class Wrapper {
    public static void main(String[] args) {
        int wholeNumber = 5;
        Integer wholeNumber2 = 5;
        Long largeWholeNumber = 5000000000l;

        Double decimal = 5.493;
        Character letter = 'b';
        String a ="hi";
        String b = a;
        b = "hello";
        System.out.println(a+" "+ b);
        Integer c =2;
        Integer x =c;
        x =3;
        System.out.println(c + " "+ x);
        int f =1;
        int h = f;
        h=0;
        System.out.println(f + " " + h);
    }
}
