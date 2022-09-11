package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class ParameterizedTest {
}

@RunWith(Parameterized.class)
public class CheckIsSex {

    private String sex;
    private boolean result;

    public void CheckIsSexTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Он", true},
                {"Она", false},
                {"Оно", false},
        };
    }

    @Test
    public void checkIsSexWhenSexThenResult() {
        HasMane hasMane = new HasMane();
        // Передай сюда возраст пользователя
        boolean isSex = hasMane.checkIsSex(sex);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Если пол мужской, будет true, иначе false", result, isSex);
    }
}
