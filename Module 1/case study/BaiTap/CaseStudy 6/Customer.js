class Customer {
    constructor() {
    }

    setName(name) {
        this.name = name;
    };

    getName() {
        return this.name;
    };

    setCmnd(cmnd) {
        this.cmnd = cmnd;
    };

    getCmnd() {
        return this.cmnd;
    };

    setPhoneNumber(phoneNumber) {
        this.phoneNumber = phoneNumber;
    };

    getPhoneNumber = function () {
        return this.phoneNumber;
    };

    setEmail(email) {
        this.email = email;
    };

    getEmail() {
        return this.email;
    };

    setAddress(address) {
        this.address = address;
    };

    getAddress() {
        return this.address;
    };

    setBirthday(birthday) {
        this.birthday = birthday;
    };

    getBirthday() {
        return this.birthday;
    };

    setTypeCustomer(typeCustomer) {
        this.typeCustomer = typeCustomer;
    };

    getTypeCustomer() {
        return this.typeCustomer;
    };

    setDiscount(discount) {
        this.discount = discount;
    };

    getDiscount() {
        return this.discount;
    };

    setRentdays(rentDays) {
        this.rentDays = rentDays;
    };

    getRentDays() {
        return this.rentDays;
    };

    setTyperService(typerService) {
        this.typerService = typerService;
    };

    getTyperService() {
        return this.typerService;
    };

    setTypeRoom(typeRoom) {
        this.typeRoom = typeRoom;
    };

    getTypeRoom() {
        return this.typeRoom;
    };

    setQuantityIncluded(quantityInclud) {
        this.quantityIncluded = quantityInclud;
    };

    getQuantityIncluded() {
        return this.quantityIncluded;
    };

    totalPays() {
        let money = 0;
        if (this.getTyperService() === "Villa") {
            money = 500;
        } else if (this.getTyperService()=== "House") {
            money = 300;
        } else if (this.getTyperService() === "Room") {
            money = 200;
        }
        return this.getRentDays() * money * (1 - this.getDiscount()/ 100);
    }
}