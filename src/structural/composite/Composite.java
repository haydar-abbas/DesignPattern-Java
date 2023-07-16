package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
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
