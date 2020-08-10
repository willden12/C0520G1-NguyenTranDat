package bai_tap_ve_nha.quan_ly_san_pham;

import java.util.Scanner;

public class Main extends ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add products ");
            System.out.println("2.Search product");
            System.out.println("3.Display product");
            System.out.println("4.Delete Product");
            System.out.println("5.Exit");
            int chosse = scanner.nextInt();
            switch (chosse) {
                case 1: {
                    System.out.println("1.input name");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    boolean check = true;
                    int id;
                    if (myProductList.size() >= 1) {
                        do {
                            System.out.println("2.input id");
                            id = scanner.nextInt();
                            for (int i = 0; i < myProductList.size(); i++) {
                                if (id == myProductList.get(i).getId()) {
                                    System.err.println("Duplicate code");
                                    check = false;
                                    break;
                                }
                                check = true;
                            }
                        } while (!check);
                    } else {
                        System.out.println("2.input id");
                        id = scanner.nextInt();
                    }
                    scanner.nextLine();
                    System.out.println("3.input brand");
                    String brand = scanner.nextLine();
                    System.out.println("4.input price");
                    double price = scanner.nextDouble();
                    myProductList.add(new Product(id, name, brand, price));
                }
                break;
                case 2: {
                    scanner.nextLine();
                    System.out.println("Enter the product id to search");
                    int id = scanner.nextInt();
                    boolean check = true;
                    for (Product product : myProductList) {
                        if (id == (product.getId())) {
                            System.out.println(product);
                            check = true;
                            break;
                        } else {
                            check = false;
                        }
                    }
                    if (!check) {
                        System.err.println("This product is unavailable");
                    }
                }
                break;
                case 3: {
                    readerFile(FILE_PATH);
                }
                break;
                case 4: {
                    System.out.println("Enter the product id to delete");
                    int id = scanner.nextInt();
                    for (int i = 0; i < myProductList.size(); i++) {
                        if (id == myProductList.get(i).getId()) {
                            myProductList.remove(myProductList.get(i));
                            break;
                        }
                    }
                }
                break;
                case 5: {
                    System.exit(0);
                }
            }
            writerFile(FILE_PATH);
        }
    }
}

