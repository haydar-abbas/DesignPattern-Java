package behavioural.template;

public abstract class VehicleTemplate {

    public void buildVehicle() {
        collectComponents();
        assembleComponents();
        installGearBox();
        startVehicle();
        System.out.println("Vehicle is ON!");
    }

    protected abstract void installGearBox();

    protected abstract void assembleComponents();

    private void startVehicle() {
        System.out.println("Engin is powering up...");
    }

    private void collectComponents() {
        System.out.println("Collect all component...");
    }
}
