package fizzBuzz;

import utils.NumberToListConverter;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {

    private FizzBuzzEngine() {
    }

    public static List<Object> fizzBuzz(int number) {
        List<Object> result = new ArrayList<>();
        List<Integer> listOfNumbers = NumberToListConverter.convert(number);
        listOfNumbers.forEach(el -> result.add(FizzBuzzConverter.convert(el)));
        return result;
    }
}
