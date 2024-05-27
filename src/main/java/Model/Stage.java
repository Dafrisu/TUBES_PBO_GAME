/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Random;
/**
 *
 * @author Mahesa
 */
public class Stage {
    private int MAX_INTERACTIONS =5;
    private int currentInteraction = 0;
    private boolean battle;
    Random random = new Random(); // Create a Random object
    
    public int getMAX_INTERACTIONS() {
        return MAX_INTERACTIONS;
    }

    public void setMAX_INTERACTIONS(int MAX_INTERACTIONS) {
        this.MAX_INTERACTIONS = 5;
    }

    public int getCurrentInteraction() {
        return currentInteraction;
    }

    public void setCurrentInteraction(int currentInteraction) {
        this.currentInteraction = currentInteraction;
    }
    
    public boolean isBattle() {
        return battle;
    }

    public void setBattle(boolean battle) {
        this.battle = battle;
    }

    public void run() {
        int encounterType = random.nextInt(2)+1; // Generate random number (1 or 2)
        System.out.println(encounterType);
        if ( currentInteraction < MAX_INTERACTIONS){
            
            if (encounterType == 1){
                setBattle(true);
            }
            else if (encounterType == 2){
                setBattle(false);
            }
        }else{
            System.out.println("Udah habis");
        }
        
        

    }
}