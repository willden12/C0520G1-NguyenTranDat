package generic_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Stack;

public class wStack2 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(5);
        myLinkedList.add(8);
        Stack<Integer> stack = new Stack<>();
        for (int element : myLinkedList) {
            stack.push(element);
            System.out.print(element + "\t");
        }

        for (int i = 0; i < myLinkedList.size(); i++) {
            myLinkedList.set(i, stack.pop());
        }
        System.out.println();
        for (int element1 : myLinkedList) {
            System.out.print(element1 + "\t");
        }
    }


}
