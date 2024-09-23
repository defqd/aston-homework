package area;

import models.enemies.Enemy;
import models.heroes.Archer;
import models.heroes.Mage;
import models.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        var enemy = new Enemy(100);

        var warrior = new Warrior("Grog", 20);
        warrior.attackEnemy(enemy);

        var mage = new Mage("Magic Man", 5);
        mage.attackEnemy(enemy);

        var archer = new Archer("Legolas", 15);
        archer.attackEnemy(enemy);
    }
}
