package Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people);
        Arrays.stream(people).forEach(System.out::println);
        return people;

    }
    public static void main(String[] args) {
        int[][] people={{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Queue_Reconstruction_by_Height queue_reconstruction_by_height=new Queue_Reconstruction_by_Height();
        queue_reconstruction_by_height.reconstructQueue(people);
        /*Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<10;i++){
            arrayList.add(scanner.nextInt());
        }
        arrayList.forEach(n-> System.out.println(n));*/
        /*int[] people={7,0,1,5,0,6,1,5,2};
        Arrays.sort(people);
        Arrays.stream(people).forEach(System.out::println);*/
    }
    /*public int[][] reconstructQueue(int[][] people) {

    }

    public static void main(String[] args) {
        int[][] people={{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Queue_Reconstruction_by_Height queue_reconstruction_by_height=new Queue_Reconstruction_by_Height();
        queue_reconstruction_by_height.reconstructQueue(people);
    }*/
}
