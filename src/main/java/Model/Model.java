/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haika
 */
public class Model {
    public NPC npc;
    public Enemy enemy;
    public Player player;
    public Entity entity;
    public Stage stage;
    public Equipment equipment;
    private static int scores;
    private int fullScore ;

    public int getFullScore() {
        return scores = this.fullScore + getScores();
    }

    public void setFullScore(int fullScore) {
        this.fullScore = fullScore;
    }

    public static int getScores() {
        return scores;
    }

    public static void setScores(int scores) {
        Model.scores = scores;
    }
    
    public static void scores100(){
        scores = scores + 100;
    }
    
    
    
}
