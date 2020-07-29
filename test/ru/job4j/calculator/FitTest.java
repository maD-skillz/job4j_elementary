package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight187() {
        double in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight187() {
        double in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}