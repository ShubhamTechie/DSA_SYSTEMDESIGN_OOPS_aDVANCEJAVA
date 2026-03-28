package CollectionAndGenerics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequwncy {


    void main(){
        List<Integer> lsit = Arrays.asList(1,1,4,6,8,5,5);
        System.out.println(Collections.frequency(lsit,1));
        System.out.println(Collections.frequency(lsit,5));
    }
}
