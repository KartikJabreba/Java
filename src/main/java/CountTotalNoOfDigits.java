import java.util.Scanner;

public class CountTotalNoOfDigits {
    public static int count(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Digit");
        int n=scan.nextInt();
        int total_digits=0;
        for(int i=1;i<n;i=i*10){
            total_digits+=n-i+1;
        }
        return total_digits;
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
