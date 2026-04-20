package FunctionalPrograaming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestingFillterReduce {

    public static void main(String[] args) {


//        List<String> fruits = List.of("apple","mango","graps","banana");
//
//        fruits.stream()
//                .filter(fruit -> fruit.endsWith("e"))
//                .forEach(fruit -> System.out.println(fruit));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
       int newSum =  numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });
        System.out.println(newSum);
    }
}
