package furama_resort.models;

public class House extends Services implements Comparable<House> {
    private String roomStandard;        //tiêu chuẩn phòng
    private String otherFacilities;     //tiện nghi khác
    private int numberOfFloors;         // số tầng nhà

    public House(String id, String nameService, double usableArea, int rentalCosts, int maxNumberOfPeople,
                 String typeOfRent, String roomStandard, String otherFacilities, int numberOfFloors) {
        super(id, nameService, usableArea, rentalCosts, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloors=" + numberOfFloors+
                '}';
    }

    @Override
    public int compareTo(House o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}
