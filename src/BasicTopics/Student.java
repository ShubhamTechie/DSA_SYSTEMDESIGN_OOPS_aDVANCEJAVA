package BasicTopics;

public class Student {

    String name;

    int age;

    String rollNumber;

    String houseNo;

    public Student(String name, int age, String rollNumber, String houseNo) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "student details : {name :" + name + " ,age :" + age
                + " ,roll Number : " + rollNumber
                + " ,HouseNo : " + houseNo + "}";
    }

    public static void main(String[] args) {
        Student st = new Student("SHUBHAM", 30, "001", "SHIBK");
        System.out.println(st);
    }

}
