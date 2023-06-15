package structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<IEnemy> enemies = new ArrayList<>();

        enemies.add(new Tank());
        enemies.add(new Plane());
        enemies.add(new SoldierAdaptor(new Soldier()));

        for (IEnemy enemy : enemies) {
            enemy.fireCannon();
            enemy.reFillBenzene();
            System.out.println("--------------");
        }
    }
}
