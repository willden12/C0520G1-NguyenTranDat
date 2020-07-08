package abstract_class_va_interface.baitap.colorable;

import abstract_class_va_interface.baitap.dulieu.Circle;
import abstract_class_va_interface.baitap.dulieu.Rectangle;
import abstract_class_va_interface.baitap.dulieu.Shape;
import abstract_class_va_interface.baitap.dulieu.Square;

public class TestColorable {
        public static void main(String[] args) {
            Circle circle = new Circle(1,"red",true);
            Rectangle rectangle = new Rectangle(2,3,"blue", true);
            Square square = new Square(4,"white",true);
            Shape[] shapes = {circle,rectangle,square};
            for (Shape i: shapes){
                if (i instanceof Square){
                    Square a = (Square) i;
                    System.out.println(a.howToColor());;
                }
            }
        }
    }

