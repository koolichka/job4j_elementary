package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax33() {
        int first = 6;
        int second = 2;
        int third = 33;
        int result = Max.max(first, second, third);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax65() {
        int first = 65;
        int second = 7;
        int third = 64;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 65;
        Assert.assertEquals(result, expected);
    }
}