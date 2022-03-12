package fizzBuzz;

public class FizzBuzzConverter {


    public String convert(int i) {
        if (i % 15 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        return "Buzz";
    }
}
