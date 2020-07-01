package vong_lap_trong_java.baitap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int number;
        String string = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố");
        number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                string =string + N + ",";
                count++;
            }
            N++;
        }
        System.out.println(number+" Số nguyên tố đầu tiên : "+ string);
    }
}



