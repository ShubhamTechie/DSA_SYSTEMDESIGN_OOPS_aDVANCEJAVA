package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestingList {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        //use these two way to create list
        List<String> str4 = new LinkedList<>();

        List<Integer> in = Arrays.asList(1, 2, 3);

        List<String> str2 = List.of("shubham", "ram", "shyam");

        str.add("shubham");
        str.add("sahu");
        str4.add("my name is shubham sahu");
//
//        for (int i=0; i < str.size(); i++){
//            System.out.print(str.get(i));
//        }
        System.out.println(str);
        str.add(1 , "patiram sahu");
        System.out.println(str);
        str.remove(0);
        System.out.println(str);

        if (str.contains("patiram sahu")){
            System.out.println(str.indexOf("patiram sahu"));
        }
        System.out.println(str);

//        System.out.println(str);
//        System.out.println(str4);
//        System.out.println(str2);
//        System.out.println(in);
    }
}
