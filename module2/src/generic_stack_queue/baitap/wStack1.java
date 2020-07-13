package generic_stack_queue.baitap;

import java.util.ArrayList;
import java.util.Stack;

public class wStack1 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(4);
        myArrayList.add(8);
        for (int element : myArrayList){
            System.out.print(element + "\t");
        }
        Stack<Integer> stack =new Stack();
        for (int a : myArrayList){
            stack.push(a);
        }
        int size = stack.size();
        for (int i=0; i<size;i++ ){
            myArrayList.set(i,stack.pop());
        }
        System.out.println("\n");
        for (int element : myArrayList){
            System.out.print(element + "\t");
        }


    }



}
