package CollectionAndGenerics.Challenges;

import CollectionAndGenerics.Utility;

import java.lang.classfile.attribute.ModuleAttribute;

public class VarRGS {



    public static void concate(String... values){
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println() ;
    }

    public static void main(String[] args) {
        concate("a","b");
        concate("shubham","sahu","8602828320323401" , "soubhgya nagar semara");


    }


}
