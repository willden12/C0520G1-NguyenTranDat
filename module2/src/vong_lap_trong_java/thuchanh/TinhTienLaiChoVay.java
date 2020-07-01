package vong_lap_trong_java.thuchanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền");
        money = scanner.nextDouble();
        System.out.println("Nhập tháng gửi");
        month =scanner.nextInt();
        System.out.println("Nhập lãi suất");
        interset_rate =scanner.nextDouble();
        double total_interset = 0;

            total_interset= money*(interset_rate/100)/12*month;
        System.out.println("Lãi của bạn là "+ total_interset );
    }
}
