package string_and_regex.baitap;
import java.util.Scanner;
public class NameOfClassTest {
    public static void main(String[] args) {
        NameOfClass nameOfClass = new NameOfClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of class: ");
        String regex = scanner.nextLine();
        boolean isvalids = nameOfClass.validate(regex);
        System.out.println("Name of class is: " + regex +" isvalids: " + isvalids);
    }
}
