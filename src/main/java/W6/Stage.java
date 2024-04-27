/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W6;
import java.util.Random;
/**
 *
 * @author Mahesa
 */
public class Stage {
    private int MAX_INTERACTIONS;
    private int currentInteraction = 0;
    private boolean battle;

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
        Random random = new Random(); // Create a Random object

        while (currentInteraction < MAX_INTERACTIONS) {
            int encounterType = random.nextInt(2) + 1; // Generate random number (1 or 2)

            if (encounterType == 1) {
                System.out.println("Bertemu musuh! Bersiap untuk bertempur!");
                setBattle(true);
            } else if (encounterType == 2){
                System.out.println("Bertemu NPC! Mari kita lihat apa yang akan dia katakan.");
                setBattle(false);
                NPC npc = new NPC("NPC Name", 100, 10, 5);
                npc.SetType();
                npc.SetDiag();
            }
            currentInteraction++;
        }
        
        if (currentInteraction > MAX_INTERACTIONS){
            
        }
    }
}