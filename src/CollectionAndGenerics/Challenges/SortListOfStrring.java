package CollectionAndGenerics.Challenges;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfStrring {
    void main() {


        List<String> list = Arrays.asList("shubham", "sahu", "abc");
        sortInDecen(list);
        System.out.println(list);
    }


    public static void sortInDecen(List<String> stringListlist) {
        Collections.sort(stringListlist);

    }
}