package test_file.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary {
    static List<Student> studentList = new ArrayList<>();
    static final String FILE_PATH ="DATA.txt";
    static final String FILE_PATH_1 ="COPY.txt";
    public static void writeFile(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            Student student1 = new Student("Tien", 25);
            Student student2 = new Student("Dat09", 29);
            Student student3 = new Student("Hai", 20);
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String filePath) {
        try {
            FileOutputStream newFos= new FileOutputStream(FILE_PATH_1);
            ObjectOutputStream newObjectOutputStream=new ObjectOutputStream(newFos);
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream   objectInputStream = new ObjectInputStream(fis);
            List<Student> studentList = (List<Student>) objectInputStream.readObject();
            for (Student student : studentList) {
                System.out.println(student.getName() + " " + student.getega() );
                newObjectOutputStream.writeObject(student);
            }
            System.out.println("So byte "+filePath.length());
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("class khong ton tai");
        }
    }
    public static void main(String[] args) {
        writeFile(FILE_PATH);
        readFile(FILE_PATH);
    }
}
