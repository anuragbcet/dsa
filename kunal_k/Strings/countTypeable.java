package kunal_k.Strings;

import java.util.HashSet;

public class countTypeable {
    public static void main(String[] args) {
        String a="Anurag kumar";
        HashSet<Character> set= new HashSet<>();
        for(char ch:a.toCharArray()){
            set.add(ch);
        }
        for(char ch:set){
            System.out.println(ch);
        }
        
        System.out.println(set.contains(' '));
        System.out.println(set.contains('v'));}

}
