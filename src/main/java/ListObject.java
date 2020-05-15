import java.util.ArrayList;
import java.util.List;

public class ListObject {
    public static class Student{
        int RollNo;
        String name;
        String grade;

        public Student(int rollNo, String name, String grade) {
            RollNo = rollNo;
            this.name = name;
            this.grade = grade;
        }
    }
    public static  void main(String[] args){
        Student student1=new Student(10,"Kartik","A");
        Student student2=new Student(11,"Mani","B");
        Student student3=new Student(12,"Jabreba","C");
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(student1);
    }
}
