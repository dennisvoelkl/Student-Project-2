import java.util.ArrayList;

public class StudentDB {

    ArrayList<Student> studentDBArray;
    public StudentDB(ArrayList<Student> studentDBArray) {
        this.studentDBArray = studentDBArray;

    }
    public ArrayList<Student> getAllStudents() {
        return studentDBArray;
    }
    @Override
    public String toString() {
        return "" + studentDBArray ;
    }


}
