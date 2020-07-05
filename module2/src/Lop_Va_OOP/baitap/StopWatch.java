package Lop_Va_OOP.baitap;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Date starTime;
    Date endTime;

    public StopWatch() {
    }
    public void star(){
        Date date = new Date();
        this.starTime =date;
    }
    public void stop(){
        Date date = new Date();
        this.endTime =date;
    }
    public long getElapsedTime(){
        return endTime.getTime() - starTime.getTime();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch date = new StopWatch();
        date.star();
        for (int i=0; i<5;i++){
            System.out.println("Nhap so");
            int other = scanner.nextInt();
            System.out.println(other);
        }
        date.stop();
        System.out.println("Thoi gian chuong trinh chay"+date.getElapsedTime()+ "mili");

    }
}
