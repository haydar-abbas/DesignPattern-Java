package structural.adaptor;

public class Plane implements IEnemy{
    @Override
    public void fireCannon() {
        System.out.println("Plane fire cannons!");
    }

    @Override
    public void reFillBenzene() {
        System.out.println("Plane refill benzene!");
    }
}
