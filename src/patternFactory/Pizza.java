package patternFactory;

import java.util.ArrayList;

public abstract class Pizza {
    String name, dough, sauce;
    ArrayList topping = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding topping: ");
        for (int i = 0; i < topping.size(); i++) {
            System.out.println("  " + topping.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 20 min at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Place pizza in box");
    }

    public String getName() {
        return name;
    }
}
