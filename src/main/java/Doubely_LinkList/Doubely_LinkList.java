package Doubely_LinkList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
    }
}

public class Doubely_LinkList {

    public static HashMap<String, Node> createList(int arr[]) {
        HashMap<String, Node> map = new HashMap<String, Node>();
        Node head = null;
        Node tail = null;
        int i = 0;
        while (i<10) {
            Node new_node = new Node(arr[i]);
            if (head == null) {
                tail = new_node;
                head = tail;
                head.previous = null;
            } else {
                tail.next = new_node;
                new_node.previous = tail;
                tail = new_node;
            }
            i++;
        }
        map.put("h", head);
        map.put("t", tail);

        return map;
    }


        public static void printList (Node head) {
            Node node = head;
            if (node.previous == null) {
                while (node != null) {
                    System.out.print("->"+node.data);
                    node = node.next;
                }
            } else if (node.next == null) {
                System.out.println("Reverse ");
                while (node != null) {
                    System.out.print("->"+node.data);
                    node = node.previous;
                    //node=node.previous;
                    //System.out.println(node.data);
                }
            }
        }


            public static void main (String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
                HashMap<String, Node> map = createList(arr);
                printList(map.get("h"));
                System.out.println("\n");
                printList(map.get("t"));

            }
}



