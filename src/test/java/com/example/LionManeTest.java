package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String Sex;
    private final boolean Mane;
    Feline felineLion;

    public LionManeTest(String sex, boolean mane) {
        this.Sex = sex;
        this.Mane = mane;
    }

    @Parameterized.Parameters
    public static Object [][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkLion() throws Exception {
        Lion lion = new Lion(Sex, felineLion);
        boolean actualMane = lion.doesHaveMane();
        assertEquals(Mane, actualMane);

    }


}
