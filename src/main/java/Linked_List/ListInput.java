package Linked_List;

import java.util.Scanner;

public class ListInput {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        ListInput list=new ListInput();
        Node node;
        for(int i=1;i<size-1;i++){
            node=new Node(i+100);
            System.out.println(node);
        }
    }
}
