package kunal_k.Tree;

public class nthLevel {
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(-15);
        Node e=new Node(-14);
        Node f=new Node(-17);
        Node g=new Node(-19);
        Node h=new Node(-25);
        a.left=b;
        a.right=c;
        b.right=g;
        b.left=h;
        c.left=e;
        c.right=f;
        // levelwise(a);
        // printNthlevel(a, 1);
        // System.out.println();
        // printNthlevel(h, 2);
        // System.out.println(sumOfNodes(a));
        // System.out.println(maximum(a));
       int level=heightoftree(a)+1;
       for(int i=1;i<=level;i++){
        printNthlevel(a, i);
        System.out.println();
       }
        
    }
    static int heightoftree(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(heightoftree(root.left),heightoftree(root.right));
    }



    static int sumOfNodes(Node root){
        if(root==null) return 0;
        return root.val+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    static int maximum(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));
    }

    static void levelwise(Node root){
        if(root==null) return;
        System.out.print(root.val+"-->");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.right!=null) System.out.println(root.right.val);
        System.out.println();
        levelwise(root.left);
        levelwise(root.right);
    }

    static void printNthlevel(Node root,int n){
        if(root==null) return;
        if (n==1) System.out.print(root.val+" ");
        printNthlevel(root.left, n-1);
        printNthlevel(root.right, n-1);
    }
    
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    } 
}
