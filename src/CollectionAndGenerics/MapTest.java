package CollectionAndGenerics;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {


    public static void main(String[] args) {

        Map<String ,String>  countryMap = new HashMap<>();

        countryMap.put("Bharat" , "NewDEHI");
        countryMap.put("PAKIUSTAN" , "ISLAMABAD");
        countryMap.put("CHINA" , "BIJING");
        countryMap.put("SRILNKA" , "COLOMBO");
        countryMap.put("SPAIN" , "MADRID");

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter country name");
//        String country = input.next();
//        if (countryMap.containsKey(country)) {
//            System.out.printf("capital of %s is %s", country, countryMap.get(country));
//        }
//                else{
//            System.out.println("sorry we dont know the capital");
//                }

//        countryMap.forEach((key , value) -> {
//            System.out.println(key + " -> " + value);
//        });
//

        for (Map.Entry<String,String> entry : countryMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }



//        for (String value : countryMap.values()) {
//            System.out.println(value);
//        }
            }
        }

