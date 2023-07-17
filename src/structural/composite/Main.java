package structural.composite;

public class Main {

    public static void main(String[] args) {

        Component cpu = new leaf("CPU", 200);
        Component ram = new leaf("RAM", 60);
        Component mouse = new leaf("Mouse", 25);
        Component hdd = new leaf("HDD", 50);
        Component monitor = new leaf("Monitor", 250);

        Composite mb = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");
        Composite ph = new Composite("Peri");

        mb.add(cpu);
        mb.add(ram);

        ph.add(mouse);
        ph.add(monitor);

        cabinet.add(mb);
        cabinet.add(hdd);

        computer.add(cabinet);
        computer.add(ph);

        computer.showPrice();
    }
}
