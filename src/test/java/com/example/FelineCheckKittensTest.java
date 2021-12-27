package com.example;

import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FelineCheckKittensTest {
    private final int kittens;
    private final int expectedKittens;

    public FelineCheckKittensTest(int kittens, int expectedKittens) {
        this.kittens = kittens;
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters
    public static Object [][] getKittensData() {
        return new Object[][] {
                {1, 1},
                {0, 0},
                {2, 2},
                {5, 5},
                {8, 8},
        };
    }


    @Test
    public void checkKittens() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens(kittens);
        assertEquals(expectedKittens, actualKittens);
    }
}