package FunctionaLInterface;

public class Test {


    public static void main(String[] args) {

        Truth can = num -> {

            for (int i = 2; i <num ; i++) {
                if (num % i == 0){
                    return  false;
                }

            }
return true;

        };
        System.out.println(can.isCandidate(5));
    }
}
