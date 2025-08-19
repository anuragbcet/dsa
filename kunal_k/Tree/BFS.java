package kunal_k.Tree;

public class BFS {
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int data){
            this.value=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        Node j=new Node(10);
        Node k=new Node(11);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        d.left=h;
        d.right=i;
        c.left=f;
        c.right=g;
        f.left=j;
        g.right=k;
        display(a);

    }
    static void display(Node node){
        if(node==null){
            return;
        };
        System.out.print(node.value+"-->");
        if( node.left!=null){
            System.out.print(node.left.value+"-->");
        }else{
            System.out.println("null");
        }
        
        if(node.right!=null){
            System.out.print(node.right.value+"-->");
        }else{
            System.out.println("null");
        }
        System.out.println();
        display(node.left);
        display(node.right);
    }
    
}
