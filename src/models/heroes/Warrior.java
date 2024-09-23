package models.heroes;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("Воин %s атакует!!!\n", getName());
    }
}
