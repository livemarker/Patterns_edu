package patternDecorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Dacaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
