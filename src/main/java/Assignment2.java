import java.util.Scanner;

public class Assignment2 {
    public static int maxOne(String num){
        int count=0;
        int finalCount=0;
        for(int i=0;i<num.length();i++) {
            if (num.charAt(i)=='1')
            {
                count++;
                if(finalCount<count)
                {
                    finalCount=count;
                }
            }

            else{
                count=0;
            }
        }
        return finalCount;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number");
        String num=scan.next();
        System.out.println(maxOne(num));
    }
}
