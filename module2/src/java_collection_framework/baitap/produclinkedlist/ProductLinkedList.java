package java_collection_framework.baitap.produclinkedlist;


import java.util.*;

public class ProductLinkedList {
    public static void main(String[] args) {
        List<Product_1> myLinkedListProduct = new LinkedList<>();
        myLinkedListProduct.add(new Product_1(1,"Samsung", 2000));
        myLinkedListProduct.add(new Product_1(2,"Iphone", 4000));
        myLinkedListProduct.add(new Product_1(3,"Nokia", 3000));
        myLinkedListProduct.add(new Product_1(4,"BenQ", 1500));
        myLinkedListProduct.add(new Product_1(5,"Sony", 3500));
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
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct(scanner, myLinkedListProduct);
                    break;
                case 2:
                    editProduct(scanner, myLinkedListProduct);
                    break;
                case 3:
                    deleteProduct(scanner, myLinkedListProduct);
                    break;
                case 4:
                    displayProduct(myLinkedListProduct);
                    break;
                case 5:
                    findProduct(scanner, myLinkedListProduct);
                    break;
                case 6:
                    sortPrice(myLinkedListProduct);
                    break;
                case 7:
                    check = false;
                    break;
            }

        }

    }


    public static void addProduct(Scanner scanner, List<Product_1> myLinkedListProduct) {
        System.out.print("Input ID : ");
        int id = scanner. nextInt();
        System.out.print("Input your name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Input price: ");
        int price = scanner.nextInt();
        myLinkedListProduct.add(new Product_1(id, name, price));
        System.out.println("List of Products: ");
        displayProduct(myLinkedListProduct);
        System.out.println("///////////////////////////////////////////////////////////////");

    }

    public static void editProduct(Scanner scanner, List<Product_1> myLinkedListProduct) {
        System.out.print("Input product's ID you want to edit: ");
        int id = scanner.nextInt();
        System.out.print("Editing name of product: ");
        String name = scanner.nextLine();
        for (Product_1 product : myLinkedListProduct) {
            if (id == product.getId()) {
                product.setName(name);
            }
        }
        System.out.println("List of product: ");
        displayProduct(myLinkedListProduct);
        System.out.println("/////////////////////////////////////////////////////////////");
    }

    public static void deleteProduct(Scanner scanner, List<Product_1> myLinkedListProduct) {
        System.out.print("\n" + "Enter the product id you want to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < myLinkedListProduct.size(); i++) {
            if (myLinkedListProduct.get(i).getId() == id) {
                myLinkedListProduct.remove(i);
                break;
            }
        }
        displayProduct(myLinkedListProduct);
        System.out.println("////////////////////////////////////////////////////////////////////");
    }

    public static void displayProduct(List<Product_1> myLinkedListProduct) {
        System.out.println("List of product: ");
        for (Product_1 product : myLinkedListProduct) {
            System.out.println(product);
        }
        System.out.println("////////////////////////////////////////////////////////////////////");
    }

    public static void findProduct(Scanner scanner, List<Product_1> myLinkedListProduct) {
        scanner.nextLine();
        System.out.print("Enter the product name to search: ");
        String name = scanner.nextLine();
        for (Product_1 product : myLinkedListProduct) {
            if (name.equals(product.getName())) {
                System.out.println("\n" + "Product information you want to find: ");
                System.out.println(product.getId() + ". " + product.getName() + ": " + product.getPrice() + "USD");
            }
        }
        System.out.println("/////////////////////////////////////////////////////////////////////");
    }

    public static void sortPrice(List<Product_1> myLinkedListProduct) {
        int choose;
        System.out.println("1. sort ascending" + "\n" +
                "2. Sort descending");
        Scanner input = new Scanner(System.in);
        choose = input.nextInt();
        if (choose == 1) {
            Collections.sort(myLinkedListProduct, new SortProductLinkedList());
        } else if (choose == 2) {
            Collections.sort(myLinkedListProduct, new SortProductLinkedList2());
        }
        System.out.println("List of product: ");
        displayProduct(myLinkedListProduct);
        System.out.println("/////////////////////////////////////////////////////////////////");
    }
}
