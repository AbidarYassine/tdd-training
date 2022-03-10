package average;

import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ListAverageCalculatorTest {


    @Test
    void shouldReturn5(){
        List<Double> numbers =List.of(5d,6d);
        Double average = ListAverageCalculator.calculateAverage(numbers);
        assertEquals(5.5,average);
    }

}