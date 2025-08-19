package kunal_k.linked_list;

public class insertNode {
    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.append(5);
        ll.append(10);
        ll.append(17);
        ll.append(25);
        ll.append(13);
        ll.addAtstart(7);
        ll.addAtstart(17);
        ll.addAtstart(24);
        ll.display();
        // System.out.println(ll[5]);
        ll.addAtIndex(2, 22222);
        ll.addAtIndex(5, 5555);
        ll.addAtIndex(7, 7777);
        ll.display();

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

        public void append(int data) {
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

        public void addAtstart(int data){
            Node newNode = new Node(data);
            if(head ==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addAtIndex(int index,int data){
            Node temp=head;
            Node newNode=new Node(data);
            if(index==0){
                head=newNode;
                return;
            }

            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

}
