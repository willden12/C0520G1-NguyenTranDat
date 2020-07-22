package java_collection_framework.baitap.productarraylist;

import java.util.*;

public class ProductArrayListTest {
    public static void main(String[] args) {
        ProductArrayListTest manager = new ProductArrayListTest();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean check = true;
        while (check) {
            System.out.println("1.Add product " +
                    "\n2.Edit product" +
                    "\n3.Delete product" +
                    "\n4.Display list of products" +
                    "\n5.Finding a product" +
                    "\n6.Sort list of products by price" +
                    "\n7.Exit");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    sortPrice();
                    break;
                case 7:
                    check = false;
                    break;
            }

        }

    }

    static List<Product> myListProduct = new ArrayList<>();

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID: ");
        int id = scanner.nextInt();
        System.out.print("Input your name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price =scanner.nextInt();
        Product product1 = new Product(id, name, price);
        myListProduct.add(product1);
        System.out.println("List of Products: ");
        for (Product product : myListProduct) {
            System.out.println("ID: " + product.getId() + ", name: " + product.getName() + " Price: " + product.getPrice() + "USD");
        }
        System.out.println("///////////////////////////////////////////////////////////////");

    }

    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input product's ID you want to edit: ");
        int id = scanner.nextInt();
        System.out.print("Editing name of product: ");
        String name = scanner.nextLine();
        for (Product product : myListProduct) {
            if (id == product.getId()) {
                product.setName(name);
            }
        }
        System.out.println("List of product: ");
        for (Product product : myListProduct) {
            System.out.println("ID: " + product.getId() + ", name: " + product.getName() + ", Price: " + product.getPrice() + "USD");
        }
        System.out.println("/////////////////////////////////////////////////////////////");
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("\n" + "Enter the product id you want to delete : ");
        int id = scanner.nextInt();
        for (int i = 0; i < myListProduct.size(); i++) {
            if (myListProduct.get(i).getId() == id) {
                 myListProduct.remove(i);
                 break;
            }
        }
        System.out.println("List of product: ");
        for (Product product : myListProduct) {
            System.out.println(product.getId() + ". " + product.getName() + ": " + product.getPrice() + "đ");
        }
        System.out.println("////////////////////////////////////////////////////////////////////");
    }

    public static void displayProduct() {
        System.out.println();
        System.out.println("List of product: ");
        for (Product product : myListProduct) {
            System.out.println(product.getId() + ". " + product.getName() + ": " + product.getPrice() + "đ");
        }
        System.out.println("////////////////////////////////////////////////////////////////////");
    }

    public static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name to search: ");
        String name = scanner.nextLine();
        for (Product product : myListProduct) {
            if (name.equals(product.getName())) {
                System.out.println("\n" + "Product information you want to find: ");
                System.out.println(product.getId() + ". " + product.getName() + ": " + product.getPrice() + "đ");
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////////");
    }

    public static void sortPrice() {
        int choose;
        System.out.println("1. sort ascending"+"\n"+
                "2. Sort descending");
        Scanner input = new Scanner(System.in);
        choose = input.nextInt();
        if (choose == 1) {
            Collections.sort(myListProduct,new SortProduct());
        } else if (choose == 2) {
            Collections.sort(myListProduct, new SortProduct_1());

        }
        System.out.println("List of product: ");
        for (int i = 0; i < myListProduct.size(); i++) {
            System.out.println(myListProduct.get(i).getId() + ". " + myListProduct.get(i).getName() + ": " + myListProduct.get(i).getPrice() + "đ");
        }
        System.out.println("/////////////////////////////////////////////////////////////////");
    }


}

