package generic_stack_queue.baitap;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueueTest {
    public static void main(String[] args) {
        Queue<NhanVien> girl = new LinkedList<>();
        Queue<NhanVien> men = new LinkedList<>();
        int size =6;
        NhanVien[] list = new NhanVien[size];
        list[0] = new NhanVien("Mai", 18,"NU");
        list[1] = new NhanVien("Toan", 27,"NAM");
        list[2] = new NhanVien("Ha", 23,"NU");
        list[3] = new NhanVien("Nhung", 19,"NU");
        list[4] = new NhanVien("Tung", 24,"NAM");
        list[5] = new NhanVien("Linh", 21,"NU");

        for (NhanVien a : list){
            System.out.println(a.toString());
        }
        for (int i=0;i< list.length;i++){
            if (list[i].getGender().equals("NU")){
                girl.add(list[i]);
            }else {
                men.add(list[i]);
            }
        }
        int count = 0;
        while (!girl.isEmpty()){
            list[count] = girl.poll();
            count++;
        }


        while (!men.isEmpty()){
            list[count] = men.poll();
            count++;
        }
        System.out.println("--------------------------------------");
        for (NhanVien a : list){
            System.out.println(a.toString());
        }
    }
}
