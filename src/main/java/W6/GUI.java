/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package W6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author haika
 */
public class GUI extends javax.swing.JFrame {
    Player dafa;
    Enemy slime;
    boolean battle = false;
    boolean chooseClass = false;
    int classN;
    Stage alur = new Stage();
    Equipment equipment = new Equipment();
    NPC udin = new NPC(10,10,10);
    
    public GUI() {
        initComponents();
        NamaPlayer.setVisible(false);
        Attack_button.setVisible(false);
        udin.SetType();
        udin.SetDiag();
        winorlose.setVisible(false);
        gifatk.setVisible(false);
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
        gifatk = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ClassQ = new javax.swing.JLabel();
        ChoosenClass = new javax.swing.JLabel();
        Yesclass = new javax.swing.JButton();
        Noclass = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        boxdialog1 = new javax.swing.JPanel();
        labelbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
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
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Okbutton))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        Stage.addTab("tab1", jPanel2);

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

        button_archer.setText("Archer");

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
                .addContainerGap(317, Short.MAX_VALUE))
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
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Stage.addTab("tab2", jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(720, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HPMusuh.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
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

        gifatk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/W6/Image/Slash front remake.gif"))); // NOI18N
        jPanel4.add(gifatk, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        Stage.addTab("tab3", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        Stage.addTab("tab4", jPanel6);

        ClassQ.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        ClassQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClassQ.setText("APAKAH ANDA YAKIN AKAN MEMILIH CLASS");
        ClassQ.setMaximumSize(new java.awt.Dimension(200, 200));

        ChoosenClass.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        ChoosenClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoosenClass.setText("class");

        Yesclass.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Yesclass.setText("YA");
        Yesclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        Yesclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesclassActionPerformed(evt);
            }
        });

        Noclass.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        Noclass.setText("Tidak");
        Noclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        Noclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoclassActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(Class Tidak akan bisa berubah Di lain waktu)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(ClassQ, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(Yesclass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(Noclass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(ChoosenClass, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(ClassQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChoosenClass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Noclass)
                    .addComponent(Yesclass))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        Stage.addTab("tab5", jPanel5);

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

        Stage.addTab("tab6", jPanel7);

        getContentPane().add(Stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetNamePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNamePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetNamePlayerActionPerformed

    private void OkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkbuttonActionPerformed
        // TODO add your handling code here:
        if (!GetNamePlayer.getText().equals("")){
            String nama = GetNamePlayer.getText();
            dafa = new Player(nama, 200,100,100);
            NamaPlayer.setText(dafa.getNama());
            NamaPlayer.setVisible(true);
            ValueHP.setText(dafa.getHP() +"");
            ValueDef.setText(dafa.getDefense() + "");
            ValueAtk.setText(dafa.getAttack_point() + "");
            Stage.setSelectedIndex(1);
        }
        
    }//GEN-LAST:event_OkbuttonActionPerformed

    private void Attack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack_buttonActionPerformed
        dafa.attack(slime);
        gifatk.setVisible(true);
        HPMusuh.setValue(slime.getHP());
        slime.attack(dafa);
        ChangeHP();
        if (slime.getHP() < 0){
            alur.setBattle(false);
            dafa.setHP(dafa.getMaxHP());
            ChangeHP();
            Timer timer = new Timer(1000, new ActionListener() { // Delay 3 detik (3000 milidetik)
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                winorlose.setVisible(true);
                winorlose.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                afterbattle.setText("Anda Berhasil Mengalahkan Musuh");
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
            
//            Stage.setSelectedIndex(Stage.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_Attack_buttonActionPerformed

    private void StageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_StageStateChanged
        // TODO add your handling code here:
        if (Stage.getSelectedIndex() == 1){
            chooseClass = true;
        }
        if(Stage.getSelectedIndex() == 2){
            alur.setBattle(true);
        }
        if (alur.isBattle() == true){
            Attack_button.setVisible(true);
            slime = new Enemy("Slime", 200, 100, 100);
            HPMusuh.setMaximum(slime.getHP());
            HPMusuh.setValue(slime.getHP());
        }else{
            Attack_button.setVisible(false);
        }
        
        
    }//GEN-LAST:event_StageStateChanged

    private void button_assasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_assasinActionPerformed
        // TODO add your handling code here:
        classN =1;
        dafa.tipeClass(classN);
        ChoosenClass.setText(dafa.dapatkanClass());
        this.Stage.setSelectedIndex(4);
    }//GEN-LAST:event_button_assasinActionPerformed

    private void button_guardianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guardianActionPerformed
        // TODO add your handling code here:
        classN = 2;
        dafa.tipeClass(classN);
        ChoosenClass.setText(dafa.dapatkanClass());
        this.Stage.setSelectedIndex(4);
    }//GEN-LAST:event_button_guardianActionPerformed

    private void HPMusuhStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HPMusuhStateChanged
        // TODO add your handling code here:
        HPMusuh.setValue(slime.getHP());
    }//GEN-LAST:event_HPMusuhStateChanged

    private void YesclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesclassActionPerformed
        // TODO add your handling code here:
        equipment.EquipmentInit(dafa);
        equipment.EquipmentsetforClass(dafa);
        ChangeAttr();
        dafa.setMaxHP();
        Stage.setSelectedIndex(5);
    }//GEN-LAST:event_YesclassActionPerformed

    private void NoclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoclassActionPerformed
        Stage.setSelectedIndex(1);
    }//GEN-LAST:event_NoclassActionPerformed

    private void boxdialog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxdialog1MouseClicked
        // TODO add your handling code here:
        labelbox.setText("Proses selanjutnya...");
        Timer timer = new Timer(3000, new ActionListener() { // Delay 3 detik (3000 milidetik)
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                Stage.setSelectedIndex(2);
                alur.setBattle(true);
                winorlose.setVisible(false);
                labelbox.setText("|");
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
    }//GEN-LAST:event_boxdialog1MouseClicked

    private void winorloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_winorloseMouseClicked
        // TODO add your handling code here:
        Timer timer = new Timer(3000, new ActionListener() { // Delay 3 detik (3000 milidetik)
            public void actionPerformed(ActionEvent e) {
                // Proses yang akan dilakukan setelah delay
                Stage.setSelectedIndex(5);
            }
        });
        timer.setRepeats(false); // Setel agar timer hanya berjalan satu kali
        timer.start(); // Memulai timer
    }//GEN-LAST:event_winorloseMouseClicked
    public void ChangeAttr(){
        ChangeHP();
        ChangeDef();
        ChangeAtk();
    }
    public void ChangeHP(){
        ValueHP.setText(dafa.getHP() + "");
    }
    public void ChangeDef(){
        ValueDef.setText(dafa.getDefense() +"");
    }
    
    public void ChangeAtk(){
        ValueAtk.setText(dafa.getAttack_point() + "");
    }
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
    private javax.swing.JLabel EnemyLabel;
    private javax.swing.JTextField GetNamePlayer;
    private javax.swing.JProgressBar HPMusuh;
    private javax.swing.JLabel NamaPlayer;
    private javax.swing.JButton Noclass;
    private javax.swing.JButton Okbutton;
    private javax.swing.JLabel Player;
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
    private javax.swing.JLabel gifatk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelAtk;
    private javax.swing.JLabel labelDef;
    private javax.swing.JLabel labelHP;
    private javax.swing.JLabel labelbox;
    private javax.swing.JPanel winorlose;
    // End of variables declaration//GEN-END:variables
}
