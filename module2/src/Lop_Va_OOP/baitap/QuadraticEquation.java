package Lop_Va_OOP.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * (a * c));
    }

    public double getRoot1() {
        return ((-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a));
    }

    public double getRoot2() {
        return ((-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scanner.nextInt();
        System.out.println("Nhap b");
        int b = scanner.nextInt();
        System.out.println("Nhap c");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a !=0){
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("pt vo nghiem");
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("PT co 2 nghiem bang nhau: "+ quadraticEquation.getRoot1());
        }else if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Nghiem thu nhat la: "+ quadraticEquation.getRoot1()+"nghiem thu 2 la: " + quadraticEquation.getRoot2());
        }}else {
            System.out.println("Ban that dai dot khi nhap a = 0");
        }

    }
}
