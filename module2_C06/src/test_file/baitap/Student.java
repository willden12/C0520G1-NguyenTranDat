package test_file.baitap;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int ega;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getega() {
        return ega;
    }

    public void setEga(int ega) {
        this.ega = ega;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ega=" + ega +
                '}';
    }

    public Student(String name, int ega) {
        this.name = name;
        this.ega = ega;

    }
}
