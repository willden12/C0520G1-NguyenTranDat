package baithi_dat2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValueDateDirec {
    static Scanner scanner = new Scanner(System.in);
    private static final String EMAIL = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String ID_CUSTOMER = "[\\d]{10}";

    public static String checkEmail() {

        String mailCustomer = scanner.nextLine();
        if (Pattern.compile(EMAIL).matcher(mailCustomer).matches()) {
            return mailCustomer;
        } else {
            System.out.println("Wrong");
            return checkEmail();
        }
    }

    public static String phoneNumber() {

        String phoneNumber = scanner.nextLine();

        if (Pattern.compile(ID_CUSTOMER).matcher(phoneNumber).matches()) {
            return phoneNumber;
        } else {
            System.out.println("Wrong");
            return phoneNumber();
        }
    }

    public static String checkNull() {

        String empty = scanner.nextLine();
        if (!empty.equals("")) {
            return empty;
        } else {
            System.out.print("Wrong\n " +
                    "Enter again : ");
            return checkNull();
        }
    }
}
