package kunal_k.linked_list;

public class sumoftwo {
    public static void main(String[] args) {

        
    }
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        Node(){
            this.val=0;
        }
    }
    static Node sum(Node l1,Node l2){
        if(l1==null && l2==null) return null;
        Node dummy=new Node();
        Node current=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1!=null) ?l1.val:0;
            int y=(l2!=null) ? l2.val:0;
            int sum=x+y+carry;

            carry=sum/10;
            current.next=new Node(sum%10);

            current=current.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            current.next=new Node(carry);
        }
        return dummy.next;
    }
}
