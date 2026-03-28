package CollectionAndGenerics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swaping {


    void main() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);
//        swap(list , 2 , 5);
//        System.out.println(list);
//     reverse(list);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y) {
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);


 }

        public static void reverse (List < Integer > list) {
//Collections.reverse(list);
            for (int i = 0; i < list.size() / 2; i++) {
                Swaping.swap(list, i, list.size() - 1 - i);
            }


        }

    }

