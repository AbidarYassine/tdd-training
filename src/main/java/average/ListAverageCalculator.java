package average;

import java.util.List;

public class ListAverageCalculator {

    private ListAverageCalculator() {
    }

    public static Double calculateAverage(List<Double> numbers) {
        return numbers.stream().mapToDouble(el -> el).average().orElse(0d);
    }

    private static int a() {
        return 1;
    }

}
