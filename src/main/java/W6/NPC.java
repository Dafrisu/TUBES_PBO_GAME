/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author daffa
 */
import java.util.Random;
import java.util.Scanner;

public class NPC extends Entity{
    private String nama;
    private String[] dialogue = new String [10];
    private String npctype;
    private Random intrandom = new Random();
    private int n = 2;
    public Equipment reward = new Equipment();
    public NPC(String nama,int HP, int def, int att) {
        super(HP, def, att);
        this.nama = nama;
    }
    
    public NPC(int HP, int def, int att){
        super(HP,def,att);
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void DialogueOut(){
        for(int i =0; i<dialogue.length; i++){
            if ( dialogue[i] != null){
                System.out.println(dialogue[i]);
            }
        }
    }

    public void SetDiag() {
        switch (this.npctype) {
            case "Merchant":
//                this.dialogue = new String[]{"Selamat datang petualang, Kamu orang yang beruntung menemukan tokoku","Tertarik untuk melihat lihat?" };
                this.dialogue[0] = "Selamat datang petualang, Kamu orang yang beruntung menemukan tokoku";
                this.dialogue[1] = "Tertarik untuk melihat lihat?";
                this.dialogue[2] = "1. menarik.... biarkan aku melihat lihat";
                this.dialogue[3] = "2. maaf, aku sedang buru buru, mungkin lain kali";
                break;
            case "Pemberi Hadiah":
                this.dialogue[0] = "aah... petualang, Terimakasih sudah mau melindungi kota kami";
                this.dialogue[1] = "Aku memiliki sedikit hadiah untukmu, apakah kamu mau menerimanya?";
                this.dialogue[2] = "1. baik, terimakasih pemberiannya tuan";
                this.dialogue[3] = "2. Tidak perlu tuan, aku bersedia melindungi kota ini tanpa meminta imbalan sepeserpun";
                break;
            case "Informan":
                this.dialogue[0] = "halo petualang, aku dengar kamu ingin mencari dan mengalahkan raja iblis ";
                this.dialogue[1] = "Aku memiliki informasi mengenai lokasi beberapa alat untuk membantumu mengalahkannya "; 
                this.dialogue[2] = "Tertarik untuk membeli informasi dariku?";
                this.dialogue[3] = "1. ya";
                this.dialogue[4] = "2. Tidak";
                break;
            default:
                break;
        }
        
    }
    public void tipeReward(Player a){

        if (this.npctype.equals("Merchant")){
            System.out.println("Pilih salah satu item ini petualang!");
            int n1, n2;
            n1 = intrandom.nextInt(0,3);
            n2 = intrandom.nextInt(0,3);
            System.out.println("1. " + this.reward.arrEquipment[n1].getNama());
            System.out.println("2. " + this.reward.arrEquipment[n2].getNama());
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Input");
            int choose = input.nextInt();
            if (choose == 1){
                this.reward = this.reward.arrEquipment[n1];
                a.wear.changeEquipment(a, reward);
            }else if(choose ==2){
                this.reward = this.reward.arrEquipment[n2];
                a.wear.changeEquipment(a, reward);
            }
        }else if (this.npctype.equals("Pemberi Hadiah")){
            System.out.println("Apakah kamu akan menggunakan item ini petualang?");
            int n1;
            n1 = intrandom.nextInt(0,3);
            System.out.println(this.reward.arrEquipment[n1].getNama());
            System.out.println("1. Iyadong maszeh");
            System.out.println("2. gaah males mau beli truk");
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Input");
            int choose = input.nextInt();
            if (choose == 1){
                this.reward = this.reward.arrEquipment[n1];
                a.wear.changeEquipment(a, reward);
            }
        }
    }
    public void pilih (Player a){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Input");
        int choose = input.nextInt();
        if(choose == 1){
            this.tipeReward(a);
        }else if (choose == 2){
            //next Interaction
        }
    }
    public void SetType(){
        n = this.n;
        if (n == 1){
            this.npctype = "Merchant";
        }else if (n ==2){
            this.npctype = "Pemberi Hadiah";
        }else if (n == 3){
            this.npctype = "Informan";
        }
    }

    public void Dialogue(Player a){
        this.SetType();
        this.SetDiag();
        this.DialogueOut();
        this.pilih(a);
    }
}
