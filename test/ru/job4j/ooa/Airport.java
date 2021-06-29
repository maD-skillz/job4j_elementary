package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        airbus.printModel();
        airbus.printCountEngine();

        final Airbus airbus2 = new Airbus("A380");
        airbus2.printModel();
        airbus2.printCountEngine();
    }
}