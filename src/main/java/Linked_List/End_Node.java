package Linked_List;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data){ this.data=data; }
}

public class End_Node {

    public static void main(String[] args) {
        Node head=createLinkList();
        System.out.println("\n\nprinting linklist\n\n");
        new Scanner(System.in).nextLine();
        printLinkList(head);
        printNode(head);
    }
    public static void printNode(Node head){
        System.out.println("enter node to print");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Node first=head;
        Node second=head;
        int i=1;
        while(first!=null){
            if(i>=n){
                first=first.next;
                second=second.next;
            }
            first=first.next;
            i++;

        }
        System.out.println(second.data);
    }

    public static Node createLinkList(){
     Node head=null;
     Node node=null;
     Scanner scan=new Scanner(System.in);
        System.out.println("list size");
        int size= scan.nextInt();
        int i=1;
        while(i<=size){
            System.out.print(i+"th node->" +
                    "");
            Node newNode=new Node(scan.nextInt());

            if(head==null){
                node=newNode;
                head=node;
            }
            else{
                node.next=newNode;
                node=node.next;
            }
            i++;
        }
        return head;
























        /*Node head=null;
        Node node=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("insert no of nodes");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("insert "+i+"th node");
            Node newNode=new Node(sc.nextInt());
            if(head==null){
                node=newNode;
                head=node;
            }else{
                node.next=newNode;
                node=node.next;
            }
            i++;
        }
        return head;*/
    }

    public static void printLinkList(Node head){
        Node node=head;
        while(node!=null){
            System.out.print(node.data);
            node=node.next;
            if(node!=null){
                System.out.print("->");
            }
        }
    }
}
