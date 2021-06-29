package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        airbus.printModel();
        airbus.printCountEngine();
        System.out.println(airbus);

        airbus.setName("A380");
        airbus.printModel();
        airbus.setCountEngine(4);
        airbus.printCountEngine();
        System.out.println(airbus);
    }
}