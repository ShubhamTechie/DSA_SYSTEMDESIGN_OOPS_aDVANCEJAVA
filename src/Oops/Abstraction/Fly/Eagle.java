package Oops.Abstraction.Fly;

public class Eagle extends Bird {


    protected Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("eagle is flying");
    }
}
