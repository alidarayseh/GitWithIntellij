package collections;

import java.util.*;

public class Maps2 {

    public static void main(String[] args) {

        //HashMap<Integer,String> map= new HashMap<>();
       // LinkedHashMap<Integer,String> map= new LinkedHashMap<>();

        TreeMap<Integer,String> map= new TreeMap<>();

        map.put(4,"dog");
        map.put(2,"cat");
        map.put(7,"snake");
        map.put(1,"elephant");

        for (Integer key:
             map.keySet() ) {
            String val=map.get(key);
            System.out.println(val);

        }

    }
}
