package test_file.baitap;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File file =new File("D:\\CODEGYM\\module2\\src\\test_file\\baitap\\FileCopy.txt");
        File file1 = new File("D:\\CODEGYM\\module2\\src\\test_file\\baitap\\TestCopy.txt");
        try {
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(file1, true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            String  line ;
            System.out.println(" ok");
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
                bufferedWriter.write(line);
            }
            System.out.println(" not ok");
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            e.getStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
