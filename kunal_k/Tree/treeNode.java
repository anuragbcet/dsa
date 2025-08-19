package kunal_k.Tree;

public class treeNode {
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
        display(a);
        Node max=maxNode(a);
        System.out.println("The value inside the maximum node is : "+ max.val);

        
    }

    static Node maxNode(Node root){
        if(root==null) return new Node(0);
        if(root.left==null) return root.right;

        if(root.right==null) return root.left;

        if(root.left.val>root.right.val){
            return maxNode(root.left);
        }
        else{
            return maxNode(root.right);
        }
    }

    static void display(Node root){
        if(root==null){
            // System.out.println("Null");
            return;
        }
        System.out.print(root.val+"-->");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.left!=null) System.out.print(root.right.val+" ");
        System.out.println();
        display(root.left);
        display(root.right);

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
