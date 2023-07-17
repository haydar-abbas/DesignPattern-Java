package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String name;
    private final List<Component> components;

    public Composite(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(this.name);
        for (Component c : this.components) {
            c.showPrice();
        }
    }
}
