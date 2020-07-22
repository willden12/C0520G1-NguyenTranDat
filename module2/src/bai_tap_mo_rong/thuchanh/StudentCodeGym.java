//package Lop_Va_OOP.thuchanh;
//
//public class StudentCodeGym {
//    private int id;
//    private String name;
//    private String dateofbirth;
//
//
//    public StudentCodeGym(int id, String name, String dateofbirth) {
//        this.id = id;
//        this.name = name;
//        this.dateofbirth = dateofbirth;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDateofbirth() {
//        return dateofbirth;
//    }
//}
//
//    public static void main(String[] args) {
//        private static StudentCodeGym[] listStudent;
//        //private static ArrayList<StudentCodeGym> listStudent;
//        private static int count = 0;
//
//        static {
//            listStudent = new StudentCodeGym[10];
//            //listStudent = new ArrayList<StudentCodeGym>();
//        }
//
//        public int getSize(){
//            //return listStudent.size();
//            return count;
//        }
//
//        public int getIdStudent(int arg){
//            //return listStudent.get(arg).getId();
//            return listStudent[arg].getId();
//        }
//
//        public String getNameStudent(int arg){
//            //return listStudent.get(arg).getName();
//            return listStudent[arg].getName();
//        }
//
//        public String getDateOfBirthStudent(int arg){
//            //return listStudent.get(arg).getDateofbirth();
//            return listStudent[arg].getDateofbirth();
//        }
//
//        ////////////////////////////////////////////NORMAL WAY///////////////////////////////////////////////////////////
//        public void register(StudentCodeGym student){
//            if(count >= 10){
//                System.out.println("Warning!!! Class is full! Open new class");
//            }else {
//                System.out.println("Welcome to "+ student.getName()+" ^-^ !!!");
//                listStudent[count] = student;
//                count++;
//            }
//        }
//
//        public void graduate(int id){
//            for(int i = 0; i < listStudent.length-1; i++){
//                if(listStudent[i].getId() == id){
//                    System.out.println("Congratulate "+ listStudent[i].getName()+" ^-^ !!!");
//                    for(int j = i; j < listStudent.length-1; j++){
//                        listStudent[j] = listStudent[j+1];
//                    }
//                    break;
//                }
//            }
//            listStudent[listStudent.length-1] = null;
//            count--;
//        }
//
//        public void displayListStudent(){
//            System.out.printf("%-5s%-5s%-15s%s","", "Id", "Name", "Date of Birth");
//            System.out.println();
//            for(int i = 0; i < count; i++){
//                System.out.printf("%-5d%-5d%-15s%s",i+1, listStudent[i].getId(), listStudent[i].getName(), listStudent[i].getDateofbirth());
//                System.out.println();
//            }
//    }package access_modifier_static.exercises;
//
//import javax.sound.midi.Soundbank;
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//        public class Main {
//            public static void main(String[] args) {
//                Scanner input = new Scanner(System.in);
//                boolean isExist;
//                StudentCodeGym student1 = new StudentCodeGym(111, "Le Toan", "02/01/1993");
//                StudentCodeGym student2 = new StudentCodeGym(222, "Le Hung", "02/01/1990");
//                StudentCodeGym student3 = new StudentCodeGym(333, "Le Quang", "02/01/1983");
//                StudentCodeGymClass listStudent = new StudentCodeGymClass();
//                listStudent.register(student1);
//                listStudent.register(student2);
//                listStudent.register(student3);
//                while (true) {
//                    System.out.println("Menu");
//                    System.out.println("1. Add New Student.");
//                    System.out.println("2. Delete Student.");
//                    System.out.println("3. Display All Student.");
//                    System.out.println("0. Exit");
//                    System.out.print("Enter your choice: ");
//                    int choice = input.nextInt();
//                    switch (choice) {
//                        case 0:
//                            System.exit(0);
//                        case 1:
//                            int addId;
//                            do {
//                                isExist = false;
//                                System.out.print("Enter student's id: ");
//                                addId = input.nextInt();
//                                for (int i = 0; i < listStudent.getSize(); i++) {
//                                    if (listStudent.getIdStudent(i) == addId) {
//                                        System.out.println("Id da co. Nhap lai!!!");
//                                        isExist = true;
//                                        break;
//                                    }
//                                }
//                            } while (isExist);
//                            System.out.print("Enter student's name: ");
//                            String addName = input.nextLine();
//                            addName = input.nextLine();
//                            System.out.print("Enter student's date of birth: ");
//                            String addDate = input.nextLine();
//                            StudentCodeGym student = new StudentCodeGym(addId, addName, addDate);
//                            listStudent.register(student);
//                            break;
//                        case 2:
//                            isExist = false;
//                            System.out.println("Enter id you want to delete: ");
//                            int delId = input.nextInt();
//                            char confirm;
//                            int index = 0;
//                            for (int i = 0; i < listStudent.getSize(); i++) {
//                                if (delId == listStudent.getIdStudent(i)) {
//                                    isExist = true;
//                                    index = i;
//                                }
//                            }
//                            if (isExist) {
//                                System.out.println("You want to remove this student!!!");
//                                System.out.println(listStudent.getIdStudent(index) + " " + listStudent.getNameStudent(index) + " " + listStudent.getDateOfBirthStudent(index));
//                                System.out.print("Yes or No: ");
//                                confirm = input.next().charAt(0);
//                                if (confirm == 'y' || confirm == 'Y') {
//                                    listStudent.graduate(delId);
//                                    break;
//                                } else {
//                                    System.out.println("Nothing change");
//                                }
//                            } else {
//                                System.out.println("No exist this student.");
//                            }
//                            break;
//                        case 3:
//                            listStudent.displayListStudent();
//                            break;
//                        default:
//                            System.out.println("Invalid value!!!");
//                    }
//                }
//            }
//        }
