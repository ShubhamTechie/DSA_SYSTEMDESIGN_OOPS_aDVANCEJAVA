package Oops.Abstraction.area;

public class TestShape {

    public static void main(String[] args) {

Circle cir =new Circle(5);
Square sq =new Square(5);

        System.out.println(cir.calculateArea());
        System.out.println(sq.calculateArea());
    }
}
