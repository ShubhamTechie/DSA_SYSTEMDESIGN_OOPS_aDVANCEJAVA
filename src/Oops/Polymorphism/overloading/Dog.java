package Oops.Polymorphism.overloading;

public class Dog {

    public void bark() {
        System.out.println("woof");
    }

    public void bark(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("woof:");
        }
    }

    public static void main(String[] args) {
        Dog d=new Dog();

        d.bark(5);
    }
}