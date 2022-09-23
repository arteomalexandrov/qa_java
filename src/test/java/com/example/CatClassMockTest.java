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
    public void catGetSoundTest() {
        String expected = "Мяу";
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птица", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }

}