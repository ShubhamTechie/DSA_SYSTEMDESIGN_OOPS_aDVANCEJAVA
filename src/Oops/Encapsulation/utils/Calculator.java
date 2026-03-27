package Oops.Encapsulation.utils;

import Oops.Encapsulation.geometry.Circle;
import Oops.Encapsulation.geometry.Rectangle;

public class Calculator {


    public static void main(String[] args) {

        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10 , 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);

        double recArea = rec.width * rec.langth;

        System.out.printf("Area of circle is %f , Area of rectangle is %f ",cirArea,recArea);
    }
}
