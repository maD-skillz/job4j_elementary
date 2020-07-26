package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl1 = value / 70;
        return rsl1;
    }

    public static int rubleToDollar(int value) {
        int rsl2 = value / 60; /* формула перевода рублей в доллары. */
        return rsl2;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected1 = 2;
        int expected2 = 2;
        int out1 = rubleToEuro(in);
        boolean passed1 = expected1 == out1;
        int out2 = rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 Test result : " + passed1);
        System.out.println("140 rubles are 2 Test result : " + passed2);
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

    }
    }
