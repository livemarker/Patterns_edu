package patternFactory;


    public class ChicagoStore extends PizzaStore {

        @Override
        public Pizza createPizza(String type) {
            Pizza pizza=null;
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            }
//            if (type.equals("pepperoni")) {
//                pizza = new NYStylePepperoniPizza();
//            }
//            if (type.equals("veggie")) {
//                pizza = new NYStyleVeggiePizza();
//            }
            return pizza;
        }
    }