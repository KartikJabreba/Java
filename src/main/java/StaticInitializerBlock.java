import java.util.Scanner;

public class StaticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H=scan.nextInt();
    static boolean flag;
    static {
        try{
            if(B<=0 || H<=0) flag=false;
            throw new Exception("Breadth and heoght must be positive");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

