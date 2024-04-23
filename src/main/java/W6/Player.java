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
    
    public Player(String nama,int HP, int def, int att ){
        super(HP,def,att);
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void tipeClass() {
        System.out.println("1.assassin");
        System.out.println("2.Guardian");
        System.out.println("3.Necromancer");
        System.out.println("4.Archer"); 
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
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
    
    public String metodPlayer(){
        return "Metod Player";
    }
    public String ToString(){
        return "Ini Player";
    }
    @Override
    public void attack(Entity a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run_nibba_run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
