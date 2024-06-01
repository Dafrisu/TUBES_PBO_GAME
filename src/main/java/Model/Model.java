/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haika
 */
public class Model implements Actions{
    public NPC npc;
    public Enemy enemy;
    public Player player;
    public Entity entity;
    public Stage stage;
    public Equipment equipment;
    public static int score = 0;

    @Override
    public void attack(Entity pelaku_penyerangan) {
        boolean perspective = player.persepective(pelaku_penyerangan);
        
        if (perspective){
            if (pelaku_penyerangan instanceof Player){
                int reduce = enemy.getDefense() * 20/100;
                enemy.setHP(enemy.getHP() - (pelaku_penyerangan.getAttack_point() - reduce));
                player.setDamage(player.getAttack_point() - reduce);
            }
        }else{
            if (pelaku_penyerangan instanceof Enemy){
                int reduce = enemy.getDefense() * 20/100;
                enemy.setHP(enemy.getHP() - (player.getAttack_point() - reduce));
                enemy.setDamage(enemy.getAttack_point() - reduce);
            }
        }
    }
}
