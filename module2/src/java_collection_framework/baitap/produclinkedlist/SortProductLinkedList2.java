package java_collection_framework.baitap.produclinkedlist;

import java.util.Comparator;

public class SortProductLinkedList2 extends Product_1 implements Comparator<Product_1> {
    @Override
    public int compare(Product_1 o1, Product_1 o2) {
        return (o2.getPrice()-o1.getPrice());
    }
}
