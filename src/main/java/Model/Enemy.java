/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haika
 */
public class Enemy extends Entity implements Actions{
    private String nama;
    //private String[] monsters = {"Goblin", "Orc", "Dragon"};
    
    public Enemy(String nama,int HP, int def,int att){
        super(HP,def,att);
        this.nama = nama;
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
