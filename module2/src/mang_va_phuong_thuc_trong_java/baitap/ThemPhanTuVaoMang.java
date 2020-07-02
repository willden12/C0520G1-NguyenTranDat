package mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr={1,5,8,3,6,0,2,6,7,40,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn mún chèn");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí mún chèn");
        int index = scanner.nextInt();
        if (index <= 1 && index >= arr.length-1){
            System.out.println("Không chèn được vào mảng");
        }else {
            for (int i= arr.length-1;i >index;i--){
                arr[i] = arr[i-1];
            }
            arr[index]= number;
        }
        for (int element : arr){
            System.out.print(element + "  ");
        }
    }
}
