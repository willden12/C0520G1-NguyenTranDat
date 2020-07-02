package mang_va_phuong_thuc_trong_java.baitap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 2, 8};
        int[] arr2 = {5, 6, 3, 5, 9, 8, 12};
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }
}
