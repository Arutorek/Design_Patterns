package decorator;

import decorator.Pizza;

public class Sauce extends ToppingDecorator {

    public Sauce(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", decorator.Sauce";
    }

    public double getCost() {
        return tempPizza.getCost() + .40;
    }
}
