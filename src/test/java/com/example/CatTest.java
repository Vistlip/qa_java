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
    Predator predator;

    @Test
    public void checkGetSound() {
        String expectedSound = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void checkGetFood() throws Exception {
        List<String> expectedListFood = Arrays.asList("Животные", "Птицы", "Рыба");
        String Cat = "Хищник";
        Mockito.when(predator.eatMeat()).thenReturn(expectedListFood);
        List<String> actualListFood = predator.eatMeat();
        assertEquals(expectedListFood, actualListFood);
    }
}