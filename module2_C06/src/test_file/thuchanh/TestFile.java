package test_file.thuchanh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("dat09");
        file.mkdir();
        File file1 =new File("dat09/khanh08.txt");
//        File file2 =new File("/dat09/khanh07.txt");
//        File file3 =new File("/dat09/khanh06.txt");
        try {
            FileWriter f1 = new FileWriter(file1);
            f1.write("chuong chat choi"+"\n");
            f1.write("khanh khu kho"+"\n");
            f1.write("Tung tum tim"+"\n");
            f1.close();
            System.out.println(" ok ");

        }catch (IOException e){


    }}
}
