import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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


        StudentDB studentDBArray = new StudentDB(students);
        try {
            System.out.println(studentDBArray.findById(123490));
        }catch(NoSuchElementException e){
            System.out.println("Sorry, no ID found!");
        }

        ArrayList<String> studentsGenerate = new ArrayList<>(List.of(
                "Student4",
                "Student5",
                "Student6"
                ));

        System.out.println("\n" + studentsGenerate.get(1));

        ArrayList<Student> studentGenerate2 = new ArrayList<>(List.of(
                student1,
                student2,
                student
        ));
        System.out.println("\nPrint a Student from ArrayList<Student> List.of:" + studentGenerate2.get(1));

        System.out.println("\nPrint a random Student:" + studentDBArray.randomStudent());
        System.out.println("\nPrint all Students:" + studentDBArray.getAllStudents());

        ComputerScienceStudent nerd = new RealComputerScienceStudent();
        nerd.id = 1234;
        nerd.name = "alfons";
        System.out.println("\nStudent3 : " + nerd);

        Student mensch = new RealComputerScienceStudent();
        mensch.id  = 666;
        mensch.name = "dennis";
        System.out.println("\nStudent : " + mensch);

        RealComputerScienceStudent mensch2 = new RealComputerScienceStudent();
        mensch2.id  = 666;
        mensch2.name = "gollum";
        System.out.println("\nStudent : " + mensch2);
        System.out.println(mensch2.gender("monster"));

        ComputerScienceStudent mensch3 = new RealComputerScienceStudent();
        mensch3.id  = 456;
        mensch3.name = "Übertsudent";
        System.out.println("\nStudent : " + mensch3);
        System.out.println(mensch3.gender("monster"));

    }
}
