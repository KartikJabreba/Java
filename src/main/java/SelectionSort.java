import java.util.*;

public class SelectionSort {
    void sort(int arr[]){
        int arr_size=arr.length;
        for(int i=0;i<arr_size;i++){
            int min_index=i;
            for(int j=i+1;j<arr_size;j++)
            {
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
                }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]= temp;
            }
        }


    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int arr_size=scan.nextInt();
        int arr[]=new int[arr_size];
        for(int i=0;i<arr_size;i++){
            arr[i]=scan.nextInt();
        }
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.sort(arr);
        for(int i=0;i<arr_size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
