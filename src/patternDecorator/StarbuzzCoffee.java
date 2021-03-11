package patternDecorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Whip(new Mocha(new Mocha(beverage1)));

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(new Mocha(new Whip(beverage2)));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
