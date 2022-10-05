import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1234;
        student.name = "Marc";
        Student student1 = new Student();
        student1.id = 56789;
        student1.name = "Christian";
        Student student2 = new Student();
        student2.id = 345678;
        student2.name = "Hans";

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

//        System.out.println(students);

        StudentDB studentDBArray = new StudentDB(students);

        System.out.println(studentDBArray.findById(56789));

    }
}
