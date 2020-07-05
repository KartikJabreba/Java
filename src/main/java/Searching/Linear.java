package Searching;

import java.util.Scanner;

public class Linear {
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {2,4,7,3,2,5,7,9,1,2,8,3,7,4,6};
        int x=9;
        /*new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter number to search");
        int x = scan.nextInt();*/
        if (search(arr, x) != 0) {
            System.out.println("present");
        }
    }
}