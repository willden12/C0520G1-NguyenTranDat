package furama_resort.models;

public abstract class Services {
    private String id;
    private String nameService; //tên dịch vụ
    private double usableArea;     //diện tích sử dụng
    private int rentalCosts;    //chi phí thuê
    private int maxNumberOfPeople;   //số lượng người  tối đa
    private String typeOfRent;  // kiểu thuê(theo năm, tháng, ngày, giờ)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public Services() {
    }

    public Services(String id, String nameService, double usableArea, int rentalCosts, int maxNumberOfPeople, String typeOfRent) {
        this.id = id;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public abstract void showInfo(
    );

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", nameService='" + nameService + '\'' +
                        ", usableArea=" + usableArea +
                        ", rentalCosts=" + rentalCosts +
                        ", MaxNumberOfPeople=" + maxNumberOfPeople +
                        ", typeOfRent='" + typeOfRent + '\''
                ;
    }

}
