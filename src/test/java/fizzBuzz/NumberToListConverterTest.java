package fizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import utils.NumberToListConverter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberToListConverterTest {


    @Test
    void shouldThrowExceptionWhenInputsIs0() {
        Executable executable = () -> NumberToListConverter.convert(0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, executable);
        assertEquals("Number equal to 0", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenInputsIsNegative() {
        Executable executable = () -> NumberToListConverter.convert(-1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, executable);
        assertEquals("Number is negative", exception.getMessage());
    }

    @Test
    void shouldReturnListContains1WhenInputIs1() {
        List<Integer> result = NumberToListConverter.convert(1);
        assertEquals(List.of(1), result);
    }

}