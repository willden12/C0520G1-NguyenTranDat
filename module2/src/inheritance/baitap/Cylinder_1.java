package inheritance.baitap;

public class Cylinder_1 extends Circle_1 {
    public double height = 6;

    public Cylinder_1() {
    }

    public Cylinder_1(double height) {
        this.height = height;
    }
    public double getVolumeCylindrical(){
        return this.height*getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return " Chieu cao: " + getHeight()+ " The tich: "+ getVolumeCylindrical()+ super.toString();
    }

}