package com.company;

public class latihanoverloading {
//OVERLOADING
    public static void main (String[] args) {
        NamaSama(8);
        NamaSama(9,10);
        NamaSama(8d,10);
        NamaSama(8d,10d);
    }

    private static void NamaSama(int i){
        System.out.println(i);
    }

    private static void NamaSama(int i, int b){
        System.out.println(i + b);

    }

    private static void NamaSama(double d, double u){
        System.out.println(d + u);

    }

    private static void NamaSama(double d, int u){
        System.out.println(d * u);

    }
}
