package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {


    public static void main(String[] args) {
            // queue First in first out

        Queue<String> queue=new PriorityQueue<>() ;
        Queue <Integer> linkedList= new LinkedList<>();


      /*  linkedList.offer("Bassam");
        linkedList.offer("Ahmad");
        linkedList.offer("Sami");
        linkedList.offer("Dart");
        linkedList.add("Celena");

*/
        linkedList.add(10);
        linkedList.add(41);
        linkedList.add(63);
        linkedList.add(5);
        linkedList.add(15);



        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());



    }
}
