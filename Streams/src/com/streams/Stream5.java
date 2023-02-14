package com.streams;
import java.util.*;

class Stream5 {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
  
        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}