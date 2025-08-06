package kunal_k.linked_list;

public class insertNode {
    public static void main(String[] args) {
       linked_list ll=new linked_list();
       ll.append(5);
       ll.append(10);
       ll.append(17);
       ll.append(25);
       ll.append(13);
       ll.display();
      
        
    }
    

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public static class linked_list{
        Node head;

        public void append(int data){
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    }

    
}
