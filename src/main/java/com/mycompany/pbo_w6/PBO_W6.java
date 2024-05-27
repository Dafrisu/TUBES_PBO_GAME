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
        Controller controller = new Controller(model,view);
        view.setVisible(true);
    }
}
