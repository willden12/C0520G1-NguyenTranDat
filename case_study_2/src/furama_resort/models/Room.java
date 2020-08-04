package furama_resort.models;

public class Room extends Services implements Comparable<Room>{
    private String freeAccompanyingService;      // dịch vụ miễn phí đi kèm

    public Room(String id, String nameService, double usableArea, int rentalCosts, int maxNumberOfPeople, String typeOfRent, String freeAccompanyingService) {
        super(id, nameService, usableArea, rentalCosts, maxNumberOfPeople, typeOfRent);
        this.freeAccompanyingService = freeAccompanyingService;
    }

    public String getFreeAccompanyingService() {
        return freeAccompanyingService;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "reeAccompanyingService='" + freeAccompanyingService +
                '}';
    }

    @Override
    public int compareTo(Room o) {
        return this.getNameService().compareTo(o.getNameService());
    }
}

