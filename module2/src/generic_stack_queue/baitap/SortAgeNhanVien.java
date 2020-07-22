package generic_stack_queue.baitap;

import java.util.Comparator;

public class SortAgeNhanVien implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        }else if (o1.getAge()<o2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
