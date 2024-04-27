/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
import java.util.Scanner;

public class Player extends Entity implements Class, Actions{
    private String nama;
    private String skills;
    private String Class;
    private int MaxHP;
    public Equipment wear = new Equipment();
    
    public Player(String nama,int HP, int def, int att ){
        super(HP,def,att);
        this.nama = nama;
        this.MaxHP = HP;
    }
    
   
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void tipeClass(int choose) {
        if (choose == 1){
            this.setClass("Assassin");
        }else if (choose == 2){
            this.setClass("Guardian");
        }else if(choose == 3){
            this.setClass("Necromancer");
        }else if(choose == 4){
            this.setClass("Archer");
        }else{
            System.out.println("input invalid");
        }
    }

    @Override
    public void Skillset() {
        if (this.dapatkanClass().equals("Assassin")){
            this.setSkills("Assassin_Skillset");
        }else if (this.dapatkanClass().equals("Guardian")){
            this.setSkills("Guardian_Skillset");
        }else if(this.dapatkanClass().equals("Necromancer")){
            this.setSkills("Necromancer_Skillset");
        }else if(this.dapatkanClass().equals("Archer")){
            this.setSkills("Archer_Skillset");
        }else{
            System.out.println("Player belum punya Class");
        }
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String dapatkanClass() {
        return Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }
    public void CheckStats(){
        System.out.println("HP\t:" + this.getHP());
        System.out.println("Def\t:" + this.getDefense());
        System.out.println("Attack\t:" + this.getAttack_point());
    }
    public void checkEquipment(){
        System.out.println("Tipe Equipment\t:" + this.wear.getTipe());
        System.out.println("Nama Set\t\t:" + this.wear.getNama());
        System.out.println("HP\t\t:" + this.wear.getEquipment_HP());
        System.out.println("Def\t\t:" + this.wear.getEquipment_def());
        System.out.println("Attack\t\t:" + this.wear.getEquipment_att());
    }
    @Override
    public void attack(Entity a) {
        if (super.persepective(this) == true){
            a.setHP(a.getHP() - this.getAttack_point());
        }
        if (a instanceof Enemy){
            Enemy B = (Enemy) a;
            System.out.println( B.getName() + " Terkena serangan dari "+ this.getAttack_point() +" damage dari " + this.getNama() + 
                    ", HP " + B.getName() + ": " + B.getHP());
            if (B.getHP() < 0){
                System.out.println(B.getName() + " Tewas");
            }
        }else if (a instanceof Player){
            Player B = (Player) a;
            System.out.println(B.getNama() + " Terkena serangan dari "+ this.getAttack_point() +" damage dari " + this.getNama() +
                    ", HP " + B.getNama() + ": " + B.getHP());
            if (B.getHP() < 0){
                System.out.println(B.getNama() + " Tewas");
            }
        }  
    }

    @Override
    public void run_nibba_run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP() {
        this.MaxHP = MaxHP + wear.getEquipment_HP();
    }
}
