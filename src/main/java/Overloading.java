class Student{
    public void det(int age){
        System.out.println(age);
    }
    public void det(String name){
        System.out.println(name);
    }

}
public class Overloading {
    public static void main(String[] args) {
        String name="Kartik";
        int age=12;
        Student student=new Student();
        student.det(age);
        student.det(name);
    }
}
