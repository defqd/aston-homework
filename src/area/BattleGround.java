package area;

import models.enemies.Smorc;
import models.enemies.Zombie;
import models.heroes.Archer;
import models.heroes.Mage;
import models.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
//        var zombie = new Zombie("Shaun", 25, 100);
//
//        var warrior = new Warrior("Grog", 20, 100);
//        warrior.attackEnemy(zombie);
//
//        var mage = new Mage("Magic Man", 5, 50);
//        mage.attackEnemy(zombie);
//
//        var archer = new Archer("Legolas", 15, 80);
//        archer.attackEnemy(zombie);
//
//        zombie.attackHero(warrior);
//        zombie.attackHero(mage);
//        zombie.attackHero(archer);

//        var zombie = new Zombie("Shaun", 25, 50);
//        var warrior = new Warrior("Grog", 25, 100);
//
//        zombie.useAbility();
//
//        warrior.attackEnemy(zombie);
//        warrior.attackEnemy(zombie);
//        warrior.attackEnemy(zombie);
//        warrior.attackEnemy(zombie);

        var smorc = new Smorc("AAA", 100, 200);
        var warrior = new Warrior("Grog", 25, 100);

        warrior.attackEnemy(smorc);
        warrior.attackEnemy(smorc);
        warrior.attackEnemy(smorc);

        smorc.attackHero(warrior);
        smorc.attackHero(warrior);
        smorc.attackHero(warrior);

    }
}
