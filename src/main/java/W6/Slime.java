/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W6;

/**
 *
 * @author haika
 */
public class Slime extends Entity implements Enemy{
    private String color;
    
    public Slime(String color,int x,int y,int HP, int def, int speed, int att){
        super(x,y,HP,def,speed,att);
        this.color = color;
    }

    @Override
    public void move(int x, int y) {
        super.setY(super.getY() + 5);
        super.setX(super.getX() + 5);
        super.setY(super.getY() - 5);
        super.setX(super.getX() + 5);
    }

    @Override
    public void attack_Player(Player human) {
        human.setHP(human.getHP() - this.getAttack_point());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
