package creational.abstractfactory;

public class Order {

    private int[] partNumber;
    private String location;
    private String cost;

    public int[] getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int[] partNumber) {
        this.partNumber = partNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
