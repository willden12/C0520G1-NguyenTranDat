package searching.baitap;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
        int low=0;
        int hight = list.length;
        int key;
        System.out.println("Nhập số cần tìm :");
        Scanner scanner =new Scanner(System.in);
        key =scanner.nextInt();
        System.out.println(binarySearch(list,low , hight,key));
    }


    static int binarySearch(int[] list, int low, int hight, int key) {

        if (hight >= low) {
            int mid = (low + hight) / 2;
            if (key == list[mid]) {
                return mid;
            }else if (key < list[mid]){
                return binarySearch( list,low, mid-1,key );
            }else {
                return binarySearch(list,mid+1,hight,key);
            }
        }
        return -1;
    }
}



