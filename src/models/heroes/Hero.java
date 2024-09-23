package models.heroes;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void attackEnemy() {
        System.out.printf("%s атакует!!!\n", name);
    }
}
