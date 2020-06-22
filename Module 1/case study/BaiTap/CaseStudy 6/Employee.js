    class Employee{
    constructor() {
    }
    getName() {
        return this.name;
    }
    getBirthday() {
        return this.birthday;
    }
    getPhone() {
        return this.phone;
    }
    getCmnd() {
        return this.cmnd;
    }
    getEmail() {
        return this.email;
    }
    getLevel() {
        return this.level;
    }
    getLocaltion() {
        return this.localtion;
    }
    getSalary() {
        if (this.getLocaltion()==="Manager"){
            this.salary=500;
        }else if (this.getLocaltion()==="Sale"){
            this.salary=300;
        }else if (this.getLocaltion()==="Maketting"){
            this.salary=200;
        }
        return this.salary;
    }
    setName(name) {
        this.name=name;
    }
    setBirthday(birthday) {
        this.birthday=birthday;
    }
    setPhone(phone) {
        this.phone=phone;
    }
    setEmail(email) {
        this.email=email;
    }
    setCmnd(cmnd) {
        this.cmnd=cmnd;
    };
    setLevel(level) {
        this.level=level;
    }
    setLocaltion(localtion) {
        this.localtion=localtion;
    }

}