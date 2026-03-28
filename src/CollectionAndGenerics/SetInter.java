package CollectionAndGenerics;

import java.util.HashSet;
import java.util.Set;

public class SetInter {


    public static void main(String[] args) {


        Set<String>  names= new HashSet<>();

        names.add("shubham");
        names.add("shu");
        names.add("bham");

        Utility.print(names);

        System.out.println(names.add("shubham"));
    }
}
