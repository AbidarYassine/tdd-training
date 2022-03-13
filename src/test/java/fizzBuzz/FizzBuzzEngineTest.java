package fizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzEngineTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldThrowExceptionWhenInputIs0() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(0));
    }

    @Test
    void shouldDisplay1WhenInputIs1() {
        FizzBuzzEngine.fizzBuzz(1);
        assertEquals("1", outputStreamCaptor.toString());

    }

    @Test
    void shouldDisplay1And2AndFizzWhenInput3() {
        FizzBuzzEngine.fizzBuzz(3);
        assertEquals("12Fizz", outputStreamCaptor.toString().trim());
    }

    @Test
    void shouldDisplay1And2AndFizzAnd4AndBuzzWhenInput5() {
        FizzBuzzEngine.fizzBuzz(5);
        assertEquals("12Fizz4Buzz", outputStreamCaptor.toString().trim());
    }

    @Test
    void shouldDisplay12Fizz4BuzzFizz7WhenInput7() {
        FizzBuzzEngine.fizzBuzz(7);
        assertEquals("12Fizz4BuzzFizz7", outputStreamCaptor.toString().trim());
    }

}