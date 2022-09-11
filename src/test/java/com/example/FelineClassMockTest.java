package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineClassMockTest {

    @Test
    public void felineGetFamilyPositiveTest() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void felineGetFamilyNegativeTest() {
        String expected = "Псовые";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        System.out.println(actual);
        Assert.assertNotEquals(expected, actual);
    }



//    @Mock
//    KittensCount kittensCount;
//
//    @Test
//    public void test() {
//        Feline feline = new Feline(kittensCount);
//        Mockito.when(feline.getKittens(1)).thenReturn(1);
//				/* Теперь стаб будет выводить 5, только если переданы аргументы 2 и 2.
//				Иначе - 0 */
//        System.out.println(car.getWheelsCount(2,2)); // выведется 5
//    }

    @Mock
    Feline feline;

    @Test
    public void felineEatMeat() throws Exception {
       //Cat cat = new Cat(feline);
        List<String> expected = List.of("Хищник");
        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));
        List<String> actual = feline.eatMeat();
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

}
