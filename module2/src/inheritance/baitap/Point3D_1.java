package inheritance.baitap;

public class Point3D_1 extends Ponit2D_1 {
    public float z =0.0f;

    public Point3D_1() {
        super();
    }

    public Point3D_1(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        this.x =x;
        this.y =y;
        this.z =z;
    }
    public float[] getXYZ(){
        float[] array1 = new float[3];
        array1[0]=this.x;
        array1[1]=this.y;
        array1[2]=this.z;
        return array1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
