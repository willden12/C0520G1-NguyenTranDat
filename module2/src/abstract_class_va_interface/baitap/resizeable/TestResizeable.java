package abstract_class_va_interface.baitap.resizeable;

import abstract_class_va_interface.baitap.dulieu.Circle;
import abstract_class_va_interface.baitap.dulieu.Rectangle;
import abstract_class_va_interface.baitap.dulieu.Shape;
import abstract_class_va_interface.baitap.dulieu.Square;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Square(3.0);

        System.out.println("Pre-resize");
        for (Shape i : shapes) {
            System.out.println(i.toString());

        }


        for (Shape i : shapes) {
            double x = Math.floor(Math.random() * 100);
            System.out.println(x);
            if (i instanceof Circle) {
                ((Circle) i).resize(x);
                //System.out.println(i.toString());
            } else {
                ((Rectangle) i).resize(x);
            }
            System.out.println(i.toString());

        }

    }
}
