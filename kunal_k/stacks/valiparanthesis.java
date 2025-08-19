package kunal_k.stacks;

import java.util.*;

public class valiparanthesis {
    public static void main(String[] args) {
        String s="({{[]}})";
        System.out.println(valid(s));
        
    }
    static boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch =='['){
                stack.push(ch);
            }
            else{
                if(ch==')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stack.isEmpty() || stack.pop()!='{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stack.isEmpty() || stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    
}
