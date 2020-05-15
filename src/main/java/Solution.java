import java.util.List;

/**
 * Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */
class Solution {
   /* Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }*/
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void printList(ListNode head){
        ListNode node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.print("\n");
    }
    public ListNode oddEvenList(ListNode head){
        if(head == null)
            return head;
        ListNode result_list=head;
        ListNode next_node=head.next;
        ListNode a=head;
        ListNode b=head.next;

        while(a!=null && b!=null){

            if(b.next==null)break;
            a.next=b.next;
            a=a.next;
            b.next=a.next;
            b=b.next;
        }
        a.next=next_node;
        return result_list;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head=new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;
        ListNode fourth = new ListNode(4);
        third.next = fourth;
        ListNode fifth = new ListNode(5);
        fourth.next = fifth;
        ListNode sisth = new ListNode(6);
        fifth.next = sisth;
        solution.printList(head);
        solution.oddEvenList(head);
        solution.printList(head);
   }
}