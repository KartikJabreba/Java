package Trees;

class Node{
    int val;
    Node left,right;
    public Node(int data){
        val=data;
        left=null; right=null;
    }
}
public class Binary_Tree {
    Node root;

    public Binary_Tree(Node root) {
        this.root = new Node(root.val);
    }

    public Binary_Tree() {
        root=null;
    }

    public static void main(String[] args) {
        Binary_Tree binary_tree=new Binary_Tree();
        binary_tree.root=new Node(10);
        binary_tree.root.left=new Node(20);
        binary_tree.root.left.left=new Node(40);
        binary_tree.root.left.right=new Node(50);
        binary_tree.root.right=new Node(30);
        binary_tree.root.right.left=new Node(60);
        binary_tree.root.right.right=new Node(70);
    }
}
