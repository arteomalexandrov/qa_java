package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatClassMockTest {

    @Mock
    Feline feline;

    @Test
    public void catGetSoundPositiveTest() {
        String expected = "Мяу";
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catGetSoundNegativeTest() {
        String expected = "Гав";
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void catGetFoodPositiveTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птица", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птица", "Рыба"));
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catGetFoodNegativeTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Трава", "Различные растения");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птица", "Рыба"));
        List<String> actual = cat.getFood();
        Assert.assertNotEquals(expected, actual);
    }

}
