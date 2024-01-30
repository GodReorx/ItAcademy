package InitTool;

import StudentTool.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
    public static void startApp(){
        List<Student> studentList = new ArrayList<>();
        addStudent(studentList);
        System.out.println("Student List with name and age");
        studentList.stream().map(s -> "Name: " + s.getName() + " Age: " + s.getAge()).forEach(System.out::println);

        System.out.println("\nStudent list, only name start with A");
        List<Student> studentListA = studentList.stream().filter(s -> s.getName().toLowerCase().startsWith("a")).collect(Collectors.toList());
        studentListA.stream().map(s -> "Name: " + s.getName() + " Age: " + s.getAge()).forEach(System.out::println);

        System.out.println("\nStudent list with grade 5 or above");
        studentList.stream().filter(s -> s.getGrade() >= 5).map(s -> "Name: " + s.getName() + " Grade: " + s.getGrade() + " Course: " + s.getCourse()).forEach(System.out::println);

        System.out.println("\nstudent list with grade 5 or above and not PHP");
        studentList.stream().filter(s -> s.getGrade() >= 5 && !s.getCourse().equalsIgnoreCase("PHP")).map(s -> "Name: " + s.getName() + " Grade: " + s.getGrade()).forEach(System.out::println);

        System.out.println("\nStudent list course JAVA and age 18 or above");
        //studentList.stream().filter(s -> s.getCourse().equalsIgnoreCase("JAVA") && s.getAge() >= 18).map(s -> "Name: " + s.getName() + " Age: " + s.getAge()).forEach(System.out::println);
        studentList.stream().filter(s -> s.getCourse().equalsIgnoreCase("JAVA") && s.getAge() >= 18).forEach(s -> System.out.println("Name: " +s.getName() + " Age: " + s.getAge()));
    }

    private static void addStudent(List<Student> studentList){
        studentList.add(new Student("Smaug", 41, "JAVA", 2));
        studentList.add(new Student("Arwen", 210, "PHP", 7));
        studentList.add(new Student("Uruk", 15, "Java", 5));
        studentList.add(new Student("Marcos", 32, "PHP", 4));
        studentList.add(new Student("Anna", 18, "Java", 8));
        studentList.add(new Student("Rowan", 56, "Java", 10));
        studentList.add(new Student("Luke", 5, "PHP", 6));
        studentList.add(new Student("Leia", 6, "Java", 9));
        studentList.add(new Student("Spock", 112, "PHP", 5));
        studentList.add(new Student("Bilbo", 185, "Java", 3));
        studentList.add(new Student("Frodo", 33, "Java", 2));
    }
}
