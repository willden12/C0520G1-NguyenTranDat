package inheritance.baitap;

public class Point_2 {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point_2() {
    }

    public Point_2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void  setXY(float x, float y){
        this.x = x;
        this.y = y;

    }
    public float[] getXY() {
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    @Override
    public String toString() {
        return "Point_2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
