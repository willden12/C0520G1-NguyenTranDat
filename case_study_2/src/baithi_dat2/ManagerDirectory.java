package baithi_dat2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerDirectory {
    static Scanner scn = new Scanner(System.in);
    public static final String File_BATH = "D:\\CODEGYM\\case_study_2\\src\\bai_thi_quang_2\\data\\contacts.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        List<Directory> listDirectory = new ArrayList<>();
        String input;
        do {
            System.out.print("1.\tDisplay list\n" +
                    "2.\tAdd new directory\n" +
                    "3.\tUpdate list \n" +
                    "4.\tDelete directory\n" +
                    "5.\tSearch directory\n" +
                    "6.\tWrite File directory\n" +
                    "7.\tRead File directory\n" +
                    "8.\tExit\n" +
                    "Enter input : ");
            input = scn.nextLine();
            switch (input) {
                case "1":
                    showDirectory(listDirectory);
                    break;
                case "2":
                    addNewDirectory(listDirectory);
                    break;
                case "3":
                    updateDirectory(listDirectory);
                    break;
                case "4":
                    deleteDirectory(listDirectory);
                    break;
                case "5":
                    searchDirectory(listDirectory);
                    break;
                case "6":
                    writeFile(listDirectory);
                    break;
                case "7":
                    showDirectory(readFile());
                case "8":
                    input = "-1";
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }
        while (!input.equals("-1"));
    }

    public static void addNewDirectory(List<Directory> listDirectory) {


        System.out.print("Enter phone number : ");
        String phoneNumber = CheckValueDateDirec.phoneNumber();

        System.out.print("Enter group name : ");
        String groupPhone = CheckValueDateDirec.checkNull();

        System.out.print("Enter name directory: ");
        String name = CheckValueDateDirec.checkNull();

        System.out.print("Enter gender : ");
        String gender = CheckValueDateDirec.checkNull();

        System.out.print("Enter address : ");
        String address = CheckValueDateDirec.checkNull();

        System.out.print("Enter day of birth : ");
        String dayOfBirth = CheckValueDateDirec.checkNull();

        System.out.print("Enter email : ");
        String email = CheckValueDateDirec.checkEmail();

        listDirectory.add(new Directory(phoneNumber, groupPhone, name, gender, address, dayOfBirth, email));
        showDirectory(listDirectory);
    }

    public static void updateDirectory(List<Directory> listDirectory) {
        System.out.print("Enter phone number want to update : ");
        String phoneNumber = scn.nextLine();
        updateDirectionChild(listDirectory, phoneNumber);
    }


    public static void showDirectory(List<Directory> listDirectory) {
        for (Directory directory : listDirectory) {
            System.out.println(directory.toString());
        }
    }

    public static void deleteDirectory(List<Directory> listDirectory) {
        System.out.print("Enter phone number want to delete : ");
        String phoneNumber = scn.nextLine();
        if (phoneNumber.equals("")) {
            displayMainMenu();
        } else {
            boolean check = false;
            for (int i = 0; i < listDirectory.size(); i++) {
                if (phoneNumber.equals(listDirectory.get(i).getPhoneNumber())) {
                    listDirectory.remove(i);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Phone number not exist in directory");
                deleteDirectory(listDirectory);
            } else
                System.out.println("Delete succession");
            showDirectory(listDirectory);
        }
    }

    public static void searchDirectory(List<Directory> listDirectory) {
        System.out.print("Enter phone number or name want to search : ");
        String phoneNumber = scn.nextLine();
        for (int i = 0; i < listDirectory.size(); i++) {
            if (listDirectory.get(i).getPhoneNumber().contains(phoneNumber) || listDirectory.get(i).getName().contains(phoneNumber)) {
                System.out.println(listDirectory.get(i).toString());
                break;
            }
        }
    }

    public static void writeFile(List<Directory> listDirectory) {
        System.out.print("Do you want to update file (Y/N):");
        String update = scn.nextLine();
        boolean check;
        if (update.equals("Y")) {
            check = false;
        } else {
            check = true;
        }
        File file = new File(File_BATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, check);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            for (Directory directory : listDirectory) {
                stringBuilder.append(directory.getPhoneNumber());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getGroupPhone());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getName());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getGender());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getAddress());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getDayOfBirth());
                stringBuilder.append(COMMA_DELIMITER);
                stringBuilder.append(directory.getEmail());
                stringBuilder.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.append(stringBuilder);
            System.out.println("CSV file was created successfully !!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while flushing/closing fileWriter !!!");
            e.printStackTrace();
        }
    }


    public static List<Directory> readFile() {
        List<Directory> list = new ArrayList<>();

        File fileRoom = new File(File_BATH);
        String[] arrayTemp;

        try {
            if
            (!fileRoom.exists()) {
                throw new FileNotFoundException("File not exists");
            }
            FileReader fileReader = new FileReader(fileRoom);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayTemp = line.split(",");

                Directory directory = new Directory(arrayTemp[0], arrayTemp[1], arrayTemp[2], arrayTemp[3], arrayTemp[4],
                        arrayTemp[5], arrayTemp[6]);
                list.add(directory);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println(e);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void updateDirectionChild(List<Directory> listDirectory, String phoneNumber) {
        if (phoneNumber.equals("")) {
            displayMainMenu();
        } else {
            boolean check = false;
            for (Directory directory : listDirectory) {
                if (phoneNumber.equals(directory.getPhoneNumber())) {
                    String input;
                    do {
                        System.out.print("1.\tEdit group\n" +
                                "2.\tEdit name directory\n" +
                                "3.\tEdit gender \n" +
                                "4.\tEdit address\n" +
                                "5.\tEdit day of birth\n" +
                                "6.\tEdit email\n" +
                                "7.\tExit\n" +
                                "Enter number to update : ");
                        input = scn.nextLine();
                        switch (input) {
                            case "1":
                                System.out.print("Enter group name : ");
                                String groupPhone = scn.nextLine();
                                directory.setGroupPhone(groupPhone);
                                break;
                            case "2":
                                System.out.print("Enter name directory: ");
                                String name = scn.nextLine();
                                directory.setName(name);
                                break;
                            case "3":
                                System.out.print("Enter gender : ");
                                String gender = scn.nextLine();
                                directory.setGender(gender);
                                break;
                            case "4":
                                System.out.print("Enter address : ");
                                String address = scn.nextLine();
                                directory.setAddress(address);
                                break;
                            case "5":
                                System.out.print("Enter day of birth : ");
                                String dayOfBirth = scn.nextLine();
                                directory.setDayOfBirth(dayOfBirth);
                                break;
                            case "6":
                                System.out.print("Enter email : ");
                                String email = scn.nextLine();
                                directory.setEmail(email);
                                break;
                            case "7":
                                input = "-1";
                                break;
                            default:
                                System.out.println("Wrong input ");
                        }
                    }
                    while (!input.equals("-1"));
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Wrong input : ");
                updateDirectory(listDirectory);
            } else {
                System.out.println("Edit succession");
            }
        }
    }
}
