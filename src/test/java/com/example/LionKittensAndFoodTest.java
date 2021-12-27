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
public class LionKittensAndFoodTest extends TestCase {
    @Mock
    Feline feline;
    private static final String sexLion = "Самец";


    @Test
    public void checkGetKittensForLion() throws Exception {
        int expectedKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);
        Lion lion = new Lion("Самка", feline);
        int actualKittensCount = lion.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void checkGetFoodForLion() throws Exception{
        List<String> expectedListFood = Arrays.asList("Животные", "Птицы", "Рыба");
        String Cat = "Хищник";
        Mockito.when(feline.getFood(Cat)).thenReturn(expectedListFood);
        List<String> actualListFood = feline.getFood(Cat);
        assertEquals(expectedListFood, actualListFood);

    }

}