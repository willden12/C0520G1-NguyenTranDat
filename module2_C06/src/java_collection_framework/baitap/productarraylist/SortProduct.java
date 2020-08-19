package java_collection_framework.baitap.productarraylist;

import java_collection_framework.baitap.produclinkedlist.Product_1;

import java.util.Comparator;

public class SortProduct extends Product implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return (o1.getPrice()-o2.getPrice());
    }
}
