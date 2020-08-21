package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Egor Popov";
        names[2] = "Jason Statham";
        names[3] = "Vin Diesel";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
