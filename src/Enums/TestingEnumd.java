package Enums;

public class TestingEnumd {


    public static void main(String[] args) {
//        TrafficLight color = TrafficLight.RED;


        System.out.println("print all days of week");


        for (Day day : Day.values()) {
            System.out.printf("%s : %s \n ",day ,day.getType());
            
        }

    }
}
