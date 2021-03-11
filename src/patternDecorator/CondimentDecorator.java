package patternDecorator;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
