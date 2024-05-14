/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_w6;
import W6.*;
import java.util.Random;
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
        Random intrandom = new Random();
        int n1 = intrandom.nextInt(0,3);
        Stage alur = new Stage();
        alur.run();
        System.out.println(alur.isBattle());
        alur.run();
        System.out.println(alur.isBattle());
        alur.run();
        System.out.println(alur.isBattle());
        alur.run();
        System.out.println(alur.isBattle());
        System.out.println("");
        dafa.tipeClass(1);
        dafa.wear.EquipmentInit(dafa);
        dafa.wear.EquipmentsetforClass(dafa);
        dafa.CheckStats();
        dafa.checkEquipment();
        udin.reward.EquipmentInit(dafa);
        udin.Dialogue(dafa);
        dafa.CheckStats();
        dafa.checkEquipment();
    }
}
