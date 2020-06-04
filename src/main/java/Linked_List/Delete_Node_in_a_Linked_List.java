package Linked_List;

public  class Delete_Node_in_a_Linked_List {
    public static class ListNode{
        int data;
        ListNode next_node;

        /*public ListNode(int data, ListNode next_node) {
            this.data = data;
            this.next_node = next_node;
        }*/

        public ListNode(int data) {
            this.data = data;
        }
    }
    public void printList(ListNode head){
        ListNode node=head;
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next_node;
        }
        System.out.println("\n");
    }
    public static void deleteNode(ListNode node) {
        //node=node.next_node;
        /*node.data=node.next_node.data;
        node=node.next_node;*/
        node.data=node.next_node.data;
        node.next_node=node.next_node.next_node;
        //System.out.println(node.data+"\n"+node.next_node);
    }

    public static void main(String[] args) {
        Delete_Node_in_a_Linked_List delete_node_in_a_linked_list=new Delete_Node_in_a_Linked_List();
        ListNode head=new ListNode(4);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(1);
        ListNode fourth=new ListNode(9);
        head.next_node=second;
        second.next_node=third;
        third.next_node=fourth;
        delete_node_in_a_linked_list.printList(head);
        delete_node_in_a_linked_list.deleteNode(third);
        //delete_node_in_a_linked_list.printList(head);
    }

}
