package mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("Nhập phần tử tai hàng" + (i + 1) + " cột " + (j + 1) + ": ");
                arr1[i][j] = scanner.nextInt();

            }
        }
        for (int[] element : arr1) {
            for (int x : element) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length;i++ ) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (max < arr1[i][j]) {
                    max = arr1[i][j];
                }
            }

        }
        System.out.println("Giá trị lớn nhất: " + max );
    }
}
