package mang_va_phuong_thuc_trong_java.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr={1,5,8,3,6,0,2,6,7,40,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so mun chen");
        int number = scanner.nextInt();
        System.out.println("Nhap vi tri mun chen");
        int index = scanner.nextInt();
        if (index <= 1 && index >= arr.length-1){
            System.out.println("Khong chen duoc vao mang");
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
