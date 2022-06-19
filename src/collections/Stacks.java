package collections;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {


        Stack<String> stack=new Stack<>();

        stack.push("Ali");
        stack.push("Ahmad");
        stack.push("Khaled");
        stack.push("Mohmmad");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }



}
