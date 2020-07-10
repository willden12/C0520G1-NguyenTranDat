package arraylist_linkedlist.baitap;

public class LinkedListTest {
    public static void main(String[] args) {
    class Student{
        private int id;
        private String name;
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
    MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
    Student student1 = new Student(1, "Dat 1");
    Student student2 = new Student(2, "Dat 2");
    Student student3 = new Student(3, "Dat 3");
    Student student4 = new Student(4, "Dat 4");
    Student student5 = new Student(5, "Dat 5");
    Student student7 = new Student(5, "Dat 7");

    myLinkedList.addFrist(student1);
    myLinkedList.addLast(student2);
    myLinkedList.addLast(student3);
    myLinkedList.addLast(student4);
    myLinkedList.remove(student3);
        myLinkedList.add(2, student5);
//        myLinkedList.remove(0);
//    for(int i=0;i<myLinkedList.size();i++){
//        Student student = (Student) myLinkedList.get(i);
//        System.out.println(student.getName());
//    }

    //kiểm tra clone
//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//        for(int i=0;i<cloneLinkedList.size();i++){
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
//        System.out.println(cloneLinkedList.size());

//    kiểm tra sự tồn tại của 1 phần tử
        System.out.println(myLinkedList.contains(student5));

//    Kiểm tra index của 1 phần tử
        System.out.println(myLinkedList.indexOf(student4));

}
}
