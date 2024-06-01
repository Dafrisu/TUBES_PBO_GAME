/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import VIew.GUI;
import VIew.Main_Menu;
import VIew.ScoreBoard;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author haika
 */
public class Controller {
    private Model model;
    private GUI view;
    private Main_Menu menu;
    private ScoreBoard SCBD;
    
    public Controller(Model model, GUI view, Main_Menu menu, ScoreBoard SCBD){
        this.model = model;
        this.view = view;
        this.menu = menu;
        init();
        view.getAttack_button().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                attackbutton();
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
        view.getYesclass().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                yesclassbutton();
            }
            
        });
        view.getNoclass().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                noclassbutton();
            }
        });
        view.getWinorlose().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                winorlosebox();
            }
        });
        view.getStage().addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                statestagechange();
            }
        });
        view.getHPMusuh().addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                hpmusuhstatechange();
            }
            
        });
        view.getRestart_onmenang().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                RestartWin();
            }
            
        });
        view.getRestart_onkalah().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                RestartLose();
            }
        });
        view.getMainMenu_onmenang().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuWin();
            }
        });
        view.getMainMenu_onkalah().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuLose();
            }
            
        });
        
        // ------ ACtion performed Main menu-------//
        
        menu.getPlay_button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                mousePlayenter();
            }
        });
        menu.getPlay_button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent e){
                mousePlayexit();
            }
        });
        menu.getScoreBoard_button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                mouseScoreenter();
            }
        });
        menu.getScoreBoard_button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent e){
                mouseScoreexit();
            }
        });
        menu.getExit_Button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                mouseExitEnter();
            }
        });
        menu.getExit_Button().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent e){
                mouseExitexit();
            }
        });
        menu.getPlay_button().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Playclicked();
            }
        });
        menu.getScoreBoard_button().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoreclicked();
            }
        });
        menu.getExit_Button().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Exitclicked();
            }
        });
        
        // ---------- Bagian JDialog ScoreBoard ----------- //
        
        SCBD.getClose().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                closeScore();
            }
        });
    }
    
    public void init(){
        view.getNamaPlayer().setVisible(false);
        view.getAttack_button().setVisible(false);
        model.npc = new NPC(10,10,10);
        
        view.getWinorlose().setVisible(false);
        view.getListdamage().setModel(view.model);
    }
    
    // button untuk menyerang musuh
    public void attackbutton(){
        // player attack enemy
        model.player.attack(model.enemy);
        view.getHPMusuh().setValue(model.enemy.getHP());

        // jika enemy belum mati, player terkena serangan

        view.model.addElement(model.enemy.getMusuh().name() + " Terkena Serangan " + model.player.getDamage() + " Damage");

        if(model.enemy.getHP() >= 0){
            model.enemy.attack(model.player);
            view.model.addElement(model.player.getNama() + " Terkena Serangan " + model.enemy.getDamage() + " Damage");
            ChangeAttr();
        }
        
        // jika player mati, ganti tab panel ke panel lose
        if (model.player.getHP() <=0){
            
            // set attribut Hp musuh jadi 0 dan ubah attributnya di GUI
            model.player.setHP(0);
            ChangeAttr();
            view.setWin(winlose(model.player));
            if(!view.isWin()){
                view.getAttack_button().setVisible(false);
                timerlose();
            }
        }
        
        // jika enemy mati, set button attack invisible, lalu masuk ke fungsi timerwin(delay untuk stage selanjutnya)
        if (model.enemy.getHP() < 0){
            view.absorbHP = view.absorbHP + model.enemy.getMaxHP()*10/100;
            model.player.setMaxHP();
            view.model.addElement("Absorb HP musuh sebanyak "+  (model.enemy.getMaxHP()*10/100) );
            model.player.setHP(model.player.getMaxHP());
            ChangeAttr();
            view.setWin(winlose(model.enemy));
            if(view.isWin()){
                view.getAttack_button().setVisible(false);
                timerwin(); 
            }
        }
    }
    
    // Pengecekan jika Entity kalah, jika musuh kalah return win, jika player kalah return !win
    public boolean winlose(Entity e){
        boolean win = false;
        
        // jika entity adalah enemy, dan enemy Hp <0, return win
        if(e instanceof Enemy){
            if(e.getHP() <=0){
                win = true;
            }
        }
        
        // jika entity adalah player, dan player Hp < 0, return !win
        if(e instanceof Player){
            if(e.getHP() <= 0){
                win = false;
            }
        }
        return win;
    }
    
    // set NPC dialog di GUI
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
    
    public void delay(ActionListener e){
        Timer timer = new Timer(1000, e);
        timer.setRepeats(false);
        timer.start();
    }
    
    // delay untuk menampilkan border menang
    public void timerwin(){
        Timer timer = new Timer(1000, new ActionListener() { // Delay 1 detik (1000 milidetik)
            @Override
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                    view.getWinorlose().setVisible(true);
                    view.getWinorlose().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    view.getAfterbattle().setText("Anda Berhasil Mengalahkan Musuh");
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
    }
    
    // delay untuk menampilkan border kalah
    public void timerlose(){
        Timer timer = new Timer(1000, new ActionListener() { // Delay 1 detik (1000 milidetik)
            @Override
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                    view.getWinorlose().setVisible(true);
                    view.getWinorlose().setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    view.getAfterbattle().setText("Telah dikalahkan oleh musuh....");
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
    }
    // Timer untuk delay sebelum ganti stage
    public void Timer(){
        // timer ganti stage jika menang
        if(view.isWin()){
            Timer timer = new Timer(1000, new ActionListener() { // Delay 1 detik (1000 milidetik)
            @Override
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                view.getAlur().run(model.enemy);
                if(view.getAlur().getCurrentInteraction() == view.getAlur().getMAX_INTERACTIONS()){
                    view.getStage().setSelectedIndex(3);
                    view.getScoreonwin().setText("Score : " + Model.score);
                    view.getAttack_button().setVisible(false);
                }
                if (view.getAlur().getCurrentInteraction() < view.getAlur().getMAX_INTERACTIONS()) {
                    if (view.getAlur().isBattle() == true) {
                        view.getStage().setSelectedIndex(3);
                        view.getStage().setSelectedIndex(2);
                        view.getAlur().setCurrentInteraction(view.getAlur().getCurrentInteraction() + 1);
                    } else {
                        view.getStage().setSelectedIndex(3);
                        view.getStage().setSelectedIndex(5);
                        setOpsiName();
                        view.getOpsi1().setVisible(false);
                        view.getOpsi2().setVisible(false);
                        view.getAlur().setCurrentInteraction(view.getAlur().getCurrentInteraction() + 1);
                    }
                } else {
                    view.getStage().setSelectedIndex(3);
                }    
                    Model.score = Model.score + 100;
                    view.getWinorlose().setVisible(false);
                    view.getLabelbox().setText("|");
                    view.setIdxDialogue(0);
                }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
        }else{
            Timer timer = new Timer(1000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(model.enemy.getMusuh() != Enemy.Enemies.Dragoon){
                        view.getStage().setSelectedIndex(6);
                        view.getScoreonlose().setText("Score : " + Model.score);
                        view.getDeadmessage().setText("Player Dibunuh Oleh " + model.enemy.getMusuh() +" ("+model.enemy.getType()+")");
                    }else{
                        view.getStage().setSelectedIndex(6);
                        view.getScoreonlose().setText("Score : " + Model.score);
                        view.getDeadmessage().setText("Player Dibunuh Oleh " + model.enemy.getMusuh() + "(Last Boss)");
                    }
                    
                }
                
            });
            timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
            timer.start(); // Memulai timer
        }
         // error still
    }
    public void setOpsiName(){
        if (model.npc.getNpctype().equals("Merchant")) {
            view.getOpsi1().setText(model.npc.reward1.getNama());
            view.getOpsi2().setText(model.npc.reward2.getNama());
        } else {
            view.getOpsi1().setText("Terima");
            view.getOpsi2().setText("Tolak");
        }
    }
    // memilih opsi pertama ketika interaksi dengan NPC
    private void Opsi1ActionPerformed() {                                   
        int pilih;
        pilih = 1;
        model.npc.pilihReward(model.player,pilih);
        model.player.setMaxHP();
        ChangeAttr();
        model.npc = new NPC(10,10,10);
        model.npc.reward1.EquipmentInit(model.player);
        model.npc.reward2.EquipmentInit(model.player);
        model.npc.setReward();
        Timer();
    }                                     

    // memilih opsi kedua ketika interaksi dengan NPC
    private void Opsi2ActionPerformed() {                                    
        int pilih;
        pilih = 2;
        if(model.npc.getNpctype().equals("Merchant")){
            model.npc.pilihReward(model.player, pilih);
            model.player.setMaxHP();
            ChangeAttr();
            model.npc = new NPC(10, 10, 10);
            model.npc.reward1.EquipmentInit(model.player);
            model.npc.reward2.EquipmentInit(model.player);
            model.npc.setReward();
            Timer(); 
        }else{
            Timer();
        }
    }
    
    //menampilkan semua dialog npc di box panel
    private void BoxDialogPerformed(){
        ArrayList<String> textNPC = new ArrayList<>();
        textNPC = model.npc.getListDialog();
        System.out.println(textNPC.size());
        try {
            if(view.getIdxDialogue() == textNPC.size() - 1){
                view.getOpsi1().setVisible(true);
                view.getOpsi2().setVisible(true);
            }

            if (view.getIdxDialogue() == textNPC.size()) {
                throw new Exception("Mencapai akhir dialog");
            }
            if (view.getIdxDialogue()<textNPC.size() ){
                view.getLabelbox().setText(textNPC.get(view.getIdxDialogue()));
                view.setIdxDialogue(view.getIdxDialogue() + 1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(view, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //mengkonfirm nama player
    private void OKButton(){
        if (!view.getGetNamePlayer().getText().equals("")){
            String nama = view.getGetNamePlayer().getText();
            model.player = new Player(nama, 50,30,30);
            view.getNamaPlayer().setText(model.player.getNama());
            view.getNamaPlayer().setVisible(true);
            view.getValueHP().setText(model.player.getHP() +"");
            view.getValueDef().setText(model.player.getDefense() + "");
            view.getValueAtk().setText(model.player.getAttack_point() + "");
            view.getStage().setSelectedIndex(1);
        }
    }
    
    //memilih class assassin
    public void buttonAssassin(){
        view.setClassN(1);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.getPlayerClass().toString());
        view.getStage().setSelectedIndex(4);
    }
    
    //memilih class guardian
    public void buttonGuardian(){
        view.setClassN(2);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.getPlayerClass().toString());
        view.getStage().setSelectedIndex(4);
    }
    
    //memilih class necromancer
    public void buttonNecromancer(){
        view.setClassN(3); 
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.getPlayerClass().toString());
        view.getStage().setSelectedIndex(4);
    }
    
    //memilih class archer
    public void buttonArcher(){
        view.setClassN(4);
        model.player.tipeClass(view.getClassN());
        view.getChoosenClass().setText(model.player.getPlayerClass().toString());
        view.getStage().setSelectedIndex(4);
        
    }
    
    //mengganti semua attribute di label HP, def, dan atk di GUI
    public void ChangeAttr(){
        ChangeHP();
        ChangeDef();
        ChangeAtk();
    }
    
    // setlabel HP di GUI
    public void ChangeHP(){
        view.getValueHP().setText(model.player.getHP() + "");
    }
    
    //set label Def di GUI
    public void ChangeDef(){
        view.getValueDef().setText(model.player.getDefense() +"");
    }
    
    //set label Atk di GUI
    public void ChangeAtk(){
        view.getValueAtk().setText(model.player.getAttack_point() + "");
    }
    
    //confirm class yang dipilih
    public void yesclassbutton(){
        view.getEquipment().EquipmentInit(model.player);
        view.getEquipment().EquipmentsetforClass(model.player);
        model.player.setBaseHP(model.player.getHP());
        model.player.setBasedef(model.player.getDefense());
        model.player.setBaseatk(model.player.getAttack_point());
        model.player.setMaxHP();
        ChangeAttr();
        model.npc.reward1.EquipmentInit(model.player);
        model.npc.reward2.EquipmentInit(model.player);
        model.npc.setReward();
        setOpsiName();
        view.getAlur().run(model.enemy);
        if (view.getAlur().isBattle() == true){
            view.getStage().setSelectedIndex(2);
        }else{
            view.getStage().setSelectedIndex(5);
        }
        view.getAlur().setCurrentInteraction(view.getAlur().getCurrentInteraction() + 1);
    }
    public void noclassbutton(){
        view.getStage().setSelectedIndex(1);
    }
    public void winorlosebox(){
        Timer();
    }
    public void statestagechange(){
        if (view.getAlur().isBattle() == true){
            view.getAttack_button().setVisible(true);
            if(view.isWin()){
                model.enemy = Stage.EnemyGoing();
            }
            if (model.enemy.getMusuh() != Enemy.Enemies.Dragoon) {
                view.getEnemyLabel().setText(model.enemy.getMusuh().toString() + " (" + model.enemy.getType() + ")");
            } else {
                view.getEnemyLabel().setText(model.enemy.getMusuh().toString());
            }
            view.getHPMusuh().setMaximum(model.enemy.getHP());
            view.getHPMusuh().setValue(model.enemy.getHP());
        }else{
            view.getAttack_button().setVisible(false);
        }

        if(!view.isWin()){
            view.getAttack_button().setVisible(false);
        }
    }
    public void hpmusuhstatechange(){
        
        view.getHPMusuh().setValue(model.enemy.getHP());
//        if(percentagehp <= 100 && percentagehp >=50){
//            //do logic
//            view.getHPMusuh().setBackground(Color.green);
//        }else{
//            view.getHPMusuh().setBackground(Color.red);
//        }
    }
    
    public void RestartWin(){
        GUI.absorbHP = 0;
        GUI.absorbdef = 0;
        GUI.absorbatk = 0;
        view.getAlur().setCurrentInteraction(0);
        view.getStage().setSelectedIndex(0);
        view.getGetNamePlayer().setText("");
        view.getNamaPlayer().setText("Player");
        view.model.clear();
    }
    
    public void RestartLose(){
        GUI.absorbHP = 0;
        GUI.absorbdef = 0;
        GUI.absorbatk = 0;
        view.setWin(true);
        view.getAlur().setCurrentInteraction(0);
        view.getStage().setSelectedIndex(0);
        view.getGetNamePlayer().setText("");
        view.getNamaPlayer().setText("Player");
        view.model.clear();
    }
    public void MenuWin(){
        view.getAlur().setCurrentInteraction(0);
        view.setVisible(false);
        view.getStage().setSelectedIndex(0);
        menu.setVisible(true);
        view.getGetNamePlayer().setText("");
        view.getNamaPlayer().setText("Player");
        view.model.clear();
    }
    public void MenuLose(){
        view.getAlur().setCurrentInteraction(0);
        view.setVisible(false);
        view.setWin(true);
        view.getStage().setSelectedIndex(0);
        menu.setVisible(true);
        view.getGetNamePlayer().setText("");
        view.getNamaPlayer().setText("Player");
        view.model.clear();
    }
    
    // ------------- Bagian GUI Main Menu--------//
    
    public void mousePlayenter(){
        menu.getPlay_button().setBackground(Color.GRAY);
    }
    public void mouseScoreenter(){
        menu.getScoreBoard_button().setBackground(Color.GRAY);
    }
    public void mouseExitEnter(){
        menu.getExit_Button().setBackground(Color.GRAY);
    }
    public void mousePlayexit(){
        menu.getPlay_button().setBackground(Color.white);
    }
    public void mouseScoreexit(){
        menu.getScoreBoard_button().setBackground(Color.white);
    }
    public void mouseExitexit(){
        menu.getExit_Button().setBackground(Color.white);
    }
    public void Playclicked(){
        this.view = view;
        menu.setVisible(false);
        view.setVisible(true);
    }
    public void Scoreclicked(){
        ScoreBoard SCBD = new ScoreBoard(menu, true);
        SCBD.setVisible(true);
    }
    public void Exitclicked(){
        int pilih = JOptionPane.showConfirmDialog(view, 
                "Apakah Anda Yakin ingin Keluar??", 
                "Konfirmasi", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE);
        if(pilih == JOptionPane.OK_OPTION){
            menu.dispose();
        }
    }
    
    // ---------- Bagian JDialog ScoreBoard ----------- //
    public void closeScore(){
        SCBD.dispose();
    }
}
