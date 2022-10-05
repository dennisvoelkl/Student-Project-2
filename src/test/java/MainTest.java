import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void getAllStudentsTest(){
        //Given
        Student testStudent = new Student();
        testStudent.id = 234;
        testStudent.name = "Alf";
        Student testStudent1 = new Student();
        testStudent1.id = 789;
        testStudent1.name = "Wurst";

        ArrayList<Student> testArray = new ArrayList<>();
        testArray.add(testStudent);
        testArray.add(testStudent1);
        StudentDB studentDB = new StudentDB(testArray);

        //When
        ArrayList<Student> actual = studentDB.getAllStudents();

        //Then
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(testStudent);
        expected.add(testStudent1);
        assertEquals(expected,actual);
    }




}