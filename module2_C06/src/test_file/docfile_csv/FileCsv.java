package test_file.docfile_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCsv {
    public static void main(String[] args) {
        File file = new File("D:\\CODEGYM\\module2\\src\\test_file\\docfile_csv\\FileCsv");
        if (file.isFile()){
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] arrayTemp;
                while ((line = bufferedReader.readLine()) != null) {
                    arrayTemp = line.split(",");
                    System.out.println("Quốc gia [ Mã: " + arrayTemp[4] + "  Tên: " + arrayTemp[5] + " ]");
                }
                bufferedReader.close();
                fileReader.close();
            }catch (ArrayIndexOutOfBoundsException i){
                System.out.println("Nhap arrayTemp nho hon 5 nhoe");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else System.out.println("File ko ton tai");

    }
}
