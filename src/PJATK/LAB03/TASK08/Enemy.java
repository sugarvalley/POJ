package PJATK.LAB03.TASK08;

public class Enemy {
    String name;
    int hp;
    Armor armor;
    Weapon weapon;

    public Enemy(String name, int hp, Armor armor, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void takeDMG(int dmg) {
        int reduced = dmg - (this.armor.def / 10);
        this.hp -= reduced;
    }

    public int giveDMG() {
        return this.weapon.atk;
    }

    public void showHP() {
        System.out.println(this.hp);
    }

    public void showDetails() {
        System.out.println("| " + this.name);
        System.out.println("| HP:     " + this.hp);
        System.out.println("| DEF:    " + this.armor.def);
        System.out.println("| ATK:    " + this.weapon.atk);
    }
}
