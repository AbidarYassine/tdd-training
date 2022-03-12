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

    @Test
    void shouldReturnListContains12345WhenInputIs5() {
        List<Integer> result = NumberToListConverter.convert(5);
        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void shouldReturnListContains1to10WhenInputIs10() {
        List<Integer> result = NumberToListConverter.convert(10);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result);
    }

}