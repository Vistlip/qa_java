package com.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class AnimalTest {

    @Test
    public void checkGetFoodPredator() throws Exception {
        List<String> expectedListFoodPredator = Arrays.asList("Животные", "Птицы", "Рыба");
        Animal animal = new Animal();
        List<String> actualListFoodPredator = animal.getFood("Хищник");
        Assert.assertEquals(expectedListFoodPredator,
                actualListFoodPredator);
    }

    @Test
    public void checkGetFoodHerbivores() throws Exception {
        List<String> expectedListFoodHerbivores = Arrays.asList("Трава", "Различные растения");
        Animal animal = new Animal();
        List<String> actualListFoodHerbivores = animal.getFood("Травоядное");
        Assert.assertEquals(expectedListFoodHerbivores, actualListFoodHerbivores);
    }

    @Test
    public void checkGetFamily() {
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String actualFamily = animal.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }
}