package test;

public abstract class Abstract {
    private int number;
    private String name;

    public Abstract() {
    }

    public Abstract(int number) {
        this.number = number;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Abstract(int number, String name) {
        this.number = number;
        this.name = name;
   }

    public String getName() {
        return this.name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public abstract String ShowInformation();
}


