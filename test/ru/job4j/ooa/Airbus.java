package ru.job4j.ooa;

public class Airbus extends Aircraft {
    private static int DEFAULT_COUNT_ENGINE;

    public void setCountEngine(int DEFAULT_COUNT_ENGINE) {
        this.DEFAULT_COUNT_ENGINE = DEFAULT_COUNT_ENGINE;
    }

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + DEFAULT_COUNT_ENGINE);
        }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}