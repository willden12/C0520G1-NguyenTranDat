package generic_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bracket1Stack {
    public static void main(String[] args) {
        System.out.println(" Input ");
        Scanner scanner =new Scanner(System.in);
        String myBracket = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        char a = '(';
        char b = ')';
        int count=0;
        boolean check = false;
        for (int i = 0; i< myBracket.length();i++){
            if(myBracket.charAt(i)== a){
                stack.push(myBracket.charAt(i));
                count++;
            }
            if (myBracket.charAt(i) ==b){
                if (!stack.isEmpty()){
                    check = true;
                    stack.pop();
                }else {
                    check = false;
                    break;
                }
                count--;
            }
        }
        if (count!=0){
            check =false;
        }
        if (check){
            System.out.println("ok");
        }else {
            System.out.println(" not ok");
        }

    }
}
