package decorator;

public class Main {

    public static void main(String[] args) {
        Pizza basicPizza1 = new Mozzarella(new Sauce(new PlainPizza()));
        Pizza basicPizza2 = new Sauce(new Mozzarella(new PlainPizza()));
        Pizza basicPizza3 = new Mozzarella(new PlainPizza());
        System.out.println(basicPizza1.getDescription());
        System.out.println(basicPizza2.getDescription());
        System.out.println(basicPizza3.getDescription());
    }
}
