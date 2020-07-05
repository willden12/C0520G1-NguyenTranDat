package Lop_Va_OOP.thuchanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double widgt;
    double height;


    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double widgt, double height) {
        this.widgt = widgt;
        this.height = height;
    }

    public void setWidgt(double widgt){
        this.widgt =widgt;
    }

    public double getWidgt(){
        return this.widgt;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.widgt * this.height;
    }

    public double getPerimeter() {
        return (this.widgt + this.height) * 2;
    }

    public String display() {
        return "Hinh chu nhat{" + "widgt =" + widgt + "height =" + height + "}";

    }
}

 class Hinhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap widgt");
        double width = scanner.nextDouble();
        System.out.println("Nhap height");
        double height = scanner.nextDouble();
        LopHinhChuNhat hinhChuNhat = new LopHinhChuNhat(width,height);

        System.out.println("Dien tich la: "+ hinhChuNhat.getArea());
        System.out.println("Chu vi la: "+ hinhChuNhat.getPerimeter());
        System.out.println(hinhChuNhat.display());
    }
}
