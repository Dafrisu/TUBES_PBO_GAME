/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author haika
 */
public class Enemy extends Entity implements Actions{
    private String nama;
    private Enemytype type;
    Random random = new Random();
    //private String[] monsters = {"Goblin", "Orc", "Dragon"};
    
    public Enemy (Enemytype type){
        super(type.getHp(), type.getDef(), type.getAtk());
        this.type = type;
    }
    public enum Enemytype{
        Slime( generateRandom(50,70), 50, 50),
        Goblin( generateRandom(120, 150), 100, 100),
        Rock_Giant(generateRandom(300,400),200,200),
        Dragoon(generateRandom(500,500),350,350);
        
        private int hp;
        private int def;
        private int atk;
        Enemytype(int hp, int def, int atk){
            this.hp = hp;
            this.def = def;
            this.atk = atk;
        }

        public int getHp() {
            return hp;
        }

        public int getDef() {
            return def;
        }

        public int getAtk() {
            return atk;
        }
        private static int generateRandom(int min, int max) {
            return ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    public Enemytype getType() {
        return type;
    }

    public void setType(Enemytype type) {
        this.type = type;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    @Override
    public void attack(Entity tod) {
        if (super.persepective(this) == false) {
            tod.setHP(tod.getHP() - super.getAttack_point());
        }
    }

    @Override
    public void run_nibba_run() {
        System.out.println("Dem bro");
        System.out.println("Enemy too strong (emot klarifikasi trevis skut)");
        System.out.println("Adios");
    }
}
