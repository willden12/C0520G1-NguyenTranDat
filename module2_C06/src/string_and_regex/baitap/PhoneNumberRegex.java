package string_and_regex.baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a phone number: ");
        String phoneNumber= scanner.nextLine();
//        boolean invalid = Pattern.matches("[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$",phoneNumber);
        boolean invalid = Pattern.matches("84-\\d{10}",phoneNumber);
        System.out.println("The numberPhone you have just input is: " + invalid);
    }
}
