package Linked_List;

public class Convert_Binary_Number_in_a_LinkedList_to_Integer {
    public static class ListNode{
        int data;
        ListNode next_node;
        ListNode(int data){
            this.data=data;
            //this.next_node=null;
        }
        ListNode(int data,ListNode next_node){
            this.data=data;
            this.next_node=next_node;
        }
    }
    public int getDecimalValue(ListNode head) {
        ListNode nod=head;
        int num=0;
        int count=-1;
       while(nod!=null){
            //count=count+1;
           count++;
            nod=nod.next_node;
        }
       ListNode node=head;
        while(count!=-1){ if(node.data==1){
            num= (int) (num+Math.pow(2,count));}
            count--;
            node=node.next_node;
        }
        return num;

    }
    public void printList(ListNode first){
        ListNode node=first;
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next_node;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Convert_Binary_Number_in_a_LinkedList_to_Integer val=new Convert_Binary_Number_in_a_LinkedList_to_Integer();
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(0);
        first.next_node=second;
        ListNode third=new ListNode(1);
        second.next_node=third;
        val.printList(first);
        System.out.println(val.getDecimalValue(first));

    }
}
