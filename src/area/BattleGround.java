package area;

import models.enemies.Enemy;
import models.heroes.Archer;
import models.heroes.Mage;
import models.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        var enemy = new Enemy("Zombie", 25, 100);

        var warrior = new Warrior("Grog", 20, 100);
        warrior.attackEnemy(enemy);

        var mage = new Mage("Magic Man", 5, 50);
        mage.attackEnemy(enemy);

        var archer = new Archer("Legolas", 15, 80);
        archer.attackEnemy(enemy);

        enemy.attackHero(warrior);
        enemy.attackHero(mage);
        enemy.attackHero(archer);
    }
}
