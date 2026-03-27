package Oops.Inheritance;

public class Vehicle {


    private int numbertOfWheels;


    public void setNumbertOfWheels(int numbertOfWheels) {
        this.numbertOfWheels = numbertOfWheels;
    }

    public void commute(){
        System.out.printf("i am going to a to b using %d tires\n ",numbertOfWheels);
    }

}
