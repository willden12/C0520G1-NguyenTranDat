package abstract_class_va_interface.thuchanh.animal;

import abstract_class_va_interface.thuchanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Chicken:  cluck-cluck";
    }

    @Override
    public String howToEat() {
        return " ";
    }
}
