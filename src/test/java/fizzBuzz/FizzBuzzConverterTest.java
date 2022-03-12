package fizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void shouldReturnFizzWhenInputIs3AndWhenInputIsMultipleOf3(int number) {
        String result = FizzBuzzConverter.convert(number);
        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 55})
    void shouldReturnFizzWhenInputIs5AndWhenInputIsMultipleOf5(int number) {
        String result = FizzBuzzConverter.convert(number);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void shouldReturnFizzWhenInputIs15AndWhenInputIsMultipleOf15(int number) {
        String result = FizzBuzzConverter.convert(number);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnNumberWhenInputIsNormalNumber() {
        String result = FizzBuzzConverter.convert(1);
        assertEquals("1", result);
    }


}