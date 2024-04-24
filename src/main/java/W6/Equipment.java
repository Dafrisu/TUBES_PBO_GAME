/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public class Equipment extends Entity{
    
    public String tipe;
    public String nama;

    public Equipment(int att, int HP, int def) {
        super(HP, def, att);
    }
    public void EquipmentsetforClass(Player a){
         if (a.dapatkanClass().equals("Assassin")){
            this.tipe = "Dagger and Assasin's robe";
            Equipment set1 = new Equipment(10,20,30);
            Equipment set2 = new Equipment(40,60,70);
            Equipment set3 = new Equipment(100,120,130);
            Equipment set4 = new Equipment(300,200,230);
            a.setAttack_point(a.getAttack_point() + set1.getAttack_point());
            a.setHP(a.getHP() + set1.getHP());
            a.setDefense(a.getDefense()+ set1.getDefense());
        }else if (a.dapatkanClass().equals("Guardian")){
            this.tipe = "Shield and Guardians Armor";
            a.setAttack_point(0);
            a.setHP(0);
            a.setDefense(0);
        }else if(a.dapatkanClass().equals("Necromancer")){
            this.tipe = "Staff and robe";
            a.setAttack_point(0);
            a.setHP(0);
            a.setDefense(0);
        }else if(a.dapatkanClass().equals("Archer")){
            this.tipe = "Bow and robe";
            a.setAttack_point(0);
            a.setHP(0);
            a.setDefense(0);
        }else{
            System.out.println("invalid class");
        }
    }
}
