package com.company;

public class LatihanMethod {
    public static void main (String[] args) {

        iniMethodKu();
        iniMethodKuu();
        helo("Namaku Adalah SUpriyanto");
        myFloat(2f);
        myDouble(34d,33d);

        System.out.println("Nilaiku" + myChar('B'));


    }

    private static void iniMethodKu() {
        System.out.println("Halo ini Methodku");
    }

    private static int iniMethodKuu() {
        System.out.println(1200);

        return 1;

    }

    private static String helo(String supriyanto) {
        System.out.println(supriyanto);

        return supriyanto;
    }

    private static float myFloat(float f){
        System.out.println(f);

        return f;
    }

    private static void myDouble(double i, double g) {
        System.out.println(i + g);
    }

    private static char myChar(char nilaiku){

        return nilaiku;

    }


}
