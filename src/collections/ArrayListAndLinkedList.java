package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {


    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        List<Integer> linkedList=new LinkedList<>();



        calcTime("ArrayList : ",arrayList);
       calcTime("LinkedList : ",linkedList);
    }


    public static void calcTime(String str ,List<Integer> list)
    {
        long start = System.currentTimeMillis();

    for(int i =0;i<100000;i++)
    {
      ///  list.add(i);
        list.add(0,i);
    }
    long end= System.currentTimeMillis();

        System.out.println(str+" : Time elapsed "+ (end-start));

}




}



