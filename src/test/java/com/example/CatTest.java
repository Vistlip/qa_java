package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    @Mock
    Feline feline;

    @Test
    public void CheckGetSound() {
        String expectedSound = "Мяу";
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void CheckGetFood() throws Exception {
        List<String> expectedListFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(expectedListFood);
        List<String> actualListFood = cat.getFood();
        assertEquals(expectedListFood, actualListFood);
    }
}