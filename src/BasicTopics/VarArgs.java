package BasicTopics;

public class VarArgs {

    public static void main(String... args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5 ,6));
        System.out.println(sum(4,5,8,7,5,9));
    }

public static int sum(int... a){
    int sum = 0;
        for (int i : a) {

         sum = sum+i;
    }return sum;
}

}
