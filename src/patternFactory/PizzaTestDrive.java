package patternFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
PizzaStore nyStore=new NYPizzaStore();
PizzaStore chicStore=new ChicagoStore();
Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Client 1: order a "+pizza.getName()+"\n");
        Pizza pizza1=chicStore.orderPizza("cheese");
        System.out.println("Client 2: order a "+pizza1.getName()+"\n");
    }
}
