package furama_resort.models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FileEmployeesStackStorage {
    public static void storeSearchEmployee(){
        StringBuilder result = new StringBuilder();
        try {
            String line=null;
            FileReader fileReader = new FileReader("src\\furama_resort\\data\\employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                result.append(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s =String.valueOf(result);

        String[] word = s.split(",");

        Stack<Employee> employeeStack = new Stack<>();
        List<Employee> employeeList = new ArrayList<>();
        int i = 0;
        System.out.println(word.length);
        System.out.println(word[3]);
        while (i<word.length){
            employeeList.add(new Employee(word[i],Integer.parseInt(word[i+1]),word[i+2]));
            i+=3;
        }

        for (int j = 0; j <employeeList.size() ; j++) {
            employeeStack.push(employeeList.get(j));
        }
        System.out.println("Input name of employee you want to search: ");
        String name = new Scanner(System.in).nextLine();
        for (int j = 0; j <employeeStack.size() ; j++) {
            if(name.equals(employeeStack.get(j).getNameEmployee())){


//            employeeStack.peek();
                System.out.println("Employee that you want to find is: "+employeeStack.get(j).toString());
                System.out.println("Employee that you want to find is: "+employeeStack.peek().toString());
                break;
            }
            employeeStack.remove(j);
        }
    }
}
