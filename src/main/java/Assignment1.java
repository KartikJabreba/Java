import java.util.Scanner;

public class Assignment1 {
    public static void even(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
        public static void main (String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Array Size");
            int size = scan.nextInt();
            System.out.println("");
            int arr[] = new int[size];
            System.out.println("Array Numbers");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            even(arr);

        }

}
