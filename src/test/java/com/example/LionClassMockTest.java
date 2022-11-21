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
    public void lionGetKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expected = List.of("Животные",
                "Птицы",
                "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }

}