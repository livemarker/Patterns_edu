package patternStrategy;

public class FlyRockedPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket");
    }
}
