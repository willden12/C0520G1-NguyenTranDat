package string_and_regex.baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameOfClassTest_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a phone number: ");
        String phoneNumber= scanner.nextLine();
        boolean invalid = Pattern.matches("^[ACP][0-9]{4}[GHIKLM]$",phoneNumber);
        System.out.println("The numberPhone you have just input is: " + invalid);
    }
}
