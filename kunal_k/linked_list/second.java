package kunal_k.linked_list;

public class second {
    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(9);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(17);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);;

        
    }
    public static class Node {
        int value;
        Node next;
        
        Node(int value){
            this.value=value;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
    }
    
}
