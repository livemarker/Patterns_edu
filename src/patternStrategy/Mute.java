package patternStrategy;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>> ");
    }
}
