package generic_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bracket2Stack {
    public static void main(String[] args) {
        System.out.println(" Input ");
        Scanner scanner =new Scanner(System.in);
        String myBracket = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1= new Stack<>();
        boolean check = true;
        for (int i =0;i< myBracket.length();i++){
            if (myBracket.charAt(i)== '(' ){
                stack.push(myBracket.charAt(i));
            }
            if (myBracket.charAt(i) == ')'){
                if (stack.size() <= stack1.size()){
                    check = false;
                    break;
                }else {
                    stack1.push((myBracket.charAt(i)));
                }
            }
        }
        if (stack.size() !=stack1.size()){
            check= false;
        }
        if (!check){
            System.out.println(" not ok");
        }else {
            System.out.println(" ok");
        }
    }
}
