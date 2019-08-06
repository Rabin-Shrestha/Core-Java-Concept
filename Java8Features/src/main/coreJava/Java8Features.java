package main.coreJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) {
        //OptionalJava8();

        // Some Stream Work
        IntStream myIntStream = IntStream.range(1, 20);
        List<Integer> sortedReverse = myIntStream.boxed().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(sortedReverse);
        Collections.sort(sortedReverse, Comparator.comparing(a-> a.intValue()));
        Collections.sort(sortedReverse, Integer::compareTo);

        String[] stringArray = { "Barbara", "James", "Mary",
                "John", "Patricia", "Robert", "Michael", "Linda" };


        Arrays.sort(stringArray, String::compareToIgnoreCase);

        System.out.println(IntStream.range(1, 5).sum());
        System.out.println(IntStream.range(1, 5).reduce(100,(a,b)-> a+b));

        // Local Date and Time
        LocalDateTime timePoint = LocalDateTime.now( ); // The current date and time
        LocalDate myLocalDate = LocalDate.now().plusDays(10);

        List<String> myList = List.of(stringArray);
        long count = myList.parallelStream()
                .peek(a-> System.out.println("Processing "+a + " "+a.length()))
                .map(a-> a.toUpperCase())
                .peek(a-> System.out.println("Upper Case: "+a))
                .map(a-> a.length())
                .filter(a-> a>5)
                .count();

        System.out.println("Name length greater than 5 is: "+ count);

    }

    private static void OptionalJava8() {
        //  Working with Optional
        String answer1 = "Yes";
        String answer2 = null;
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        Optional<Integer> optionalResult = Stream.of(1, 2, 5, 4, 6, 9, 3).filter(x -> x > 15).findAny();
        optionalResult.ifPresent(x -> System.out.println(x));
        Integer finalResultOrDefault = optionalResult.orElse(0);
        System.out.println("OPtional Result is" + optionalResult);
    }
}
