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
    private Enemytype typeMusuh;
    private Enemies Musuh;
    private int pilih;
    Random random = new Random();
    
    public Enemy (Enemies Musuh){
        super(Musuh.getHp(), Musuh.getDef(), Musuh.getAtk());
        setTypeMusuh();
        Buff();
        this.Musuh = Musuh;
    }
    
    public void Buff() {
        this.setHP(Musuh.getHp()+ typeMusuh.getHp());
        this.setDefense(Musuh.getDef()+ typeMusuh.getDef());
        this.setAttack_point(Musuh.getAtk()+ typeMusuh.getAtk());
    }
    
    public enum Enemies{
        Slime( generateRandom(100,150), 80, 80),
        Goblin( generateRandom(300, 400), 200, 200),
        Rock_Giant(generateRandom(100,200),20,400),
        Dragoon( generateRandom(300, 400), 200, 200);
        
        private int hp;
        private int def;
        private int atk;
        
        Enemies(int hp, int def, int atk){
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
    
    public enum Enemytype{
        Fighter( generateRandom(100,150), 80, 80),
        Elite( generateRandom(300, 400), 200, 200),
        Rogue(generateRandom(100,200),20,400);
        
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
        return typeMusuh;
    }

    public void setTypeMusuh() {
        pilih = random.nextInt(1,3);
        if (pilih == 1) {
            typeMusuh = Enemytype.Elite;
        } else if (pilih == 2) {
            typeMusuh = Enemytype.Fighter;
        } else if (pilih == 3) {
            typeMusuh = Enemytype.Rogue;
        }
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
