package CircularLinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){this.data=data;}
}
public class Circular_Linked_List {
    public static Node createList(int arr[]){
        Node head=null;
        Node node=null; int i=0;
        while(i<arr.length){
            Node new_node=new Node(arr[i]);
            if(head==null){
                node=new_node;
                head=node;
            }
            else {
                node.next=new_node;
                node=node.next;
            }
            i++;
        }
        node.next=head;
        return head;
    }
    public static void printList(Node head){
        Node node=head;
        while(node!=null ){
            System.out.println(node.data);
            node=node.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Node node=createList(arr);
        printList(node);
    }
}
