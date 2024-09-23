package models.enemies;

import models.heroes.Hero;

public class Witch extends Enemy{
    public Witch(String name, int strength, int health) {
        super(name, strength, health);
    }

    @Override
    public void attackHero(Hero hero) {
        if(hero.isAlive()) {
            if (Math.random() >= 0.5) {
                hero.takeDamage(getStrength());
                useAbility();
            }
            else {
                System.out.printf("Ведьма %s бьет посохом врага!\n", getName());
                hero.takeDamage(getStrength());
            }
        }
        else {
            System.out.printf("%s мертв!\n", hero.getName());
        }
    }

    @Override
    public void useAbility() {
        System.out.printf("Ведьма %s кастует проклятье и воссполняет здоровье в размере наносимого урона.\n", getName());
        setHealth(getStrength());
    }
}
