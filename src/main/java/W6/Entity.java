/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public abstract class Entity extends Koordinat {
    private int HP;
    private int defense;
    private int speed;
    private int attack_point;
    
    public Entity(int x, int y,int HP, int def, int speed, int att){
        super(x,y);
        this.HP = HP;
        this.defense = def;
        this.speed = speed;
        this.attack_point = att;
    }
    
    public abstract void move(int x, int y);

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack_point() {
        return attack_point;
    }

    public void setAttack_point(int attack_point) {
        this.attack_point = attack_point;
    }

}
