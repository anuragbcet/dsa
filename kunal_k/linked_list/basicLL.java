package kunal_k.linked_list;

public class basicLL {
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(15);
        Node c =new Node(9);
        Node d =new Node(27);
        Node e =new Node(13);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(d);
        System.out.println(c.next);
        System.out.println(a.data);
    }
    
}
