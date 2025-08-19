package kunal_k.Tree;

// import kunal_k.Recurssion.sort;

// import kunal_k.Recurssion.sort;

public class traversal {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b= new Node(5);
        Node c= new Node(3);
        Node d= new Node(6);
        Node e= new Node(7);
        Node f= new Node(11);
        Node g= new Node(12);
        a.left=b;
        a.right=e;
        b.left=c;
        b.right=d;
        e.left=f;
        e.right=g;

        traverseInorder(a);
        System.out.println();
        traversepreOrder(a);
        System.out.println();
        traversepostOrder(a);

        
    }
    static void traverseInorder(Node root){
        if(root==null) {
            // System.out.println();
            return;
        }
        
        traverseInorder(root.left);
        System.out.print(root.val+" ");
        traverseInorder(root.right);
    }
    static void traversepreOrder(Node root){
        if(root==null) {
            // System.out.println();
            return;
        }
        System.out.print(root.val+" ");
        traverseInorder(root.left);
        traverseInorder(root.right);
    }
    static void traversepostOrder(Node root){
        if(root==null) {
            // System.out.println();
            return;
        }
       
        traverseInorder(root.left);
        traverseInorder(root.right);
        System.out.print(root.val+" ");
    }
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }
    
}
