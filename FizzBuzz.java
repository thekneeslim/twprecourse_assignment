package com.company;

/**
 * Created by hiko_seijuro1000 on 3/2/17.
 */
public class FizzBuzz {
    public void fizzBuzz(int arg) {
        for (int i = 1; i <= arg; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
