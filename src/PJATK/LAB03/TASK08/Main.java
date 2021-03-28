package PJATK.LAB03.TASK08;

import javax.management.StandardEmitterMBean;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weaponChoice;
        int armorChoice;
        int enemyChoice;
        Enemy enemy;
        Player player;

        // Weapons
        Weapon[] weapons = new Weapon[4];
        weapons[0] = new Weapon("Autumn Wind Fan", 43);
        weapons[1] = new Weapon("Black Leaf Dirk", 87);
        weapons[2] = new Weapon("Dragon Tooth Blade", 366);
        weapons[3] = new Weapon("Full Moon Sword", 132);

        // Armors
        Armor[] armors = new Armor[4];
        armors[0] = new Armor("Pink Clothing", 18);
        armors[1] = new Armor("Red Ant Suit", 38);
        armors[2] = new Armor("Ying and Yang Armor", 47);
        armors[3] = new Armor("Black Steel Armor", 154);

        //Enemies
        Enemy[] enemies = new Enemy[4];
        enemies[0] = new Enemy("Dragon Shaman", 700, armors[0], weapons[0]);
        enemies[1] = new Enemy("Ninja Blade", 1300, armors[1], weapons[1]);
        enemies[2] = new Enemy("Sura Black Magic", 1700, armors[2], weapons[2]);
        enemies[3] = new Enemy("Mental Warrior", 2000, armors[3], weapons[3]);

        System.out.println("Choose your weapon:");
        for (int i=0; i < weapons.length; i++) {
            System.out.println("| " + (i+1) + " | " + weapons[i].name + "   | ATK: " + weapons[i].atk);
        }
        weaponChoice = scanner.nextInt() - 1;

        System.out.println("Choose your armor:");
        for (int i=0; i < armors.length; i++) {
            System.out.println("| " + (i+1) + " | " + armors[i].name + " | DEF: " + armors[i].def);
        }
        armorChoice = scanner.nextInt() - 1;

        player = new Player(1200, armors[armorChoice], weapons[weaponChoice]);

        System.out.println("-y-o-u-r--s-t-a-t-s-");
        player.showStats();
        System.out.println("--------------------");
        System.out.println();
        System.out.println("-y-o-u-r--i-t-e-m-s-");
        player.showLoadout();
        System.out.println("--------------------");
        System.out.println();

        System.out.println("Choose your ENEMY!");

        for(int i = 0; i < enemies.length; i++) {
            System.out.println("--------------------");
            System.out.print("| " + (i + 1) + " ");
            enemies[i].showDetails();
            System.out.println("--------------------");
            System.out.println();
        }
        enemyChoice = scanner.nextInt() - 1;
        enemy = enemies[enemyChoice];
        System.out.println("-y-o-u-r--E-N-E-M-Y-");
        enemy.showDetails();
        System.out.println("--------------------");
        System.out.println();
        int z=1;
        while (player.hp > 0 && enemy.hp > 0) {
            enemy.takeDMG(player.giveDMG());
            player.takeDMG(enemy.giveDMG());
            System.out.println("| AFTER ROUND " + z);
            System.out.print("| Your HP:    ");
            player.showHP();
            System.out.print("| Enemy's HP: ");
            enemy.showHP();
            z++;
            System.out.println();
        }
        System.out.println();
        if (player.hp <= 0 && enemy.hp <=0) {
            System.out.println("------------------");
            System.out.println("| You both DIED! |");
            System.out.println("------------------");

        } else if (player.hp <= 0) {
            System.out.println("--------------");
            System.out.println("| You  LOST! |");
            System.out.println("--------------");

        } else {
            System.out.println("-------------");
            System.out.println("| You  WON! |");
            System.out.println("-------------");
        }


    }
}
