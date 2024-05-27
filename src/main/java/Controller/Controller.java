/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import VIew.GUI;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author haika
 */
public class Controller {
    private Model model;
    private GUI view;
    
    public Controller(Model model, GUI view){
        this.model = model;
        this.view = view;
        init();
        view.getAttack_button().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        view.getOpsi1().addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                Opsi1ActionPerformed();
            }
            
        });
        view.getOpsi2().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Opsi2ActionPerformed();
            }
            
        });
        view.getBoxdialog1().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                BoxDialogPerformed();
            }
            
        });
        view.getOkbutton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                OKButton();
            }
        
        });
        view.getButton_assasin().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAssassin();
            }
        });
        view.getButton_guardian().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuardian();
            }
        });
        view.getButton_necromancer().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNecromancer();
            }

        });
        view.getButton_archer().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonArcher();
            }
            
        });
    }
    
    public void init(){
        view.getNamaPlayer().setVisible(false);
        view.getAttack_button().setVisible(false);
        model.npc = new NPC(10,10,10);
        model.npc.SetType();
        model.npc.SetDiag();
        view.getWinorlose().setVisible(false);
    }
    
    public void NPCInteraction(){
        String[] textNPC = new String[5];
        System.out.println(textNPC.length);
        textNPC = model.npc.getDialogue();
        try {
            if (view.getIdxDialogue() == textNPC.length -1) {
                throw new Exception("Sudah max idx");
            }
            if (view.getIdxDialogue()<textNPC.length){
                view.getLabelbox().setText(textNPC[view.getIdxDialogue()]);
                view.setIdxDialogue(view.getIdxDialogue() + 1);
                if(textNPC[view.getIdxDialogue()]==null && view.getIdxDialogue() < textNPC.length){
                    view.setIdxDialogue(view.getIdxDialogue() + 1);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void Timer(){
        Timer timer = new Timer(1000, new ActionListener() { // Delay 1 detik (1000 milidetik)
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                view.getAlur().run();
            if (view.getAlur().getCurrentInteraction() < view.getAlur().getMAX_INTERACTIONS() ){
                if (view.getAlur().isBattle() == true){
                        view.getStage().setSelectedIndex(3);
                        view.getStage().setSelectedIndex(2);
                }else{
                        view.getStage().setSelectedIndex(3);
                        view.getStage().setSelectedIndex(5);
                }
            }else{
                    view.getStage().setSelectedIndex(3);
            }
                view.getAlur().setCurrentInteraction(view.getAlur().getCurrentInteraction() + 1);
                view.getAlur().setBattle(true);
                view.getWinorlose().setVisible(false);
                view.getLabelbox().setText("|");
                view.setIdxDialogue(0);
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
         // error still
    }
    private void Opsi1ActionPerformed() {                                   
        int pilih;
        pilih = 1;
        model.npc.pilihReward(model.player,pilih);
        view.ChangeAttr();
        Timer();
    }                                     

    private void Opsi2ActionPerformed() {                                    
        int pilih;
        pilih = 2;
        model.npc.pilihReward(model.player, pilih);
        view.ChangeAttr();
        Timer();
    }    
    private void BoxDialogPerformed(){
        String[] textNPC = new String[5];
        System.out.println(textNPC.length);
        textNPC = model.npc.getDialogue();
        try {
            if (view.getIdxDialogue() == textNPC.length -1) {
                throw new Exception("Sudah max idx");
            }
            if (view.getIdxDialogue()<textNPC.length){
                view.getLabelbox().setText(textNPC[view.getIdxDialogue()]);
                view.setIdxDialogue(view.getIdxDialogue() + 1);
                if(textNPC[view.getIdxDialogue()]==null && view.getIdxDialogue() < textNPC.length){
                    view.setIdxDialogue(view.getIdxDialogue() + 1);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void OKButton(){
        if (!view.getGetNamePlayer().getText().equals("")){
            String nama = view.getGetNamePlayer().getText();
            model.player = new Player(nama, 200,100,100);
            view.getNamaPlayer().setText(model.player.getNama());
            view.getNamaPlayer().setVisible(true);
            view.getValueHP().setText(model.player.getHP() +"");
            view.getValueDef().setText(model.player.getDefense() + "");
            view.getValueAtk().setText(model.player.getAttack_point() + "");
            view.getStage().setSelectedIndex(1);
        }
    }
    public void buttonAssassin(){
        view.setClassN(1);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.dapatkanClass());
        view.getStage().setSelectedIndex(4);
    }
    public void buttonGuardian(){
        view.setClassN(2);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.dapatkanClass());
        view.getStage().setSelectedIndex(4);
    }
    public void buttonNecromancer(){
        view.setClassN(3); 
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.dapatkanClass());
        view.getStage().setSelectedIndex(4);
    }
    public void buttonArcher(){
        view.setClassN(4);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.dapatkanClass());
        view.getStage().setSelectedIndex(4);
    }
    public void ChangeAttr(){
        ChangeHP();
        ChangeDef();
        ChangeAtk();
    }
    public void ChangeHP(){
        view.getValueHP().setText(model.player.getHP() + "");
    }
    public void ChangeDef(){
        view.getValueDef().setText(model.player.getDefense() +"");
    }
    
    public void ChangeAtk(){
        view.getValueAtk().setText(model.player.getAttack_point() + "");
    }
}
