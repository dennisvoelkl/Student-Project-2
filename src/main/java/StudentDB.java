import java.util.ArrayList;
import java.util.NoSuchElementException;

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

    public Student randomStudent(){
        int randomIndex = (int)(Math.random() * studentDBArray.size());
        return studentDBArray.get(randomIndex);
    }

    public Student findById(int id){
        for(int i=0; i<studentDBArray.size(); i++){
            if(studentDBArray.get(i).getId() == id){
            return studentDBArray.get(i);}
        }throw new NoSuchElementException("No ID found");
    }


}
