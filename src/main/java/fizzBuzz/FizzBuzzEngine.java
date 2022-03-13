package fizzBuzz;

import utils.NumberToListConverter;

public class FizzBuzzEngine {

    private FizzBuzzEngine() {
    }

    public static void fizzBuzz(int number) {
        NumberToListConverter.convert(number).forEach(el -> System.out.print(FizzBuzzConverter.convert(el)));
    }
}
