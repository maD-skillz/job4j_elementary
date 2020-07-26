package ru.job4j.converter;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        Assert.assertEquals(expected, out);
        System.out.println("140 rubles are 2 Test result : " + passed);

    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        Assert.assertEquals(expected, out);
        System.out.println("180 rubles are 3 Test result : " + passed);
    }
}