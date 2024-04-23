/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_w6;
import W6.*;
/**
 *
 * @author haika
 */

public class PBO_W6 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Player castP;
        Player dafa = new Player("dafa",100, 100, 100);
        Enemy Haikal = new Enemy("Haikal",100, 100, 100);
        NPC udin = new NPC("udin", 100, 100, 100);
        System.out.println(dafa.persepective(dafa));
        System.out.println(Haikal.persepective(Haikal));
        dafa.attack(dafa);
        udin.SetType();
        udin.DialogueOut();
        udin.PrintDiag();
        Haikal.attack(dafa);
        System.out.println(dafa.getHP());
//        GC_Player Darryl = new GC_Player("darryl",0,0, 100, 100, 100, 100);
//        castP = dafa;
//        System.out.println(castP.ToString());
//        castP = Haikal;
//        System.out.println(castP.ToString());
//        castP = Darryl;
//        System.out.println(castP.ToString());
//        System.out.println(Haikal.metodChild());
//        
//        Player Raphael = new ChildPlayer("Raphael",0,0, 100, 100, 100, 100);
//        ChildPlayer Mahesa = (ChildPlayer) Raphael;
//        System.out.println(Mahesa.metodChild());
//        
//        
//        if(Raphael instanceof Player){
//            System.out.println("Raphael pro player");
//        }else if(Haikal instanceof Player){
//            System.out.println("Raphael Noob");
//        }
//        dafa.tipeClass();
//        dafa.Skillset();
//        System.out.println(dafa.getNama() + "'s Class is " + dafa.dapatkanClass() + ", " + dafa.getNama()+
//                " mendapatkan " + dafa.getSkills());
//        
        
        
        // Contoh Narrow cast
//        double c = 125.35;
//        long b = (long)c;
//        int a = (int)b;
//        System.out.println("double: " + c);
//        System.out.println("long: " + b);
//        System.out.println("int: " + a);
        
        
    }
}
