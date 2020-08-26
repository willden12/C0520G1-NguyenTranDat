package test_file.quan_ly_san_pham_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    static List<Product_2> myProductList = new ArrayList<>();
    static final String FILE_PATH = "D:\\CODEGYM\\module2\\src\\test_file\\quan_ly_san_pham_file_nhi_phan\\file_product";

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
            List<Product_2> productList = (List<Product_2>) objectInputStream.readObject();
            for (Product_2 product1 : productList) {
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


