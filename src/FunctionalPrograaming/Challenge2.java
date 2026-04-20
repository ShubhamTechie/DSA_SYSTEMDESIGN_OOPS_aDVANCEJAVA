package FunctionalPrograaming;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {


        List<String> chart = List.of("Abgvh cgasdfhgjhd", "Bj hgdsfgj", "Cjhfd sjhfjhdshgf", "Dhgfdh", "hgfhR");

//        chart.stream().forEach(ch -> System.out.println(ch));
       String result = chart.stream().filter(str -> str.length() > 10)
                .reduce("",(a,b) -> a+" " + b);

        System.out.println(result);
    }
}
