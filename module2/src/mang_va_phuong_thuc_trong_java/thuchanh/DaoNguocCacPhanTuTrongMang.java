package mang_va_phuong_thuc_trong_java.thuchanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("ko dc nhập quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
            System.out.println("Giá trị của mảng: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");

            }
            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;

            }
            System.out.println("Giá trị nghịch đảo: "+"\n");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }

        }
    }
}

