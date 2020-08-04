package furama_resort.controllers;

import furama_resort.commons.CompareCustomer;
import furama_resort.Exception.*;
import furama_resort.models.*;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class MainController {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        displayMainMenu();
    }

    public static void displayMainMenu() {
        int choice = 0;

        while (choice != 9) {
            System.out.println("-----  MENU  -----");
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tShow List of Customers in 4D Cinema\n" +
                    "8.\tSearch File of Employee in Resort\n" +
                    "9.\tExit");
            System.out.println("Input your choice in Menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewServies();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomers();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInfomationOfEmployees();
                    break;
                case 7:
                    showListOfCustomersin4DCinema();
                    break;
                case 8:
                    searchFileOfEmployee();
                    break;
                case 9:
                    break;
            }
        }
    }

    private static void searchFileOfEmployee() {
    }

    private static void showListOfCustomersin4DCinema() {
    }

    private static void showInfomationOfEmployees() {
    }

    private static void addNewBooking() {
    }

    public static void addNewServies() {
        int choiceService = 0;
        while (choiceService != 5) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Select the service you want to hire");
            choiceService = Integer.parseInt(scanner.nextLine());
            switch (choiceService) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    break;
            }
        }

    }

    public static void addNewVilla() {
        System.out.println("Please input the information of the Villa rental service below:");
        boolean isvalid;
        InputSimilar_Villa_House_Room inputSimilarVillaHouseRoom = new InputSimilar_Villa_House_Room();
        String id = inputSimilarVillaHouseRoom.getId();
        String nameService = inputSimilarVillaHouseRoom.getNameService();
        double usableArea = inputSimilarVillaHouseRoom.getUsableArea();
        int rentalCosts = inputSimilarVillaHouseRoom.getRentalCosts();
        int maxNumberOfPeople = inputSimilarVillaHouseRoom.getMaxNumberOfPeople();
        String typeOfRent = inputSimilarVillaHouseRoom.getTypeOfRent();
        //---------------------7----------------
        String roomStandard;
        do {
            System.out.println("Input Room Standard: ");
            roomStandard = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$", roomStandard);
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);
        isvalid = false;
        ///////////////////////////////////////8//////////////////////////////////////////////////////

        System.out.println("Input Other Facilities:");
        String otherFacilities = scanner.nextLine();
        //-----------------------9------------------------------------------
        double poolArea;
        do {
            System.out.println("Input Pool Area");
            poolArea = Double.parseDouble(scanner.nextLine());
            if (poolArea > 30) {
                isvalid = true;
            }
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);
        isvalid = false;

        //-------------------------10-----------------------------
        int numberOfFloors;
        do {
            System.out.println("Input Number of Floors");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
            if (numberOfFloors > 0) {
                isvalid = true;
            }
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);
        isvalid = false;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        String PATH = "src\\furama_resort\\data\\villa.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.write(id + ", " + nameService + ", " + usableArea + "," + rentalCosts + "," + maxNumberOfPeople + "," +
                    typeOfRent + "," + roomStandard + "," + otherFacilities + "," + poolArea + "," + numberOfFloors + "," + "\n");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewHouse() {
        System.out.println("Please input the information of the House rental service below:");
        boolean isvalid;
        InputSimilar_Villa_House_Room inputSimilarVillaHouseRoom = new InputSimilar_Villa_House_Room();
        String id = inputSimilarVillaHouseRoom.getId();
        String nameService = inputSimilarVillaHouseRoom.getNameService();
        double usableArea = inputSimilarVillaHouseRoom.getUsableArea();
        int rentalCosts = inputSimilarVillaHouseRoom.getRentalCosts();
        int maxNumberOfPeople = inputSimilarVillaHouseRoom.getMaxNumberOfPeople();
        String typeOfRent = inputSimilarVillaHouseRoom.getTypeOfRent();
        //---------------------7-----------------------------------------------------
        String roomStandard;
        do {
            System.out.println("Input Room Standard: ");
            roomStandard = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$", roomStandard);
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);
        isvalid = false;
        //////////////////////////////////////////8//////////////////////////////////////////////////////////

        System.out.println("Input Other Facilities:");
        String otherFacilities = scanner.nextLine();

        ////////////////////////////////////////////9//////////////////////////////////////////////////////
        int numberOfFloors;
        do {
            System.out.println("Input Number of Floors");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
            if (numberOfFloors > 0) {
                isvalid = true;
            }
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);
        isvalid = false;
        //----------------------------------------------------------


        String PATH = "src\\furama_resort\\data\\house.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.write(id + ", " + nameService + ", " + usableArea + "," + rentalCosts + "," + maxNumberOfPeople + "," +
                    typeOfRent + "," + roomStandard + "," + otherFacilities + "," + numberOfFloors + "," + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewRoom() {
        InputSimilar_Villa_House_Room inputSimilarVillaHouseRoom = new InputSimilar_Villa_House_Room();
        System.out.println("Please input the information of the House rental service below:");
        String id = inputSimilarVillaHouseRoom.getId();
        String nameService = inputSimilarVillaHouseRoom.getNameService();
        double usableArea = inputSimilarVillaHouseRoom.getUsableArea();
        int rentalCosts = inputSimilarVillaHouseRoom.getRentalCosts();
        int maxNumberOfPeople = inputSimilarVillaHouseRoom.getMaxNumberOfPeople();
        String typeOfRent = inputSimilarVillaHouseRoom.getTypeOfRent();
        //-----
        String freeAccompanyingService;
        boolean isvalid;
        do {
            System.out.println("Input The free accompanying Service:");
            freeAccompanyingService = scanner.nextLine();
            isvalid = Pattern.matches("massage|karaoke|food|drink|car", freeAccompanyingService);
            if (!isvalid) {
                System.out.println("inputted wrong, please input again");
            }
        } while (!isvalid);


        //---------------------------------
        String PATH = "src\\furama_resort\\data\\room.csv";

        try {
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.write(id + ", " + nameService + ", " + usableArea + "," + rentalCosts + "," + maxNumberOfPeople + "," +
                    typeOfRent + "," + freeAccompanyingService + "," + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showServices() {

        int choice = 0;
        while (choice != 8) {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Room Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Input your choice in menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllNameVillaNotDuplicate();
                    break;
                case 5:
                    showAllNameHouseNotDuplicate();
                    break;
                case 6:
                    showAllNameRoomNotDuplicate();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    break;
            }
        }
    }

    private static void showAllNameRoomNotDuplicate() {

    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameVillaNotDuplicate() {
    }

    public static void showAllVilla() {
        String PATH = "src\\furama_resort\\data\\villa.csv";
        List<Villa> villaList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
//            StringBuffer result = new StringBuffer();
            String line = null;
            Villa villa;
            String[] arrVilla;
            while ((line = bufferedReader.readLine()) != null) {
//                result.append(line);
                arrVilla = line.split(",");

                villa = new Villa(arrVilla[0], arrVilla[1], Double.parseDouble(arrVilla[2]), Integer.parseInt(arrVilla[3]),
                        Integer.parseInt(arrVilla[4]), arrVilla[5], arrVilla[6], arrVilla[7],
                        Double.parseDouble(arrVilla[8]), Integer.parseInt(arrVilla[9]));
                villaList.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
//            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of villa: ");
        for (Villa villa : villaList) {
            villa.showInfo();
        }
    }

    public static void showAllHouse() {
        String PATH = "src\\furama_resort\\data\\house.csv";
        List<House> houseList = new ArrayList<>();
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrHouse = line.split(",");
                House house = new House(arrHouse[0], arrHouse[1], Double.parseDouble(arrHouse[2]),
                        Integer.parseInt(arrHouse[3]), Integer.parseInt(arrHouse[4]), arrHouse[5],
                        arrHouse[6], arrHouse[7], Integer.parseInt(arrHouse[8]));
                houseList.add(house);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("List of House is:");
        for (House house : houseList) {
            house.showInfo();
        }

    }

    public static void showAllRoom() {
        String PATH = "src\\furama_resort\\data\\room.csv";
        String line = null;
        List<Room> roomList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrRoom = line.split(",");
                Room room = new Room(arrRoom[0], arrRoom[1], Double.parseDouble(arrRoom[2]), Integer.parseInt(arrRoom[3]),
                        Integer.parseInt(arrRoom[4]), arrRoom[5], arrRoom[6]);
                roomList.add(room);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("List of Room is: ");
        for (Room room : roomList) {
            room.showInfo();
        }
    }

    public static void addNewCustomer() {
        System.out.println("Input information of a customer below:");

        String nameCustomer;
        while (true) {
            try {
                System.out.println("Input name of a customer:");
                nameCustomer = scanner.nextLine();//1
                if (!Pattern.matches("([A-Z]([a-z])* ?)+", nameCustomer)) {
                    throw new NameException("Name of Customer must capitalize the first character in each word");
                    //Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }

        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        String birthday;
        while (true) {
            try {
                System.out.println("Input birthday of a customer: ");
                birthday = scanner.nextLine();//2
                if (!Pattern.matches("[0-9]{2}/[0-9]{2}/(19[0-9][0-9]|20(00|01|02))", birthday)) {
                    throw new BirthdayException("birthday: dd/MM/yyyy, year>1900, year < (currentYear -18)");
                }
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
                ;
            }
        }
        String gender;
        while (true) {
            try {
                System.out.println("Input gender of a customer: ");
                gender = scanner.nextLine();//3
                if (!Pattern.matches("Male|Female|Unknown", gender)) {
                    throw new GenderException("The name must be: Male, Female, Unknown");
                }
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
                ;
            }

        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        String idCard;
        while (true) {
            try {
                System.out.println("Input number of identity card");
                idCard = scanner.nextLine();//4
                if (!Pattern.matches("[\\d]{3} [\\d]{3} [\\d]{3}", idCard)) {
                    throw new IdException("IdCard of customer must follow the format: XXX XXX XXX, with X: integer");
                }
                break;
            } catch (IdException e) {
                System.out.println(e.getMessage());
                ;
            }

        }
        //----------------
        System.out.println("Input phonenumber of a customer: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());//5
        //--------------------
        String email;
        while (true) {
            try {
                System.out.println("Input email of a customer: ");
                email = scanner.nextLine();//6
                if (!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", email)) {
                    throw new EmailException("Email must follow format: 'abc@abc.abc'");
                }
                break;
            } catch (EmailException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Input type of customer: ");
        String typeOfCustomer = scanner.nextLine();//7
        System.out.println("Input address of a customer: ");
        String address = scanner.nextLine();//8
        //---------------------------------
        String PATH = "src\\furama_resort\\data\\customer.csv";
        try {
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.write(nameCustomer + "," + birthday + "," + gender + "," + idCard + "," + phoneNumber + "," + email + "," +
                    typeOfCustomer + "," + address + "," + "\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showInformationCustomers() {
        String line = "";
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\furama_resort\\data\\customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                String[] arrCustomer = line.split(",");
                Customer customer = new Customer(arrCustomer[0], arrCustomer[1], arrCustomer[2], arrCustomer[3],
                        Integer.parseInt(arrCustomer[4]), arrCustomer[5], arrCustomer[6], arrCustomer[7]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("List of customers is:");
        Collections.sort(customerList, new CompareCustomer());
        for(Customer customer: customerList){
            customer.showInfo();
        }
    }

}
