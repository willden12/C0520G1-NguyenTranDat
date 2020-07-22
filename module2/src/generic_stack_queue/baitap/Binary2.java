package generic_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Binary2 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (number !=0){
            stack.push(number%2);
           number/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
