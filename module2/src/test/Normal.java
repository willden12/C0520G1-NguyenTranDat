package test;

public class Normal extends Abstract implements Interface,Interface2 {
    public Normal(int number, String name) {
        super(number, name);
    }

    public Normal() {
    }

    public Normal(int number) {
        super(number);
    }
    public void abc(){
    }
    public int abc (int a){
        return 100;
    }
    public int abc (String a){
        int d =2;
        return 100;
    }

    @Override
    public String ShowInformation() {
        return "Name: "+ getName() + " Number: " + getNumber() ;
    }

    @Override
    public String SayHello() {
        return " Dat 09";
    }

    @Override
    public int SayNumber() {
        return 100;
    }
}
