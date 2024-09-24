package area;

import models.enemies.Smorc;
import models.enemies.Witch;
import models.enemies.Zombie;
import models.heroes.Archer;
import models.heroes.Mage;
import models.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        var zombie = new Zombie("Shaun", 25, 100);
        var smorc = new Smorc("Grimgore", 100, 200);
        var witch = new Witch("Phoebe", 20, 80);

        var warrior = new Warrior("Grog", 25, 100);

    }
}
