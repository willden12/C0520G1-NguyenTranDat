package generic_stack_queue.baitap;

import java.util.Stack;

public class  wStack {
    public static void main(String[] args) {
        int[] array ={ 1,4,5,3,8};
        Stack<Integer> stack = new Stack();
        for (int element : array){
            stack.push(element);
        }
        int size = stack.size();
        for (int i=0; i< size; i++){
            array[i] = stack.pop();
        }
        for (int i : array){
            System.out.println(i);
        }
    }




}
