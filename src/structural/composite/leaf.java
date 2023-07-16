package structural.composite;

public class leaf implements Component{

    private final String name;
    private final int price;

    public leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + " : " + this.price);
    }
}
