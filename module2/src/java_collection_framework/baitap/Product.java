package java_collection_framework.baitap;

public class Product {
    private String name;
    private int id;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID ='" + id + '\'' +
                ", name=" + name +
                ", price=" + price +
                '}';
    }


}

