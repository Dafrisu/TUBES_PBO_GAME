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
        dafa.tipeClass();
        System.out.println(dafa.dapatkanClass());
        Equipment wear = new Equipment(0,0,0);
        wear.EquipmentsetforClass(dafa);
        System.out.println(dafa.getAttack_point()+" " + dafa.getHP()+ " " + dafa.getDefense());
    }
}
