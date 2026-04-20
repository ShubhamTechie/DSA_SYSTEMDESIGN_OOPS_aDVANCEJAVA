package FunctionaLInterface;

import java.util.stream.IntStream;

public class Fact {


    public static void main(String[] args) {

        int number = 9;
        IntStream.rangeClosed(2, number)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }
}
