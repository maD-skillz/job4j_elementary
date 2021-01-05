package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        double result = Max.max(5, 10, 15, 8);
        assertThat(result, is(15.0));
    }

    @Test
    public void whenMax1To2Then15() {
        double result = Max.max(8, 12, 28, 18);
        assertThat(result, is(28.0));
    }
}
