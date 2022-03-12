package fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzEngineTest {

    @Test
    void shouldThrowExceptionWhenInputIs0() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(0));
    }

    @Test
    void shouldReturnListContaining1WhenInputIs1() {
        assertEquals(List.of("1"), FizzBuzzEngine.fizzBuzz(1));
    }

    @Test
    void shouldReturnListOf1And2AndFizzWhenInput3() {
        assertEquals(List.of("1", "2", "Fizz"), FizzBuzzEngine.fizzBuzz(3));
    }

    @Test
    void shouldReturnListOf1And2AndFizzAnd4AndBuzzWhenInput5() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), FizzBuzzEngine.fizzBuzz(5));
    }

}