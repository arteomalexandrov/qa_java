package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String sex;
    private boolean result;

    public ParameterizedTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkHasManeResultWhenSexLion() throws Exception {
        Lion lion = new Lion(sex);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(result, hasMane);
    }
}