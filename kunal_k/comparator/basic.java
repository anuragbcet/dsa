package kunal_k.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class basic {
    
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(25);
        list.add(51);
        list.add(73);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);
    }
}
