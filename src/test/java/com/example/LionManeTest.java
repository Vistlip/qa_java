package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {
    private final String sex;
    private final boolean mane;
    Feline felineLion;

    public LionManeTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object [][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void CheckLion() throws Exception {
        Lion lion = new Lion(sex, felineLion);
        boolean actualMane = lion.doesHaveMane();
        assertEquals(mane, actualMane);

    }


}
