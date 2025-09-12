package kunal_k.Hashmap;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<Character ,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',5);
        System.out.println(map);
        map.put('a',map.get('a')+10);
        map.put('a',map.getOrDefault('a',0)+10);
        map.remove('a');
        System.out.println(map);
        HashMap<Character,Integer> map2=new HashMap<>();
        System.out.println(map.equals(map2));
        System.out.println(map.get('b'));;
    }
    
}
