//this is not implimented
package kunal_k.heaps;

import java.util.PriorityQueue;

class Heap {
 public static void main(String[] args){
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    // minheap.add(10);
    // minheap.add(5);
    // minheap.add(2);
    // for(int num:minheap){
    //     System.out.println(num);
    // }
    // System.out.println("polleed int->"+minheap.poll());
    //  for(int num:minheap){
    //     System.out.println(num);
    // }

    PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
    maxheap.add(-5);
    maxheap.add(0);
    maxheap.add(2);
    maxheap.add(70);
    maxheap.add(70);
    for(int num:maxheap){
        System.out.print(num+" ");
    }
    System.out.println("Poped:-"+maxheap.poll());
    for(int num:maxheap){
        System.out.print(num+" ");
    }
}   
}
