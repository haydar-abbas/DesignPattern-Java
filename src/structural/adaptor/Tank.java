package structural.adaptor;

public class Tank implements IEnemy{
    @Override
    public void fireCannon() {
        System.out.println("Tank fire cannons!");
    }

    @Override
    public void reFillBenzene() {
        System.out.println("Tank refill benzene!");
    }
}
