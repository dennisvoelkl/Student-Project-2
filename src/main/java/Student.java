import lombok.Data;

@Data
public class Student
{
    String name;
    int id;

   @Override
   public String toString() {
       return "\nStudent: " + "\nName:  " + name  +
               "\nStudentennummer: " + id;
   }
}
