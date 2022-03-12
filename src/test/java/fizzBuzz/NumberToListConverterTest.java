package fizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import utils.NumberToListConverter;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberToListConverterTest {


    @Test
    void shouldThrowExceptionWhenInputsIs0() {
        Executable executable = () -> NumberToListConverter.convert(0);
        assertThrows(IllegalArgumentException.class, executable);
    }

}