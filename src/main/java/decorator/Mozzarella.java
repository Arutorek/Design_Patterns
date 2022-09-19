package decorator;

import decorator.Pizza;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", decorator.Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost() + .25;
    }
}
