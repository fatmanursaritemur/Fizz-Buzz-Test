package com.fatmanur.unittest.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenDividedByThree()
    {
        Assertions.assertEquals("Fizz", fizzbuzz.FizzBuzzfornumber(3),"number can divided by 3");
    }

    @Test
    void returnBuzzWhenDividedByFive()
    {

        Assertions.assertEquals("Buzz", fizzbuzz.FizzBuzzfornumber(5),"number can divided by 5");
    }

    @Test
    void returnFizzBuzzWhenDividedByFiveAndThree()
    {

        Assertions.assertEquals("FizzBuzz", fizzbuzz.FizzBuzzfornumber(15),"number can divided by 15");
    }

    @Test
    void returnItselfWhenNotDividedByFiveOrThree()
    {

        Assertions.assertEquals("23", fizzbuzz.FizzBuzzfornumber(23),"number can not divided by 5 or 3");
    }

    @Test
    void throwIllegalArgumentExceptionWhenNumberIsNotBetweenOneAndHundred()
    {

        Assertions.assertThrows(IllegalArgumentException.class, ()->fizzbuzz.FizzBuzzfornumber(-5),"Number is not between one and hundred");
        Assertions.assertThrows(IllegalArgumentException.class, ()->fizzbuzz.FizzBuzzfornumber(105),"Number is not between one and hundred");

    }
}
