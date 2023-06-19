package view;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.CalculationManager;
import consts.Const;
import utils.DialogManager;
import utils.FileManager;
import utils.PrimeManager;

public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jDialog4 = new javax.swing.JDialog();
        dialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaPlainText = new javax.swing.JTextArea();
        textFieldP = new javax.swing.JTextField();
        textFieldQ = new javax.swing.JTextField();
        textFieldE = new javax.swing.JTextField();
        textFieldD = new javax.swing.JTextField();
        buttonGenPQ = new javax.swing.JButton();
        buttonGenKey = new javax.swing.JButton();
        buttonEncode = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        textAreaCipherText = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaCipherText2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaPlainText2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        buttonDecode = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textFieldN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        buttonMove = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        buttonChoosePlainTextFile = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        buttonChooseCipherTextFile = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mã hóa RSA");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("GIẢI MÃ");

        jLabel2.setText("Bản rõ:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("SINH KHÓA");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("P");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("E");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Q");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("D");

        textAreaPlainText.setColumns(20);
        textAreaPlainText.setRows(5);
        jScrollPane5.setViewportView(textAreaPlainText);

        textFieldP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPActionPerformed(evt);
            }
        });

        textFieldQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQActionPerformed(evt);
            }
        });

        textFieldE.setEditable(false);
        textFieldE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEActionPerformed(evt);
            }
        });

        textFieldD.setEditable(false);
        textFieldD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDActionPerformed(evt);
            }
        });

        buttonGenPQ.setText("Sinh P, Q");
        buttonGenPQ.setToolTipText("");
        buttonGenPQ.setAutoscrolls(true);
        buttonGenPQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonGenPQ.setBorderPainted(false);
        buttonGenPQ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonGenPQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenPQActionPerformed(evt);
            }
        });

        buttonGenKey.setText("Tạo khóa");
        buttonGenKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenKeyActionPerformed(evt);
            }
        });

        buttonEncode.setText("Mã hóa");
        buttonEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEncodeActionPerformed(evt);
            }
        });

        textAreaCipherText.setEditable(false);
        textAreaCipherText.setColumns(20);
        textAreaCipherText.setRows(5);
        jScrollPane6.setViewportView(textAreaCipherText);

        jLabel8.setText("Bản mã:");

        textAreaCipherText2.setColumns(20);
        textAreaCipherText2.setRows(5);
        jScrollPane1.setViewportView(textAreaCipherText2);

        textAreaPlainText2.setEditable(false);
        textAreaPlainText2.setColumns(20);
        textAreaPlainText2.setRows(5);
        jScrollPane2.setViewportView(textAreaPlainText2);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("MÃ HÓA");

        buttonDecode.setText("Giải mã");
        buttonDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecodeActionPerformed(evt);
            }
        });

        jLabel10.setText("Bản mã:");

        jLabel11.setText("Bản rõ:");

        textFieldN.setEditable(false);
        textFieldN.setToolTipText("");
        textFieldN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("N");

        buttonMove.setText("Chuyển bản mã");
        buttonMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoveActionPerformed(evt);
            }
        });

        jLabel13.setText("Mã hóa:");

        buttonChoosePlainTextFile.setLabel("Chọn bản rõ");
        buttonChoosePlainTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChoosePlainTextFileActionPerformed(evt);
            }
        });

        buttonSave.setLabel("Lưu bản mã");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        jLabel14.setText("Giải mã:");

        buttonChooseCipherTextFile.setText("Chọn bản mã");
        buttonChooseCipherTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChooseCipherTextFileActionPerformed(evt);
            }
        });

        buttonClear.setText("Reset");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel3)
                .addGap(310, 310, 310)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(9, 9, 9)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldQ, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(textFieldN, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(textFieldE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(textFieldD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonGenPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonGenKey, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(textFieldP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonEncode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonChoosePlainTextFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonDecode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonMove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonChooseCipherTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(buttonClear)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFieldQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textFieldE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonGenPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGenKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonChoosePlainTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(buttonEncode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSave)
                                        .addGap(30, 30, 30)
                                        .addComponent(buttonChooseCipherTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(buttonMove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)))))
                .addGap(26, 26, 26)
                .addComponent(buttonClear)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPActionPerformed
        
    }//GEN-LAST:event_textFieldPActionPerformed

    private void textFieldQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQActionPerformed
        
    }//GEN-LAST:event_textFieldQActionPerformed

    private void buttonGenPQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenPQActionPerformed
        BigInteger min = Const.MIN_N;
        BigInteger max = Const.MAX_N;

        BigInteger p = PrimeManager.getRandomPrime(min, max);
        BigInteger q = PrimeManager.getRandomPrime(min, max);
        while (p.equals(q)) {
            q = PrimeManager.getRandomPrime(min, max);
        }
        
        textFieldP.setText(p.toString());
        textFieldQ.setText(q.toString());
        textFieldE.setText("");
        textFieldD.setText("");
        textFieldN.setText("");
    }//GEN-LAST:event_buttonGenPQActionPerformed

    private void buttonGenKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenKeyActionPerformed
        if (textFieldP.getText().isEmpty() || textFieldQ.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng tạo P và Q!", jFrame1);
            return;
        }

        try {
            BigInteger p = new BigInteger(textFieldP.getText());
            BigInteger q = new BigInteger(textFieldQ.getText());
            
            if (!PrimeManager.isPrime(p) || !PrimeManager.isPrime(q)) {
                DialogManager.show("Thông báo", "P hoặc Q không phải là số nguyên tố!", jFrame1);
                return;
            }
            
            if (p.equals(q)) {
                DialogManager.show("Thông báo", "P phải khác Q!", jFrame1);
                return;
            }
            
            BigInteger n = p.multiply(q);
            BigInteger phi = CalculationManager.getEulerPhi(p, q);
            BigInteger e = PrimeManager.getCoprime(phi);
            BigInteger d = CalculationManager.inverseModulo(e, phi);

            textFieldN.setText(n.toString());
            textFieldE.setText(e.toString());
            textFieldD.setText(d.toString());
        }
        catch (NumberFormatException e) {
            DialogManager.show("Thông báo", "P hoặc Q không hợp lệ!", jFrame1);
        }
    }//GEN-LAST:event_buttonGenKeyActionPerformed

    private void buttonEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEncodeActionPerformed
        if (textFieldE.getText().isEmpty() && textFieldN.getText().isEmpty() && textAreaPlainText.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng nhập bản rõ và tạo khóa!", jFrame1);
            return;
        }
        
        if (textFieldE.getText().isEmpty() || textFieldN.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng tạo khóa!", jFrame1);
            return;
        }
        
        if (textAreaPlainText.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng nhập bản rõ!", jFrame1);
            return;
        }
        
        BigInteger n = new BigInteger(textFieldN.getText());
        BigInteger e = new BigInteger(textFieldE.getText());
        
        String plainText = textAreaPlainText.getText();
        String codeText = "";
        for (int i = 0; i < plainText.length(); i++) {
            Long m = (long) plainText.charAt(i);
            BigInteger bigM = new BigInteger(Long.toString(m));
            BigInteger c = CalculationManager.binPow(bigM, e, n);
            codeText += c.toString() + " ";
        }
        
        textAreaCipherText.setText(codeText);
    }//GEN-LAST:event_buttonEncodeActionPerformed

    private void textFieldEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEActionPerformed
        
    }//GEN-LAST:event_textFieldEActionPerformed

    private void textFieldDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDActionPerformed
        
    }//GEN-LAST:event_textFieldDActionPerformed

    private void buttonDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecodeActionPerformed
        if (textAreaCipherText2.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng chọn hoặc chuyển bản mã!", jFrame1);
            return;
        }
        
        if (textFieldD.getText().isEmpty() || textFieldN.getText().isEmpty()) {
            DialogManager.show("Thông báo", "Vui lòng tạo khóa!", jFrame1);
            return;
        }
        
        BigInteger n = new BigInteger(textFieldN.getText());
        BigInteger d = new BigInteger(textFieldD.getText());
        String cipherText = textAreaCipherText2.getText();
        String plainText = "";
        
        String[] s = cipherText.split(" ");
        ArrayList<String> ciphers = new ArrayList<>();
        for (String item : s) {
            if (!"".equals(item)) {
                ciphers.add(item);
            }
        }
        
        for (int i = 0; i < ciphers.size(); i++) {
            try {
                BigInteger c = new BigInteger(ciphers.get(i));
                BigInteger m = CalculationManager.binPow(c, d, n);
            
                plainText += String.valueOf((char)m.longValue());
            }
            catch(NumberFormatException e) {
                DialogManager.show("Thông báo", "Bản mã không hợp lệ!", jFrame1);
                return;
            } 
        }
        
        textAreaPlainText2.setText(plainText);
        if (!textAreaPlainText.getText().equals(plainText)) {
            DialogManager.show("Thông báo", "Bản mã sai hoặc đã bị chỉnh sửa!", jFrame1);
        }
        else {
            DialogManager.show("Thông báo", "Giải mã thành công!", jFrame1);
        }
    }//GEN-LAST:event_buttonDecodeActionPerformed

    private void textFieldNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNActionPerformed

    private void buttonMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoveActionPerformed
        if (textAreaCipherText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jFrame1,
                "Vui lòng tạo bản mã!",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String cipherText = textAreaCipherText.getText();
        textAreaCipherText2.setText(cipherText);
    }//GEN-LAST:event_buttonMoveActionPerformed

    private void buttonChoosePlainTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChoosePlainTextFileActionPerformed
        String path = FileManager.chooseFile();
        if (path != null) {
            try {
                String extend = FileManager.getExtendPart(path);
                String plainText = "";
                if (extend.equals(".txt")) {
                    plainText = FileManager.scanTxt(path);
                }
                else if (extend.equals(".docx")) {
                    plainText = FileManager.scanDocx(path);
                }
                textAreaPlainText.setText(plainText);
            } catch (Exception ex) {
                DialogManager.show("Thông báo", "Không tồn tại file!" , jFrame1);
            }
        }
    }//GEN-LAST:event_buttonChoosePlainTextFileActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        try {
            if (textAreaCipherText.getText().isEmpty()) {
                DialogManager.show("Thông báo", "Bản mã trống!", jFrame1);
                return;
            }
            
            String path = FileManager.chooseFile();
            String extend = FileManager.getExtendPart(path);
            if (extend.equals(".txt")) {
                FileManager.writeTxt(textAreaCipherText.getText(), path);
            }
            else if (extend.equals(".docx")) {
                FileManager.writeDocx(textAreaCipherText.getText(), path);
            }           
            DialogManager.show("Thông báo", "Lưu thành công!", jFrame1);
        } catch (Exception ex) {
            DialogManager.show("Thông báo", "Lưu thất bại!", jFrame1);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonChooseCipherTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChooseCipherTextFileActionPerformed
        String path = FileManager.chooseFile();
        if (path != null) {
            try {
                String extend = FileManager.getExtendPart(path);
                String plainText = "";
                if (extend.equals(".txt")) {
                    plainText = FileManager.scanTxt(path);
                }
                else if (extend.equals(".docx")) {
                    plainText = FileManager.scanDocx(path);
                }
                textAreaCipherText2.setText(plainText);
            } catch (Exception ex) {
                DialogManager.show("Thông báo", "Không tồn tại file!" , jFrame1);
            }
        }
    }//GEN-LAST:event_buttonChooseCipherTextFileActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textFieldP.setText("");
        textFieldQ.setText("");
        textFieldN.setText("");
        textFieldE.setText("");
        textFieldD.setText("");
        textAreaCipherText.setText("");
        textAreaPlainText.setText("");
        textAreaCipherText2.setText("");
        textAreaPlainText2.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChooseCipherTextFile;
    private javax.swing.JButton buttonChoosePlainTextFile;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDecode;
    private javax.swing.JButton buttonEncode;
    private javax.swing.JButton buttonGenKey;
    private javax.swing.JButton buttonGenPQ;
    private javax.swing.JButton buttonMove;
    private javax.swing.JButton buttonSave;
    private javax.swing.JDialog dialog;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea textAreaCipherText;
    private javax.swing.JTextArea textAreaCipherText2;
    private javax.swing.JTextArea textAreaPlainText;
    private javax.swing.JTextArea textAreaPlainText2;
    private javax.swing.JTextField textFieldD;
    private javax.swing.JTextField textFieldE;
    private javax.swing.JTextField textFieldN;
    private javax.swing.JTextField textFieldP;
    private javax.swing.JTextField textFieldQ;
    // End of variables declaration//GEN-END:variables
}
