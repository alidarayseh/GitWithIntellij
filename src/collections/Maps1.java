package collections;

import java.util.*;

public class Maps1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Amman");
        map.put(2,"Salt");
        map.put(3,"Zarqa");
        map.put(4,"Aqaba");
        map.put(5,"Irbid");

        System.out.println(map);
        for (Map.Entry<Integer,String> entry:
             map.entrySet()) {
            int key =entry.getKey();
            String val= entry.getValue();
            System.out.println(key+"  :  "+val);
        }
    }
}
