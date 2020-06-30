package introduction_to_java_1.baitap;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        double vnd =23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập usd mún quy đổi");
        usd = scanner.nextDouble();
        double quydoi = usd*vnd;
        System.out.println("Giá trị quy đổi : "+ quydoi);

    }
}
