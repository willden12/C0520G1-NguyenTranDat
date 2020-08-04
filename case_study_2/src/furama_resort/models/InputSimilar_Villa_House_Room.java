package furama_resort.models;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputSimilar_Villa_House_Room {
    static Scanner scanner = new Scanner(System.in);
    static boolean isvalid = false;
    public static String getId(){
        String id;
        do{
            System.out.println("Input Id");
            id = scanner.nextLine();
            isvalid = Pattern.matches("SV(VL|HO|RO)-[0-9]{4}",id);
            if(!isvalid){
                System.out.println("Inputted wrong, please input again");
            }
        }while (!isvalid);
        return id;
    }

    public static String getNameService(){
        String nameService;
        do{
            System.out.println("Input name of sevice:");
            nameService = scanner.nextLine();
            isvalid = Pattern.matches("[A-Z][a-z]+",nameService);
            if(!isvalid){
                System.out.println("Inputted wrong, please input again");
            }
        }while (!isvalid);
        return nameService;
    }

    public static double getUsableArea(){
        double usableArea;
        isvalid=false;
        do {
            System.out.println("Input usable Area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            if(usableArea>30){
                isvalid=true;
            }
            if(!isvalid){
                System.out.println("Inputted wrong, please input again");
            }
            System.out.println(isvalid);
//            String check = Double.toString(usableArea);
//            isvalid = Pattern.matches("([3-9]{1}[0-9]{1})|([0-9]+[0-9]+[0-9]+$)",check);
        }while (!isvalid);
        return usableArea;
    }

    public static int getRentalCosts(){
        int rentalCosts;
        isvalid=false;
        do{
            System.out.println("Input retal Costs:");
            rentalCosts = Integer.parseInt(scanner.nextLine());
            if(rentalCosts>0) {
                isvalid = true;
            }
            if(!isvalid){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        return rentalCosts;
    }

    public static int getMaxNumberOfPeople(){
        int maxNumberOfPeople;
        isvalid=false;
        do{
            System.out.println("Input Max Number Of People: ");
            maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
            if(maxNumberOfPeople>0 && maxNumberOfPeople<20){
                isvalid = true;
            }
            if(!isvalid){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        return maxNumberOfPeople;
    }


    public static String getTypeOfRent(){
        String typeOfRent;
        isvalid=false;
        do{
            System.out.println("Input Type Of Rent");
            typeOfRent = scanner.nextLine();
            isvalid = Pattern.matches("^[A-Z][a-z]+$",typeOfRent);
            if(!isvalid){
                System.out.println("inputted wrong, please input again");
            }
        }while (!isvalid);
        return typeOfRent;
    }
}
