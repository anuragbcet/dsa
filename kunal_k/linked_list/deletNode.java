package kunal_k.linked_list;

public class deletNode {
    // can we delet a node with a given node as a parameter .
    public static void main(String[] args) {

        linked_list ll= new linked_list();
        ll.add(10);
        ll.add(15);
        ll.add(17);
        ll.add(25);
        ll.add(27);
        ll.add(6);
        ll.add(55);
        ll.add(60);
        ll.display();
        // ll.deletAtindex(2);
        ll.display();
        // ll.deletAtindex(5);
        ll.display();
        ll.size();
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class linked_list {
        Node head;

        void add(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        void deletAtindex(int index) {
            if (index == 0) {
                head = null;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        void display() {
            Node temp = head;
            while (temp!= null) {
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }

        void size(){
            int s=0;
            Node temp=head;
            while(temp != null){
                s++;
                temp=temp.next;
            }
            System.out.println(s);
            return;
        }

    }
}
