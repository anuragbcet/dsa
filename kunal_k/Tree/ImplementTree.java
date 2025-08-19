package kunal_k.Tree;

import java.util.Scanner;

public class ImplementTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.dispaly();

    }
    public static class Node {
            int value;
            Node left;
            Node right;

            Node(int value) {
                this.value = value;
            }
        }

    public static class BinaryTree {
       

         Node root;

        void populate(Scanner scanner) {
            System.out.println("Enter the value of root node :");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner, root);
        }

         void populate(Scanner scanner, Node node) {
            System.out.println("Do you want to enter the left of " + node.value);
            Boolean left = scanner.nextBoolean();
            if (left) {
                System.out.println("Enter the value left of " + node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner, node.left);

            }
            System.out.println("Do you want to enter the right of " + node.value);
            Boolean right = scanner.nextBoolean();
            if (right) {
                System.out.println("Enter the value left of " + node.value);
                int value = scanner.nextInt();
                node.right = new Node(value);
                populate(scanner, node.right);

            }
        }

        void dispaly() {
            System.out.print(root.value + "-->");
            System.out.print(root.left.value + "-->");
            System.out.print(root.right.value + "-->");
            System.out.println();
            display(root.left);
            display(root.right);

        }
        void display(Node node){
            if(node == null) return;
            System.out.print(node.value + "-->");
            System.out.print(node.left.value + "-->");
            System.out.print(node.right.value+ "-->");
            System.out.println();
            display(node.left);
            display(node.right);

        }

    }

}
