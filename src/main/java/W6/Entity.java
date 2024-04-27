/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public abstract class Entity{
    private int HP;
    private int defense;
    private int attack_point;
    
    public Entity(int HP, int def, int att){
        if (HP < 0 || this.HP < 0){
            this.HP = 0;
        }else{
            this.HP = HP;
        }
        this.defense = def;
        this.attack_point = att;
    }

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

    public int getAttack_point() {
        return attack_point;
    }

    public void setAttack_point(int attack_point) {
        this.attack_point = attack_point;
    }
    public boolean persepective (Entity masuk){
        boolean mantap = true;
        if (masuk instanceof Player){
            mantap = true;
        } else if (masuk instanceof Enemy){
            mantap = false;
        }
        return mantap;
    }
    
}
