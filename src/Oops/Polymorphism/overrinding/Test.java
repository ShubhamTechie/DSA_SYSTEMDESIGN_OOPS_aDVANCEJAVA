package Oops.Polymorphism.overrinding;

public class Test {


    public static void main(String[] args) {

        Vehicle vh = new Vehicle();
        Car cr = new Car();

        vh.service();
        cr.service();
    }
}
