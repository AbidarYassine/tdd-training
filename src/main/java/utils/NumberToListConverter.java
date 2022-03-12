package utils;

import java.util.List;

public class NumberToListConverter {
    public static List<Integer> convert(int i) {
        if (i == 1) return List.of(1);
        if (i == 0) throw new IllegalArgumentException("Number equal to 0");
        throw new IllegalArgumentException("Number is negative");

    }
}
