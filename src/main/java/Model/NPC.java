/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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
    private int idxDialogue;
    private Random intrandom = new Random();
    private int n;
    public Equipment reward1 = new Equipment();
    public Equipment reward2 = new Equipment();
    
    public NPC(int HP, int def, int att){
        super(HP,def,att);
        n = intrandom.nextInt(1,3);
        SetType();
        SetDiag();
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void DialogueOut(){
        for(int i =0; i<getDialogue().length; i++){
            if ( getDialogue()[i] != null){
                System.out.println(getDialogue()[i]);
            }
        }
    }

    public void SetDiag() {
        switch (this.npctype) {
            case "Merchant":
//                this.dialogue = new String[]{"Selamat datang petualang, Kamu orang yang beruntung menemukan tokoku","Tertarik untuk melihat lihat?" };
                this.dialogue[0] = "Selamat datang petualang, Kamu orang yang beruntung menemukan tokoku";
                this.dialogue[1] = "Tertarik untuk melihat lihat?";
                this.dialogue[2] = "Pilih salah satu item ini petualang!";
                
                break;
            case "Pemberi Hadiah":
                this.dialogue[0] = "aah... petualang, Terimakasih sudah mau melindungi kota kami";
                this.dialogue[1] = "Aku memiliki sedikit hadiah untukmu, apakah kamu mau menerimanya?";
                this.dialogue[2] = "Apakah kamu akan menggunakan item ini petualang?";
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
    public void setReward(){
        if (this.npctype.equals("Merchant")){
            int n1, n2;
            n1 = intrandom.nextInt(0,4);
            n2 = intrandom.nextInt(0,4);
            this.reward1 = this.reward1.arrEquipment[n1];
            this.reward2 = this.reward2.arrEquipment[n2];
            this.dialogue[3]= ("1. " + this.reward1.getNama() +" "+ "2. " + this.reward2.getNama());
        }else if (this.npctype.equals("Pemberi Hadiah")){
            int n1;
            n1 = intrandom.nextInt(0,4);
            this.reward1 = this.reward1.arrEquipment[n1];
            this.dialogue[3]= ("Reward :" + this.reward1.getNama());
        }
    }
    public void pilihReward(Player a,int x){

        if (this.npctype.equals("Merchant")){
            if (x == 1){
                a.wear.changeEquipment(a, reward1);
            }else if(x ==2){
                a.wear.changeEquipment(a, reward2);
            }
        }else if (this.npctype.equals("Pemberi Hadiah")){
            if (x == 1){
                a.wear.changeEquipment(a, reward1);
            }else if(x ==2){
                System.out.println("Hadiah Ditolak");
            }
        }
    }
    //public int pilih (Player a){
        //Scanner input = new Scanner(System.in);
        //System.out.println("Masukkan Input");
        //int choose = input.nextInt();
        //if(choose == 1){
            //this.tipeReward(a,);
        //}else if (choose == 2){
            //next Interaction
        //}
    //}
    public void SetType(){
        n = this.n;
        if (n == 1){
            this.npctype = "Merchant";
        }else if (n ==2){
            this.npctype = "Pemberi Hadiah";
        }
    }

    public void Dialogue(Player a){
        SetType();
        this.SetDiag();
        this.DialogueOut();
    }

    /**
     * @return the dialogue
     */
    public String[] getDialogue() {
        return dialogue;
    }
    
}
