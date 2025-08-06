package kunal_k.linked_list;

import java.util.LinkedList;

public class first {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(50);
        list.add(70);
        list.add(15);
        list.add(87);
        list.addFirst(77);
        list.addLast(97);
        list.remove(0);
        display(list);
    }
    static void display(LinkedList<Integer> list){
        for(int e:list){
            System.out.print(e+" -> ");
        }
    }
    
}
