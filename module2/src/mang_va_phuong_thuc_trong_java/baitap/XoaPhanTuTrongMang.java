package mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 9, 4, 9, 7};
        System.out.println("Nhập phần tử muốn xóa: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length-1;j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.println("Mảng sau khi xóa");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
