package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {


    @Test
    void shouldReturnFizzWhenInputIs3(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(3);
        assertEquals("Fizz",result);
    }

    @Test
    void shouldReturnBuzzWhenInputIs5(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(5);
        assertEquals("Buzz",result);
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIs15(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result=fizzBuzzConverter.convert(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    void shouldReturnFizzWhenInputIsMultipleOf3(){
        FizzBuzzConverter fizzBuzzConverter=new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(6);
        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsMultipleOf15() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsMultipleOf5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(10);
        assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnNumberWhenInputIsNormalNumber() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(1);
        assertEquals("1", result);
    }


}