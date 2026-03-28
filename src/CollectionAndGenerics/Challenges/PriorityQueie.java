package CollectionAndGenerics.Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueie {

void main(){

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

queue.offer(new Student("shubham",'B'));
queue.offer(new Student("shu",'A'));
queue.offer(new Student("bham",'C'));
queue.offer(new Student("sam",'S'));

    System.out.println(queue);

    }

    private static class  Student{

        private final String name;

        private final  char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student" +
                    "name=" + name + '\'' +
                    ", grade=" + grade ;
        }
    }}



