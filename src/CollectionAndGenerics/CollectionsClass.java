package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {


    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(2558865);
        numList.add(255886);
        numList.add(25588);
        numList.add(2558);
        numList.add(255);
        numList.add(25);

        Collections.sort(numList);
        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);
    }

}
