package com.assessment;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class _04_Sample {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        Stream.generate(() -> "")
                .filter(notEmpty)
                .forEach(System.out::println);
    }
}
