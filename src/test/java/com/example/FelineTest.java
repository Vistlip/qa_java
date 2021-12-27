package com.example;



import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FelineTest {


    @Test
    public void checkEatMeat() throws Exception{
        List<String> expectedListFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> actualListFood = feline.eatMeat();
        Assert.assertEquals(expectedListFood, actualListFood);
    }

    @Test
    public void checkGetFamily() {
        String expectedFamily = "Кошачьи";
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }



    @Test
    public void checkDefaultGetKittens() {
        int expectedKittens = 1;
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);

    }
}