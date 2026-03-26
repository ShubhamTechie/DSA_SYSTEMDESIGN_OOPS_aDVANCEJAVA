package BasicTopics;

public class Course {

    static int maxCapacity;

    String courseName;


    int enrollments;

    String[] enrolledStudents;


    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;

    }

    void unEnrollStudent(String studentName) {
        System.out.println("student remove");
        enrollments--;
    }

}
