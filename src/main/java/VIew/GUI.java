/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIew;
import Model.Equipment;
import Model.NPC;
import Model.Enemy;
import Model.Player;
import Model.Stage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author haika
 */
public class GUI extends javax.swing.JFrame {

    public javax.swing.JButton getMainMenu_onkalah() {
        return MainMenu_onkalah;
    }

    public javax.swing.JButton getMainMenu_onmenang() {
        return MainMenu_onmenang;
    }

    public javax.swing.JButton getRestart_onkalah() {
        return Restart_onkalah;
    }

    public javax.swing.JButton getRestart_onmenang() {
        return Restart_onmenang;
    }
    public static int absorbHP = 0;
    public static int absorbdef = 0;
    public static int absorbatk = 0;
    private boolean win = true;
    public DefaultListModel model = new DefaultListModel<>();
    private boolean battle = false;
    private boolean chooseClass = false;
    private int classN;
    private Stage alur = new Stage();
    private Equipment equipment = new Equipment();
    private int idxDialogue = 0;
    public GUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHP = new javax.swing.JLabel();
        labelAtk = new javax.swing.JLabel();
        labelDef = new javax.swing.JLabel();
        NamaPlayer = new javax.swing.JLabel();
        ValueHP = new javax.swing.JLabel();
        ValueAtk = new javax.swing.JLabel();
        ValueDef = new javax.swing.JLabel();
        Attack_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listdamage = new javax.swing.JList<>();
        Stage = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Okbutton = new javax.swing.JButton();
        GetNamePlayer = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button_assasin = new javax.swing.JButton();
        button_guardian = new javax.swing.JButton();
        button_necromancer = new javax.swing.JButton();
        button_archer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        HPMusuh = new javax.swing.JProgressBar();
        Player = new javax.swing.JLabel();
        EnemyLabel = new javax.swing.JLabel();
        winorlose = new javax.swing.JPanel();
        afterbattle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Restart_onmenang = new javax.swing.JButton();
        MainMenu_onmenang = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ClassQ = new javax.swing.JLabel();
        ChoosenClass = new javax.swing.JLabel();
        Yesclass = new javax.swing.JButton();
        Noclass = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        boxdialog1 = new javax.swing.JPanel();
        labelbox = new javax.swing.JLabel();
        Opsi1 = new javax.swing.JButton();
        Opsi2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Deadmessage = new javax.swing.JLabel();
        Restart_onkalah = new javax.swing.JButton();
        MainMenu_onkalah = new javax.swing.JButton();
        labelScoreLose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 206));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHP.setText("HP      : ");
        jPanel1.add(labelHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 47, -1, -1));

        labelAtk.setText("Attack : ");
        jPanel1.add(labelAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 119, -1, -1));

        labelDef.setText("Def     : ");
        jPanel1.add(labelDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 82, -1, -1));

        NamaPlayer.setText("Nama Petualang");
        jPanel1.add(NamaPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, -1, -1));

        ValueHP.setText("ValueHP");
        jPanel1.add(ValueHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 47, -1, -1));

        ValueAtk.setText("ValueAtk");
        jPanel1.add(ValueAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 119, -1, -1));

        ValueDef.setText("ValueDef");
        jPanel1.add(ValueDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 82, -1, -1));

        Attack_button.setText("Attack");
        Attack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Attack_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 44, -1, -1));

        jScrollPane1.setViewportView(listdamage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 220, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 720, 200));

        Stage.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                StageStateChanged(evt);
            }
        });

        jLabel1.setText("Masukan Nama Petualang:");

        Okbutton.setText("OK");
        Okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkbuttonActionPerformed(evt);
            }
        });

        GetNamePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetNamePlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GetNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Okbutton)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Okbutton))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        Stage.addTab("name", jPanel2);

        jLabel2.setText("Pilih Class ");

        button_assasin.setText("Assasin");
        button_assasin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_assasinActionPerformed(evt);
            }
        });

        button_guardian.setText("Guardian");
        button_guardian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guardianActionPerformed(evt);
            }
        });

        button_necromancer.setText("Necromancer");
        button_necromancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_necromancerActionPerformed(evt);
            }
        });

        button_archer.setText("Archer");
        button_archer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_archerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_guardian, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_assasin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_necromancer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_archer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(button_assasin)
                .addGap(18, 18, 18)
                .addComponent(button_guardian)
                .addGap(18, 18, 18)
                .addComponent(button_necromancer)
                .addGap(18, 18, 18)
                .addComponent(button_archer)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        Stage.addTab("class", jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(720, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HPMusuh.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        HPMusuh.setForeground(new java.awt.Color(255, 0, 51));
        HPMusuh.setMaximum(200);
        HPMusuh.setToolTipText("");
        HPMusuh.setValue(200);
        HPMusuh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        HPMusuh.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HPMusuhStateChanged(evt);
            }
        });
        jPanel4.add(HPMusuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 57, -1, 10));

        Player.setText("Player");
        jPanel4.add(Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 168, -1, -1));

        EnemyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyLabel.setText("Enemy");
        jPanel4.add(EnemyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 73, 146, -1));

        winorlose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                winorloseMouseClicked(evt);
            }
        });
        winorlose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afterbattle.setText("|");
        winorlose.add(afterbattle, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel4.add(winorlose, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 450, 30));

        Stage.addTab("battle", jPanel4);

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLabel3.setText("MENANG ");

        Restart_onmenang.setText("RESTART");

        MainMenu_onmenang.setText("MAIN MENU");
        MainMenu_onmenang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_onmenangActionPerformed(evt);
            }
        });

        scoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scoreLabel.setText("Score:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Restart_onmenang, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(MainMenu_onmenang))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(scoreLabel)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(scoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Restart_onmenang)
                    .addComponent(MainMenu_onmenang))
                .addGap(58, 58, 58))
        );

        Stage.addTab("win", jPanel6);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClassQ.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        ClassQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClassQ.setText("APAKAH ANDA YAKIN AKAN MEMILIH CLASS");
        ClassQ.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel5.add(ClassQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 59, 384, -1));

        ChoosenClass.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        ChoosenClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoosenClass.setText("class");
        jPanel5.add(ChoosenClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 80, 194, -1));

        Yesclass.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Yesclass.setText("YA");
        Yesclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        Yesclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesclassActionPerformed(evt);
            }
        });
        jPanel5.add(Yesclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 133, 80, -1));

        Noclass.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Noclass.setText("Tidak");
        Noclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        Noclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoclassActionPerformed(evt);
            }
        });
        jPanel5.add(Noclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 133, 80, -1));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(Class Tidak akan bisa berubah Di lain waktu)");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 101, 364, -1));

        Stage.addTab("confclass", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxdialog1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boxdialog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxdialog1MouseClicked(evt);
            }
        });
        boxdialog1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelbox.setText("|");
        boxdialog1.add(labelbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jPanel7.add(boxdialog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 650, 100));

        Opsi1.setText("Opsi1");
        Opsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opsi1ActionPerformed(evt);
            }
        });
        jPanel7.add(Opsi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        Opsi2.setText("Opsi2");
        Opsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opsi2ActionPerformed(evt);
            }
        });
        jPanel7.add(Opsi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        Stage.addTab("npc", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel5.setText("YOU LOSE");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 51, -1, -1));

        Deadmessage.setText("dead");
        jPanel8.add(Deadmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 101, -1, -1));

        Restart_onkalah.setText("RESTART");
        jPanel8.add(Restart_onkalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, -1));

        MainMenu_onkalah.setText("MAIN MENU");
        jPanel8.add(MainMenu_onkalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        labelScoreLose.setText("Score:");
        jPanel8.add(labelScoreLose, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        Stage.addTab("lose", jPanel8);

        getContentPane().add(Stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Timer(){
        
         // error still
    }
    private void Attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack_buttonActionPerformed
        
    }//GEN-LAST:event_Attack_buttonActionPerformed

    private void StageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_StageStateChanged

    }//GEN-LAST:event_StageStateChanged

    private void Opsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opsi2ActionPerformed

    }//GEN-LAST:event_Opsi2ActionPerformed

    private void Opsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opsi1ActionPerformed

    }//GEN-LAST:event_Opsi1ActionPerformed

    private void boxdialog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxdialog1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boxdialog1MouseClicked

    private void NoclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoclassActionPerformed

    }//GEN-LAST:event_NoclassActionPerformed

    private void YesclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesclassActionPerformed
        // TODO add your handling code here:

        // error still
    }//GEN-LAST:event_YesclassActionPerformed

    private void winorloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_winorloseMouseClicked
        // TODO add your handling code here:
        /*Timer timer = new Timer(3000, new ActionListener() { // Delay 3 detik (3000 milidetik)
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                winorlose.setVisible(false);
                alur.run();
                if (alur.getCurrentInteraction() < alur.getMAX_INTERACTIONS() ){
                    if (alur.isBattle() == true){
                        Stage.setSelectedIndex(3);
                        Stage.setSelectedIndex(2);
                    }else{
                        Stage.setSelectedIndex(3);
                        Stage.setSelectedIndex(5);
                    }
                }else{
                    Stage.setSelectedIndex(3);
                }
                alur.setCurrentInteraction(alur.getCurrentInteraction() + 1);
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
        // error still
        */

    }//GEN-LAST:event_winorloseMouseClicked

    private void HPMusuhStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HPMusuhStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_HPMusuhStateChanged

    private void button_archerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_archerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_archerActionPerformed

    private void button_necromancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_necromancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_necromancerActionPerformed

    private void button_guardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_guardianActionPerformed

    private void button_assasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_assasinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_assasinActionPerformed

    private void GetNamePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNamePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetNamePlayerActionPerformed

    private void OkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkbuttonActionPerformed

    }//GEN-LAST:event_OkbuttonActionPerformed

    private void MainMenu_onmenangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_onmenangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainMenu_onmenangActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attack_button;
    private javax.swing.JLabel ChoosenClass;
    private javax.swing.JLabel ClassQ;
    private javax.swing.JLabel Deadmessage;
    private javax.swing.JLabel EnemyLabel;
    private javax.swing.JTextField GetNamePlayer;
    private javax.swing.JProgressBar HPMusuh;
    private javax.swing.JButton MainMenu_onkalah;
    private javax.swing.JButton MainMenu_onmenang;
    private javax.swing.JLabel NamaPlayer;
    private javax.swing.JButton Noclass;
    private javax.swing.JButton Okbutton;
    private javax.swing.JButton Opsi1;
    private javax.swing.JButton Opsi2;
    private javax.swing.JLabel Player;
    private javax.swing.JButton Restart_onkalah;
    private javax.swing.JButton Restart_onmenang;
    private javax.swing.JTabbedPane Stage;
    private javax.swing.JLabel ValueAtk;
    private javax.swing.JLabel ValueDef;
    private javax.swing.JLabel ValueHP;
    private javax.swing.JButton Yesclass;
    private javax.swing.JLabel afterbattle;
    private javax.swing.JPanel boxdialog1;
    private javax.swing.JButton button_archer;
    private javax.swing.JButton button_assasin;
    private javax.swing.JButton button_guardian;
    private javax.swing.JButton button_necromancer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAtk;
    private javax.swing.JLabel labelDef;
    private javax.swing.JLabel labelHP;
    private javax.swing.JLabel labelScoreLose;
    private javax.swing.JLabel labelbox;
    private javax.swing.JList<String> listdamage;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JPanel winorlose;
    // End of variables declaration//GEN-END:variables



    public boolean isBattle() {
        return battle;
    }


    public void setBattle(boolean battle) {
        this.battle = battle;
    }


    public boolean isChooseClass() {
        return chooseClass;
    }


    public void setChooseClass(boolean chooseClass) {
        this.chooseClass = chooseClass;
    }


    public int getClassN() {
        return classN;
    }


    public void setClassN(int classN) {
        this.classN = classN;
    }


    public Stage getAlur() {
        return alur;
    }


    public void setAlur(Stage alur) {
        this.alur = alur;
    }


    public Equipment getEquipment() {
        return equipment;
    }


    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }


    public int getIdxDialogue() {
        return idxDialogue;
    }


    public void setIdxDialogue(int idxDialogue) {
        this.idxDialogue = idxDialogue;
    }


    public javax.swing.JButton getAttack_button() {
        return Attack_button;
    }


    public void setAttack_button(javax.swing.JButton Attack_button) {
        this.Attack_button = Attack_button;
    }


    public javax.swing.JLabel getChoosenClass() {
        return ChoosenClass;
    }


    public void setChoosenClass(javax.swing.JLabel ChoosenClass) {
        this.ChoosenClass = ChoosenClass;
    }


    public javax.swing.JLabel getClassQ() {
        return ClassQ;
    }


    public void setClassQ(javax.swing.JLabel ClassQ) {
        this.ClassQ = ClassQ;
    }


    public javax.swing.JLabel getEnemyLabel() {
        return EnemyLabel;
    }


    public void setEnemyLabel(javax.swing.JLabel EnemyLabel) {
        this.EnemyLabel = EnemyLabel;
    }


    public javax.swing.JTextField getGetNamePlayer() {
        return GetNamePlayer;
    }


    public void setGetNamePlayer(javax.swing.JTextField GetNamePlayer) {
        this.GetNamePlayer = GetNamePlayer;
    }


    public javax.swing.JProgressBar getHPMusuh() {
        return HPMusuh;
    }


    public void setHPMusuh(javax.swing.JProgressBar HPMusuh) {
        this.HPMusuh = HPMusuh;
    }


    public javax.swing.JLabel getNamaPlayer() {
        return NamaPlayer;
    }


    public void setNamaPlayer(javax.swing.JLabel NamaPlayer) {
        this.NamaPlayer = NamaPlayer;
    }


    public javax.swing.JButton getNoclass() {
        return Noclass;
    }


    public void setNoclass(javax.swing.JButton Noclass) {
        this.Noclass = Noclass;
    }


    public javax.swing.JButton getOkbutton() {
        return Okbutton;
    }


    public void setOkbutton(javax.swing.JButton Okbutton) {
        this.Okbutton = Okbutton;
    }


    public javax.swing.JButton getOpsi1() {
        return Opsi1;
    }


    public void setOpsi1(javax.swing.JButton Opsi1) {
        this.Opsi1 = Opsi1;
    }


    public javax.swing.JButton getOpsi2() {
        return Opsi2;
    }


    public void setOpsi2(javax.swing.JButton Opsi2) {
        this.Opsi2 = Opsi2;
    }


    public javax.swing.JLabel getPlayer() {
        return Player;
    }


    public void setPlayer(javax.swing.JLabel Player) {
        this.Player = Player;
    }


    public javax.swing.JTabbedPane getStage() {
        return Stage;
    }


    public void setStage(javax.swing.JTabbedPane Stage) {
        this.Stage = Stage;
    }


    public javax.swing.JLabel getValueAtk() {
        return ValueAtk;
    }


    public void setValueAtk(javax.swing.JLabel ValueAtk) {
        this.ValueAtk = ValueAtk;
    }


    public javax.swing.JLabel getValueDef() {
        return ValueDef;
    }


    public void setValueDef(javax.swing.JLabel ValueDef) {
        this.ValueDef = ValueDef;
    }


    public javax.swing.JLabel getValueHP() {
        return ValueHP;
    }


    public void setValueHP(javax.swing.JLabel ValueHP) {
        this.ValueHP = ValueHP;
    }


    public javax.swing.JButton getYesclass() {
        return Yesclass;
    }


    public void setYesclass(javax.swing.JButton Yesclass) {
        this.Yesclass = Yesclass;
    }


    public javax.swing.JLabel getAfterbattle() {
        return afterbattle;
    }


    public void setAfterbattle(javax.swing.JLabel afterbattle) {
        this.afterbattle = afterbattle;
    }


    public javax.swing.JPanel getBoxdialog1() {
        return boxdialog1;
    }


    public void setBoxdialog1(javax.swing.JPanel boxdialog1) {
        this.boxdialog1 = boxdialog1;
    }


    public javax.swing.JButton getButton_archer() {
        return button_archer;
    }


    public void setButton_archer(javax.swing.JButton button_archer) {
        this.button_archer = button_archer;
    }


    public javax.swing.JButton getButton_assasin() {
        return button_assasin;
    }


    public void setButton_assasin(javax.swing.JButton button_assasin) {
        this.button_assasin = button_assasin;
    }


    public javax.swing.JButton getButton_guardian() {
        return button_guardian;
    }


    public void setButton_guardian(javax.swing.JButton button_guardian) {
        this.button_guardian = button_guardian;
    }


    public javax.swing.JButton getButton_necromancer() {
        return button_necromancer;
    }


    public void setButton_necromancer(javax.swing.JButton button_necromancer) {
        this.button_necromancer = button_necromancer;
    }


    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }


    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }


    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }


    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }


    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }


    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }


    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }


    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }


    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }


    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }


    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }


    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }


    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }


    public void setjPanel3(javax.swing.JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }


    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }


    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }


    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }


    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }


    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }


    public void setjPanel6(javax.swing.JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }


    public javax.swing.JPanel getjPanel7() {
        return jPanel7;
    }


    public void setjPanel7(javax.swing.JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }


    public javax.swing.JLabel getLabelAtk() {
        return labelAtk;
    }


    public void setLabelAtk(javax.swing.JLabel labelAtk) {
        this.labelAtk = labelAtk;
    }


    public javax.swing.JLabel getLabelDef() {
        return labelDef;
    }


    public void setLabelDef(javax.swing.JLabel labelDef) {
        this.labelDef = labelDef;
    }


    public javax.swing.JLabel getLabelHP() {
        return labelHP;
    }


    public void setLabelHP(javax.swing.JLabel labelHP) {
        this.labelHP = labelHP;
    }


    public javax.swing.JLabel getLabelbox() {
        return labelbox;
    }


    public void setLabelbox(javax.swing.JLabel labelbox) {
        this.labelbox = labelbox;
    }


    public javax.swing.JPanel getWinorlose() {
        return winorlose;
    }


    public void setWinorlose(javax.swing.JPanel winorlose) {
        this.winorlose = winorlose;
    }

    public javax.swing.JList<String> getListdamage() {
        return listdamage;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public javax.swing.JLabel getDeadmessage() {
        return Deadmessage;
    }

    /**
     * @return the labelScoreLose
     */
    public javax.swing.JLabel getLabelScoreLose() {
        return labelScoreLose;
    }

    /**
     * @return the scoreLabel
     */
    public javax.swing.JLabel getScoreLabel() {
        return scoreLabel;
    }
}
