import java.util.*;
public class ArrayInput {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
