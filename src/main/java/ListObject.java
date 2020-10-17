import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListObject {
    public static class Student {
        int RollNo;
        String name;


        public Student(int rollNo, String name) {
            this.RollNo = rollNo;
            this.name = name;

        }
    }

    public static void main(String[] args) {
        List<Student> studentList = null;

        int select;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("press 1 for new entry press 2 for exit");
            select = scanner.nextInt();
            switch (select) {
                case 1: {

                    System.out.println("Enter roll no");
                    int a = scanner.nextInt();

                    System.out.println("enter name");
                    String b = scanner.nextLine();
                    Student student = new Student(a, b);
                    studentList.add(student);
                }
                case 2: {
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                }
            }
        }

        while (select <= 2);

    }
}
