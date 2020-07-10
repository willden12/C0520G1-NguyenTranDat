package arraylist_linkedlist.baitap;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Dat");
        Student student2 = new Student(2,"Tung");
        Student student3 = new Student(3,"Khanh");
        Student student4 = new Student(4,"Chuong");
        Student student5 = new Student(5,"Toan");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

        for (Object student:studentMyList.elements) {
            if (student instanceof Student) {
                Student student6 = (Student)student;
                System.out.println(student6.getId());
                System.out.println(student6.getName());
            }
        }
        System.out.println(studentMyList.indexOf(student3));

//        MyList<Student> newList = new MyList<>();
//        newList = studentMyList.clone();
//        newList.remove(1);
//        for (Object student:newList.elements) {
//            if (student instanceof Student) {
//                Student student6 = (Student)student;
//                System.out.println(student6.getId());
//                System.out.println(student6.getName());
//            }
//        }


    }
}
