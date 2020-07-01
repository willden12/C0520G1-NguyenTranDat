package mang_va_phuong_thuc_trong_java.thuchanh;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array) {
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index= 1;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
               index += i;
            }
        }
        System.out.println("giá trị nhỏ nhất"+min+ ""+index);

    }
}
