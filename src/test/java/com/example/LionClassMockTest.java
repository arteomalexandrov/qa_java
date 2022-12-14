package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionClassMockTest {

    @Mock
    Feline feline;

    @Test
    public void checkHasManeTrueWhenSexLionMaleTest() throws Exception {
        Lion lion = new Lion("Самец");
        boolean hasMane = lion.doesHaveMane();
        Assert.assertTrue(hasMane);
    }

    @Test
    public void checkHasManeFalseWhenSexLionFemaleTest() throws Exception {
        Lion lion = new Lion("Самка");
        boolean hasMane = lion.doesHaveMane();
        Assert.assertFalse(hasMane);
    }

    @Test
    public void lionGetKittensPositiveTest() {
        Lion lion = new Lion(feline);
        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetKittensNegativeTest() {
        Lion lion = new Lion(feline);
        int expected = 2;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void lionGetFoodPositiveTest() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodNegativeTest() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Трава", "Различные растения");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertNotEquals(expected, actual);
    }

}

