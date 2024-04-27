/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public class Equipment{
    private int Equipment_att =0;
    private int Equipment_HP =0;
    private int Equipment_def =0;
    private String tipe;
    private String nama;
    public Equipment[] arrEquipment = new Equipment[10];
    
    public Equipment(){
        
    }
    
    public Equipment(String tipe, String nama,int att, int HP, int def) {
        this.Equipment_HP = HP;
        this.Equipment_att = att;
        this.Equipment_def = def;
        this.tipe = tipe;
        this.nama = nama;
    }
    
    public void EquipmentInit(Player a){
         if (a.dapatkanClass().equals("Assassin")){
            arrEquipment[0] = new Equipment("Dagger and Assasin's robe", "Set1", 10, 20, 30);
            arrEquipment[1] = new Equipment("Dagger and Assasin's robe", "Set2", 40, 60, 70);
            arrEquipment[2] = new Equipment("Dagger and Assasin's robe", "Set3", 100,120,130);
            arrEquipment[3] = new Equipment("Dagger and Assasin's robe", "Set4", 300,200,230);
        }else if (a.dapatkanClass().equals("Guardian")){
            this.setTipe("Shield and Guardians Armor");
            arrEquipment[0] = new Equipment("Shield and Guardians Armor", "Set1", 10, 20, 30);
            arrEquipment[1] = new Equipment("Shield and Guardians Armor", "Set2", 40, 60, 70);
            arrEquipment[2] = new Equipment("Shield and Guardians Armor", "Set3", 100,120,130);
            arrEquipment[3] = new Equipment("Shield and Guardians Armor", "Set4", 300,200,230);
        }else if(a.dapatkanClass().equals("Necromancer")){
            this.setTipe("Staff and robe");
//            
        }else if(a.dapatkanClass().equals("Archer")){
            this.setTipe("Bow and robe");
//           
        }else{
            System.out.println("Player belum memiliki class");
        }
    }
    
    public void EquipmentsetforClass(Player a){
        a.wear = arrEquipment[0];
        a.setAttack_point(a.getAttack_point() + arrEquipment[0].getEquipment_att());
        a.setHP(a.getHP() + arrEquipment[0].getEquipment_HP());
        a.setDefense(a.getDefense()+ arrEquipment[0].getEquipment_def());
    }
    public void changeEquipment(Player a, Equipment item){
        a.setAttack_point(a.getAttack_point() - a.wear.getEquipment_att());
        a.setHP(a.getHP() - a.wear.getEquipment_HP());
        a.setDefense(a.getDefense()- a.wear.getEquipment_def());
        
        a.wear = item;
        a.setAttack_point(a.getAttack_point() + a.wear.getEquipment_att());
        a.setHP(a.getHP() + a.wear.getEquipment_HP());
        a.setDefense(a.getDefense()+ a.wear.getEquipment_def());
    }

    public int getEquipment_att() {
        return Equipment_att;
    }

    public void setEquipment_att(int Equipment_att) {
        this.Equipment_att = Equipment_att;
    }

    public int getEquipment_HP() {
        return Equipment_HP;
    }

    public void setEquipment_HP(int Equipment_HP) {
        this.Equipment_HP = Equipment_HP;
    }

    public int getEquipment_def() {
        return Equipment_def;
    }

    public void setEquipment_def(int Equipment_def) {
        this.Equipment_def = Equipment_def;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
