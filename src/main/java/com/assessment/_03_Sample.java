package com.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _03_Sample {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        IntStream.range(0,100)
                .parallel()
                .forEach((s) -> data.add(s));

        System.out.println(data.size());

    }
}