package kunal_k.stacks;

import java.util.Stack;

public class ImplementQueue {
    public static void main(String[] args) {
        queue qt=new queue();
        qt.add(10);
        qt.add(20);
        qt.add(30);
        qt.add(40);
        qt.add(50);
        qt.add(60);
        System.out.println(qt.peek());
        System.out.println(qt.remove());
        System.out.println(qt.remove());
    }

    public static class queue {
        Stack<Integer> stack;
        Stack<Integer> newstack;

        public queue(){
            stack=new Stack<>();
            newstack=new Stack<>();
        }

        // impelent the queue using stack
        void add(int val) {
            stack.push(val);
        }

        int remove() {
            while (!stack.isEmpty()) {
                newstack.push(stack.pop());
            }
            int removed=newstack.pop();
            while (!newstack.isEmpty()) {
                stack.push(newstack.pop());
            }
            return removed;
        }

        int peek() {
            Stack<Integer> newstack = new Stack<>();
            while (!stack.isEmpty()) {
                newstack.push(stack.pop());
            }
            int peeked=newstack.peek();
            while (!newstack.isEmpty()) {
                stack.push(newstack.pop());
            }
            return peeked;
        }

    }


}
