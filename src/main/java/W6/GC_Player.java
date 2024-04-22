/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public class GC_Player extends ChildPlayer{
    public GC_Player(String nama,int x, int y,int HP, int def, int speed, int att ){
        super(nama,x,y,HP,def,speed,att);
    }
    @Override
    public String ToString(){
        return "Ini Grand Child Player";
    }
    public String metodGrandChild(){
        return "Metod GrandChild Player";
    }
}
    