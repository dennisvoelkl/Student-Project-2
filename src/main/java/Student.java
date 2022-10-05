import lombok.Data;

@Data
public class Student extends Mensch
{
    String name;
    int id;

   @Override
   public String toString() {
       return "\nStudent: " + "\nName:  " + name  +
               "\nStudentennummer: " + id;
   }



}
