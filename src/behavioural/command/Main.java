package behavioural.command;

public class Main {

    public static void main(String[] args) {

        Remote remote = new Remote();
        TV tv = new TV();
        Satellite satellite = new Satellite();

        remote.addCommand(tv.SLOT, new TurnON(tv), new TurnOFF(tv));
        remote.addCommand(satellite.SLOT, new TurnON(satellite), new TurnOFF(satellite));

        remote.onBtnPress(tv.SLOT);
        remote.offBtnPress(tv.SLOT);

        remote.onBtnPress(satellite.SLOT);
        remote.offBtnPress(satellite.SLOT);
    }
}
