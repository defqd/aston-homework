package area;

import models.heroes.Archer;
import models.heroes.Hero;
import models.heroes.Mage;
import models.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        var hero = new Hero("Steve");
        hero.attackEnemy();

        var warrior = new Warrior("Grog");
        warrior.attackEnemy();

        var mage = new Mage("Magic Man");
        mage.attackEnemy();

        var archer = new Archer("Legolas");
        archer.attackEnemy();
    }
}
