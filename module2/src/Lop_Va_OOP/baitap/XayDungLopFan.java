package Lop_Va_OOP.baitap;

public class XayDungLopFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.fast);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.tostring());

        fan2.setSpeed(2);
        fan2.setOn(true);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.tostring());
    }

}

class Fan{
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String tostring() {
        if (this.on) {
            return "Fan is on " + "\n" + "Speed: " + this.speed + "\n" + "Radius: " + this.radius + "\n" + "Color: " + this.color;
        } else {
            return "Fan is off" + "\n" + "Radius: " + this.radius + "\n" + "Color: " + this.color;

        }
    }
}
