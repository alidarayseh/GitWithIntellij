package collections;

import java.util.*;

public class CollectionsInterface {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Bassam");
        list.add("Ahmad");
        list.add("Sami");
        list.add("Dart");
        list.add("Celena");

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"Dart"));
        Collections.reverse(list);


        Queue<String> queue=new PriorityQueue<>() ;

        queue.add("Ali");
        queue.add("Kaled");
        queue.add("Sami");



    }

}
