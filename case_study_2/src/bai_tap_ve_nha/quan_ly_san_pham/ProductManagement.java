package bai_tap_ve_nha.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    static List<Product> myProductList = new ArrayList<>();
    static final String FILE_PATH = "D:\\CODEGYM\\case_study_2\\src\\bai_tap_ve_nha\\quan_ly_san_pham\\file_product";

    public static void writerFile(String file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myProductList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerFile(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> productList = (List<Product>) objectInputStream.readObject();
            for (Product product1 : productList) {
                System.out.println("Product:[ Id:" + product1.getId() + " Name: " + product1.getName() + " Brand: " + product1.getBrand() + " Price: " + product1.getPrice() + " ]");
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class Not Found");
        }
    }}


