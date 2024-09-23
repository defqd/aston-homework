package models.heroes;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.printf("Лучник %s атакует!!!\n", getName());
    }
}
