package static_method.baitap;

public class Circle {
    public double radius =1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius){
        this.radius =radius;
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea() {return this.radius*this.radius*Math.PI;
    }
}

