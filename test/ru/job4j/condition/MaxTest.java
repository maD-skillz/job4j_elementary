package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1,2), is(2));
    }

    @Test
    public void whenMax7To1Then7() {
        assertThat(Max.max(7,1), is(7));
    }

    @Test
    public void whenMax4To4Then4() {
        assertThat(Max.max(4,4), is(4));
    }
}