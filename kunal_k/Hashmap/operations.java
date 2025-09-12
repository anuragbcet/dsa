package kunal_k.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class operations {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"ball");
        map.put(3,"cat");
        map.put(4,"Dog");

        // System.out.println(map.get(2));
        // System.out.println(map.getOrDefault(3, "hello"));
        // System.out.println(map.getOrDefault(7, "hello"));
        // System.out.println(map.containsKey(3));
        // System.out.println(map.containsKey(9));
        // System.out.println(map.containsValue("cat"));        
        // System.out.println(map.containsValue("Cat"));        
        // System.out.println(map.containsValue("hello"));  
        
        
        //Iterate over keys 
        // for(int k:map.keySet()){
        //     System.out.println("key-"+k+"-> value :"+map.get(k));
        // }

        // for(String s:map.values()){
        //     System.out.println("values->"+s);
        // }

        for(Map.Entry<Integer,String> entries:map.entrySet()){
            System.out.println("key=>"+entries.getKey()+",value->"+entries.getValue());

        }


    }    
}
