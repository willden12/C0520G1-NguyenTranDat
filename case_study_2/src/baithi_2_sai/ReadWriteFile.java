package baithi_2_sai;



import java.io.*;
import java.util.List;

public class ReadWriteFile {public static String[] arrayTemp;
    public static List<String> readerFile(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ( (line = bufferedReader.readLine()) != null ) {
                arrayTemp = line.split(",");
                if (filePath.equals(MainController_1.FILE_PHONE)) {
                    String phone = ReadWriteFile.arrayTemp[0];
                    String teamPhone = ReadWriteFile.arrayTemp[1];
                    String name = ReadWriteFile.arrayTemp[2];
                    String gender = ReadWriteFile.arrayTemp[3];
                    String address = ReadWriteFile.arrayTemp[4];
                    String birthday = ReadWriteFile.arrayTemp[5];
                    String email = ReadWriteFile.arrayTemp[6];
                    MainController_1.phoneBookList.add(new PhoneBook(phone, teamPhone, name, gender, address, birthday, email) {

                        @Override
                        public void showInfo() {
                            System.out.println(this.toString());
                        }
                    });
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writerFile(String str,String filePath){
        File file=new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.append(str);
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
