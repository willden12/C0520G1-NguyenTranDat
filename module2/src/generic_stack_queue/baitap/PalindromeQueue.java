package generic_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        System.out.println("input array");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < myString.length(); i++) {
            queue.add(myString.charAt(i));
            stack.add(myString.charAt(i));
        }
        boolean isPalindrome = false;
        for (int i=0;i< queue.size();i++){
             int a = queue.poll();
            int b = stack.pop();
            if (a==b){
                isPalindrome = true;
            }else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(" la chuoi polindrome");
        }else {
            System.out.println(" khong phai polindrome");
        }

    }
}
