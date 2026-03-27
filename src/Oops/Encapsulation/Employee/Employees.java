package Oops.Encapsulation.Employee;

public class Employees {
    private String name;
    private int age;
    private String salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employees(String name, int age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

}
        String displayEmployeeDetails () {
            return "employee details :" + name + "  , age : "
                    + age + " ,salaey : " + salary;
        }

    }

