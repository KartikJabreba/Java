import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=1;
        while(scan.hasNextLine()){
            String line=scan.nextLine();
            System.out.println(num+" "+line);
            num++;
        }
    }
}
