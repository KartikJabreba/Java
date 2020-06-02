public class Reverse_Linked_List {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
    public  void printList(ListNode head){
        ListNode node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("\n");

    }
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        ListNode new_list=null;
        /*while(node!=null){
            new_list.next.next=node.next;
            new_list.next=node;
            node=node.next;
        }*/
        return null;

    }
    public static void main(String[] args) {
        Reverse_Linked_List reverse_linked_list = new Reverse_Linked_List();
        ListNode head=new ListNode(1);
        ListNode sec =new ListNode(2);
        head.next=sec;
        /*ListNode trd =new ListNode(3);
        sec.next=trd;
        ListNode fur=new ListNode(4);
        trd.next=fur;
        ListNode fiv=new ListNode(5);
        fur.next=fiv;*/
        reverse_linked_list.printList(head);
        System.out.println(reverse_linked_list.reverseList(head));

    }
}
