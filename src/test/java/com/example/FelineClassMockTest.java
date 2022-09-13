package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineClassMockTest {

    @Test
    public void felineGetFamilyPositiveTest() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void felineGetFamilyNegativeTest() {
        String expected = "Псовые";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void felineGetKittensPositiveTest() {
        int expected = 1;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensNegativeTest() {
        int expected = 2;
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void felineGetKittensKittensPositiveTest() {
        int expected = 10;
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensKittensNegativeTest() {
        int expected = 2;
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        Assert.assertNotEquals(expected, actual);
    }

}
