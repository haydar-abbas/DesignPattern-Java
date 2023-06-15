package structural.adaptor;

public class SoldierAdaptor implements IEnemy{

    private final Soldier soldier;

    public SoldierAdaptor(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void fireCannon() {
        this.soldier.soldierFireGun();
    }

    @Override
    public void reFillBenzene() {
        this.soldier.soldierEating();
    }
}
