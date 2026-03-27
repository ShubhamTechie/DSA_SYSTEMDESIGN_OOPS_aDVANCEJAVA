package Oops.Inheritance;

public class TestInheritance {


    public static void main(String[] args) {

        Vehicle vh = new Vehicle();
        TwoWheels two =new TwoWheels();
        MotorCycle motor=new MotorCycle();

      vh.setNumbertOfWheels(2);
        two.commute();
        motor.start();


    }
}
