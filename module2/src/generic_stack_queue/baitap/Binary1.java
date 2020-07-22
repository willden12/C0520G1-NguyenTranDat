package genertic_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Binary1 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (number!= 0){
            if (number% 2 ==0){
                stack.push(0);
                number/=2;
            }else {
                stack.push(1);
                number= (number-1)/2;
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
