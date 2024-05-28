/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_w6;
import Model.*;
import Controller.*;
import VIew.GUI;
import java.util.Random;
/**
 *
 * @author haika
 */

public class PBO_W6 {

    public static void main(String[] args) {
        Model model = new Model();
        GUI view = new GUI();
        NPC npc = new NPC(10,10,10);
        for(int i = 0; i < npc.getListDialog().size(); i ++){
            System.out.println(npc.getListDialog().get(i));
        }
        Controller controller = new Controller(model,view);
        view.setVisible(true);
    }
}
