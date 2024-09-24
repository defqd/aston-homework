package area;

import models.enemies.Enemy;
import models.enemies.Smorc;
import models.enemies.Witch;
import models.enemies.Zombie;
import models.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        var warrior = new Warrior("Grog", 25, 100);

        Enemy[] enemies = {
                new Zombie("Shaun", 30, 100),
                new Smorc("Grimgore", 50, 200),
                new Witch("Phoebe", 15, 80)
        };

        while (warrior.isAlive() && areEnemiesAlive(enemies)) {
            for (var enemy : enemies) {
                if (enemy.isAlive()) {
                    warrior.attackEnemy(enemy);
                }
            }
            for (var enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.attackHero(warrior);
                }
            }
        }

    }

    private static boolean areEnemiesAlive(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                return true;
            }
        }
        return false;
    }
}