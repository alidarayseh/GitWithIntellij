package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {


    public static void main(String[] args) {

        //Set<String> set=new HashSet<>();
        //Set<String> set=new LinkedHashSet<>();
        Set<String> set=new TreeSet<>();


        set.add("Dog");
        set.add("Cat");
        set.add("Mouse");
        set.add("Snake");
        set.add("Dog");

        for (String val : set)
        {
            System.out.println(val);
        }

        System.out.println(set.toString());



    }


        }
