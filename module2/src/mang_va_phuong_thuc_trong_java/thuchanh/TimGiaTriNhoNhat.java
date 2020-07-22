package mang_va_phuong_thuc_trong_java.thuchanh;

public class TimGiaTriNhoNhat {

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index += i;
            }
        }
        System.out.println("giá trị nhỏ nhất là : " + min + "\n" + " ở vị trí số: " + index);

    }
}
