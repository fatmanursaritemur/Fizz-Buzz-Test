package com.fatmanur.unittest.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {
     static String FizzBuzzfornumber(int number)
    {
        if(number>=1 && number<=100)
    return number % 3== 0 ? (number % 5 == 0 ? "FizzBuzz" : "Fizz") : (number % 5 == 0 ? "Buzz" : String.valueOf(number));
        else
            throw new IllegalArgumentException();
    }
}
