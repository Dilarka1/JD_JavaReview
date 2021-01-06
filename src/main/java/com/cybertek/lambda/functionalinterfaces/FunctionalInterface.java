package com.cybertek.lambda.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {      //always only one method

    public static void main(String[] args) {
            // Inbuilt Interfaces

        //Accepts a single parameter and returns a single value  (Function interface  - apply() )
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(10));

        //Does not accept any arguments and returns an object  (Supplier interface - get() )
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        //Accepts a single argument and does not return any result  (Consumer interface  - accept() )
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);

        //Accepts a single argument and returns true or false       (Predicate interface  - test() )
        Predicate<Integer> lesserThan = i -> (i < 10);
        System.out.println(lesserThan.test(5));
    }
}