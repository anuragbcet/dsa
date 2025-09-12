package kunal_k.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// import java.util.Stack;

public class BFS {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = h;
        d.right = i;
        c.left = f;
        c.right = g;
        f.left = j;
        g.right = k;
        System.out.println(height(a));
    }
    static void bfs(Node root){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            ArrayList<Integer> arr=new ArrayList<>();
            Node temp=queue.peek();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            queue.remove();
        }

    }
    // static int diameterOftree(Node root){
        
    // }


    static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

}
