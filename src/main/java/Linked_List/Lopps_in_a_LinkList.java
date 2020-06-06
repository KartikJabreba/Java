package Linked_List;

import java.util.HashSet;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Lopps_in_a_LinkList {
    public static boolean isLoop(ListNode node1){
        ListNode node=node1;
        HashSet<ListNode> nodes=new HashSet<ListNode>();
        while(node!=null){
            if(nodes.contains(node)) return true;
            else{
                nodes.add(node);
                node=node.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2; node2.next=node3;node3.next=node4;
        System.out.println(isLoop(node1));


    }
}
