package point;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class PointDistanceCalculatorTest {

    @Test
    public void calculateDistanceShouldReturn0WhenPointsAreIdentical() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 1);

        Double result = PointDistanceCalculator.calculateDistance(a, b);
        assertEquals(Double.valueOf(0.0), result);
    }

    @Test
    public void calculateDistanceShouldReturnAbsoluteValueOfXWhenOnePointIsTheOriginAndTheOtherIsOnXaxis(){
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);

        Double result = PointDistanceCalculator.calculateDistance(a, b);

        assertEquals(Double.valueOf(3), result);
    }

    @Test
    public void calculateDistanceShouldReturnAbsoluteValueOfXWhenOnePointIsTheOriginAndTheOtherIsOnXaxisAndItsNegative(){
        Point a = new Point(0, 0);
        Point b = new Point(-3, 0);

        Double result = PointDistanceCalculator.calculateDistance(a, b);

        assertEquals(Double.valueOf(3), result);
    }

    @Test
    public void calculateDistanceShouldReturnAbsoluteValueOfXWhenOnePointIsTheOriginAndTheOtherIsOnYaxis(){
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);

        Double result = PointDistanceCalculator.calculateDistance(a, b);

        assertEquals(Double.valueOf(3), result);
    }

    @Test
    public void calculateDistanceShouldReturn1WhenBetween22And21(){
        Point a = new Point(2, 2);
        Point b = new Point(2, 1);

        Double result = PointDistanceCalculator.calculateDistance(a, b);

        assertEquals(Double.valueOf(1), result);
    }

    @Test
    public void calculateDistanceShouldReturn2WhenBetween11And31(){
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);

        Double result = PointDistanceCalculator.calculateDistance(a, b);

        assertEquals(Double.valueOf(2), result);
    }

}
