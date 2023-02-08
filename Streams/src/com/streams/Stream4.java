package com.streams;
import java.io.IOException;
import java.util.stream.IntStream;

public class Stream4 {
    public static void main(String[] args) throws IOException {
        IntStream
            .range(1, 10)
            .skip(5)
            .forEach(x -> System.out.println(x));
        System.out.println();
    }
}
