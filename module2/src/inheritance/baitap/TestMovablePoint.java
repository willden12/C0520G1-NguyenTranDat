package inheritance.baitap;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint= new MovablePoint();

        movablePoint = new MovablePoint(3,5,6,4);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
