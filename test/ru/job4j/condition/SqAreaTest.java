package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void ifP6K2() {
        assertThat(SqArea.square(6,2), is(2.0));
    }
    @Test
    public void ifP4K1() {
        assertThat(SqArea.square(4,1), is(1.0));
    }
}