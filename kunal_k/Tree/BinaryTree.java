package kunal_k.Tree;
import java.util.*;

public class BinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }

    static Node root;
    static void populate(Scanner scanner){
        System.out.println("Enter the value of root node :");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    static void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of "+node.value);
        Boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value left of "+node.value);
            int value =scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);

        }
        System.out.println("Do you want to enter the right of "+node.value);
        Boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value left of "+node.value);
            int value =scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);

        }
    }
    static void dispaly(Node root){
        System.out.print(root.value+"-->");
        System.out.print(root.left+"-->");
        System.out.print(root.right+"-->");
        System.out.println();
        dispaly(root.left);
        dispaly(root.right);

    }
    
}
