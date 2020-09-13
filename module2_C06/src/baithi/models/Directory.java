package baithi;

public class Directory {
    String phoneNumber;
    String groupPhone;
    String name;
    String gender;
    String address;
    String dayOfBirth;
    String email;

    public Directory(String phoneNumber, String groupPhone, String name, String gender, String address, String dayOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.groupPhone = groupPhone;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupPhone() {
        return groupPhone;
    }

    public void setGroupPhone(String groupPhone) {
        this.groupPhone = groupPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "phoneNumber= " + phoneNumber + '\'' +
                ", groupPhone= " + groupPhone + '\'' +
                ", name= " + name + '\'' +
                ", gender= " + gender + '\'' +
                ", address= " + address + '\'' +
                ", dayOfBirth= " + dayOfBirth + '\'' +
                ", email= " + email + '\'' +
                '}';
    }
}
