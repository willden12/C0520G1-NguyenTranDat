package mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban mun nhap bao nhiu phan tu");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat :" + min);

    }


}
