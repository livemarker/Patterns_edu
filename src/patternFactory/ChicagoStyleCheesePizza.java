package patternFactory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago pizza";
        dough ="Extra Crust dough";
        sauce="Plum tomatoo sauce";
        topping.add("Shredded mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cut square slices");
    }
}
