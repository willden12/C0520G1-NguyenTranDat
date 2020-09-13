package baithi_2_sai;

import furama_resort.commons.ReadWriteFile;
import furama_resort.commons.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController_1 {
    static Scanner scanner = new Scanner(System.in);
    public static List<PhoneBook> phoneBookList = new ArrayList<>();
    public static final String FILE_PHONE = "D:\\CODEGYM\\case_study_2\\src\\baithi_2\\Contacts.csv";

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choose;
            System.out.print("1.\tShowPhoneBook\n" +
                    "2.\tAddPhoneBook\n" +
                    "3.\tUpdatePhoneBook\n" +
                    "4.\tDeletePhoneBook\n" +
                    "5.\tSeachPhoneBook\n" +
                    "6.\tReaderPhoneBook\n" +
                    "7.\tRritePhoneBook\n" +
                    "8.\tExit\n");
            System.out.print("Enter choose: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showPhoneBook();
                    break;
                case 2:
                    addPhoneBook();
                    break;
                case 3:
                    updatePhoneBook();
                    break;
                case 4:
                    deletePhoneBook();
                    break;
                case 5:
                    seachPhoneBook();
                    break;
                case 6:
                    readerPhoneBook();
                    break;
                case 7:
                    writePhoneBook();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("The selection is not in the selection list.please reselect");
            }
        }

    }

    public static final String REGEX_PHONE = "\\d{9}";
    public static final String REGEX_EMAIL = "([a-zA-Z0-9_.\\-])+@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+";


    private static void showPhoneBook() {
        baithi_2_sai.ReadWriteFile.readerFile(FILE_PHONE);
        PhoneBook phoneBook = null;
        for (int i = 0; i < phoneBookList.size(); i++) {
            phoneBook = phoneBookList.get(i);
            System.out.print((i + 1) + ". ");
            phoneBook.showInfo();
        }


    }

    private static void addPhoneBook() {
        scanner.nextLine();

        String phone;
        do {
            System.out.print("Input Phone: ");
            phone = scanner.nextLine();
        } while (!Validate.check(phone, REGEX_PHONE));

        String teamPhone;

        System.out.print("Input teamPhone: ");
        teamPhone = scanner.nextLine();

        String name;
        System.out.print("Input name ");
        name = scanner.nextLine();

        String gender;
        System.out.print("Input gender ");
        gender = scanner.nextLine();

        String address;

        System.out.print("Inout address ");
        address = scanner.nextLine();
        String birthday;
        System.out.print("Input birtday(Hour/Day/month/year): ");
        birthday = scanner.nextLine();

        String email;
        do {
            System.out.print("Input email: ");
            email = scanner.nextLine();

        } while (!Validate.check(email, REGEX_EMAIL));


        phoneBookList.add(new PhoneBook(phone, teamPhone, name, gender, address, birthday, email) {
            @Override
            public void showInfo() {
                System.out.println(this.toString());


            }
        });
        for (int i = phoneBookList.size() - 1; i < phoneBookList.size(); i++) {
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getName()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getName() + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getTeamPhone()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getName()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getGender()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getAddress()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getBirthday() + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getEmail() + ",", FILE_PHONE);
            ReadWriteFile.writerFile("\n", FILE_PHONE);
        }
        phoneBookList.clear();
        System.out.println("-----------------------------------------------------------------------------------------");

    }


    private static void updatePhoneBook() {
        scanner.nextLine();

        String phone;
        do {
            System.out.print("Input Phone: ");
            phone = scanner.nextLine();
        } while (!Validate.check(phone, REGEX_PHONE));

        String teamPhone;

        System.out.print("Input teamPhone: ");
        teamPhone = scanner.nextLine();

        String name;
        System.out.print("Input name ");
        name = scanner.nextLine();

        String gender;
        System.out.print("Input gender ");
        gender = scanner.nextLine();

        String address;

        System.out.print("Inout address ");
        address = scanner.nextLine();
        String birthday;
        System.out.print("Input birtday(Hour/Day/month/year): ");
        birthday = scanner.nextLine();

        String email;
        do {
            System.out.print("Input email: ");
            email = scanner.nextLine();

        } while (!Validate.check(email, REGEX_EMAIL));


        phoneBookList.add(new PhoneBook(phone, teamPhone, name, gender, address, birthday, email) {
            @Override
            public void showInfo() {
                System.out.println(this.toString());


            }
        });
        for (int i = phoneBookList.size() - 1; i < phoneBookList.size(); i++) {
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getName()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getName() + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getTeamPhone()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getName()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getGender()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(String.valueOf(phoneBookList.get(i).getAddress()) + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getBirthday() + ",", FILE_PHONE);
            ReadWriteFile.writerFile(phoneBookList.get(i).getEmail() + ",", FILE_PHONE);
            ReadWriteFile.writerFile("\n", FILE_PHONE);
        }
        phoneBookList.clear();
        System.out.println("-----------------------------------------------------------------------------------------");

    }


    private static void deletePhoneBook() {
        System.out.println("Enter the product id to delete");
        String phone = scanner.nextLine();
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (phoneBookList.get(i).getPhone() == phone) {
                phoneBookList.remove(phoneBookList.get(i));
                break;

            }
        }
    }

    private static void seachPhoneBook() {
        scanner.nextLine();
        System.out.println("Enter the product id to search");
        String id = scanner.nextLine();
        boolean check = true;
        for (PhoneBook phoneBook : phoneBookList) {
            if (id == (phoneBook.getPhone())) {
                System.out.println(phoneBook);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.err.println("This Phone is unavailable");
        }
    }
            private static void writePhoneBook () {

            }

            private static void readerPhoneBook () {

            }
        }

