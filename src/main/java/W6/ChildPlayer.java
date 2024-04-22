/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public class ChildPlayer extends Player{
    public ChildPlayer(String nama,int x, int y,int HP, int def, int speed, int att ){
        super(nama,x,y,HP,def,speed,att);
    }
    @Override
    public String ToString(){
        return "Ini Child Player";
    }
    public String metodChild(){
        return "Metod Child Player";
    }
}
