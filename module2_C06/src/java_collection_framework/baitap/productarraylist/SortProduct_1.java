package java_collection_framework.baitap.productarraylist;

import java_collection_framework.baitap.produclinkedlist.Product_1;

import java.util.Comparator;

public class SortProduct_1 extends Product implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (o2.getPrice()-o1.getPrice());
    }
}
