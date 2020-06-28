import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class HshMap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,9};
        /*Vector<Integer> vector=new Vector<>();
        for(int i=0;i<arr.length;i++) {
            vector.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(vector.elementAt(i));
        }*/
        HashMap<Integer,Integer> hashMap=new HashMap<>();
            for (int i = 1; i < 9; i++) {
                hashMap.put(i,arr[i-1]);
            }
        for (int i=1;i<9;i++){
            System.out.println(hashMap.get(i));
        }
    }
}
