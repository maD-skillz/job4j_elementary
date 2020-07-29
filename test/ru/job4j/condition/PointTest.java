package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void distance() {
        assertThat(Point.distance(0, 0, 2, 0), is(1.189207115002721)); }
}