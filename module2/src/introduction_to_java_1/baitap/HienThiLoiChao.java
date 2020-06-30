package introduction_to_java_1.baitap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println(name  + " Chào bạn");
    }
}
