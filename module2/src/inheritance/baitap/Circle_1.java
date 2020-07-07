package inheritance.baitap;

public class Circle_1 {
    public double radius = 3;
    public String color = "Blue";


    public Circle_1() {
    }

    public Circle_1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " Ban kinh: " + this.radius + " Color: " + this.color + " Dien tich: " + getArea();
    }
}
