package patternFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
