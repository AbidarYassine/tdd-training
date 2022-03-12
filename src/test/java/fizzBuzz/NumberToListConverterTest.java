package fizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import utils.NumberToListConverter;

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

}