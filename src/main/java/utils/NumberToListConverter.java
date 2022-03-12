package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NumberToListConverter {
    private NumberToListConverter() {
    }

    public static List<Integer> convert(int i) {
        List<Integer> result = new ArrayList<>();
        if (i == 0) throw new IllegalArgumentException("Number equal to 0");
        if (i < 0) throw new IllegalArgumentException("Number is negative");
        IntStream.range(1, i + 1).forEach(result::add);
        return result;

    }
}
