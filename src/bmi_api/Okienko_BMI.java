package bmi_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Okienko_BMI extends javax.swing.JFrame {
//dopisanie komentarza 
    BMI WspolczynnikBMI = new BMI(0, 0, 0);

    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat czasFormat = new SimpleDateFormat("HH:mm:ss");

    String wynikBMI_text;
    String godzinaPomiaru;
    String dzienPomniaru;

    public Okienko_BMI() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1_Tytul = new javax.swing.JLabel();
        jPanel_ObliczanieBMI = new javax.swing.JPanel();
        jLabel_Wzrost = new javax.swing.JLabel();
        jLabel_Waga = new javax.swing.JLabel();
        jTextField_Wzrost = new javax.swing.JTextField();
        jTextField_Waga = new javax.swing.JTextField();
        jTextField_WynikBMI = new javax.swing.JTextField();
        jButton_ObliczBMI = new javax.swing.JButton();
        jButton_ExportDoExela = new javax.swing.JButton();
        jButton_WyswietlZalecenia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_InterpretacjaWyniku = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator BMI");
        setBackground(new java.awt.Color(239, 66, 66));
        setForeground(java.awt.Color.orange);
        setLocation(new java.awt.Point(400, 100));

        jLabel1_Tytul.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel1_Tytul.setText("Współczynnik BMI");

        jPanel_ObliczanieBMI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_Wzrost.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel_Wzrost.setText("Wzrost");

        jLabel_Waga.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel_Waga.setText("Waga");

        jButton_ObliczBMI.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jButton_ObliczBMI.setText("Oblicz");
        jButton_ObliczBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ObliczBMIActionPerformed(evt);
            }
        });

        jButton_ExportDoExela.setText("Export ");
        jButton_ExportDoExela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExportDoExelaActionPerformed(evt);
            }
        });

        jButton_WyswietlZalecenia.setText("Wyświetl zalecenia");
        jButton_WyswietlZalecenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WyswietlZaleceniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ObliczanieBMILayout = new javax.swing.GroupLayout(jPanel_ObliczanieBMI);
        jPanel_ObliczanieBMI.setLayout(jPanel_ObliczanieBMILayout);
        jPanel_ObliczanieBMILayout.setHorizontalGroup(
            jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                                .addComponent(jButton_ObliczBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ObliczanieBMILayout.createSequentialGroup()
                                .addComponent(jTextField_WynikBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addComponent(jButton_WyswietlZalecenia))
                    .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Wzrost)
                            .addComponent(jLabel_Wzrost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_Waga)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jTextField_Waga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_ExportDoExela, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ObliczanieBMILayout.setVerticalGroup(
            jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Wzrost)
                    .addComponent(jLabel_Waga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_ObliczanieBMILayout.createSequentialGroup()
                        .addGroup(jPanel_ObliczanieBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Wzrost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Waga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_ExportDoExela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ObliczBMI))
                    .addComponent(jButton_WyswietlZalecenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_WynikBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jLabel1.setText("Zalecenia ");

        jTextArea_InterpretacjaWyniku.setColumns(20);
        jTextArea_InterpretacjaWyniku.setRows(5);
        jScrollPane2.setViewportView(jTextArea_InterpretacjaWyniku);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1_Tytul, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_ObliczanieBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_Tytul, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_ObliczanieBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExportDoExelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExportDoExelaActionPerformed

        Exel_1 ZapisOdczyt = new Exel_1();

        godzinaPomiaru = czasFormat.format(calendar.getTime());
        dzienPomniaru = dataFormat.format(calendar.getTime());
        wynikBMI_text = String.valueOf(WspolczynnikBMI.getBmi());

        ZapisOdczyt.ZapiszDaneDoExela(dzienPomniaru, godzinaPomiaru, WspolczynnikBMI.getWaga(), WspolczynnikBMI.getBmi());

    }//GEN-LAST:event_jButton_ExportDoExelaActionPerformed

    private void jButton_ObliczBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ObliczBMIActionPerformed

        WspolczynnikBMI.setWaga(Double.parseDouble(jTextField_Waga.getText()));
        WspolczynnikBMI.setWzrost(Double.parseDouble(jTextField_Wzrost.getText()));

        try {
            WspolczynnikBMI.ObliczBMI(Double.parseDouble(jTextField_Waga.getText()), Double.parseDouble(jTextField_Wzrost.getText()));
        } catch (NumberFormatException wyjatek1) {
            String bledneDane = wyjatek1.getMessage();
            JOptionPane.showMessageDialog(this.rootPane, "Wpisany przez Ciebie tekst w jednym z okienek nie jest liczbą : " + bledneDane.replace("For input string: ", ""), "Bląd", JOptionPane.ERROR_MESSAGE);
        }

        jTextField_WynikBMI.setText(String.valueOf(WspolczynnikBMI.getBmi()));

    }//GEN-LAST:event_jButton_ObliczBMIActionPerformed

    private void jButton_WyswietlZaleceniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WyswietlZaleceniaActionPerformed
        // TODO add your handling code here      
        jTextArea_InterpretacjaWyniku.setText(WspolczynnikBMI.DokonajInterpretacjiWyniku());
    }//GEN-LAST:event_jButton_WyswietlZaleceniaActionPerformed

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
            java.util.logging.Logger.getLogger(Okienko_BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okienko_BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okienko_BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okienko_BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okienko_BMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ExportDoExela;
    private javax.swing.JButton jButton_ObliczBMI;
    private javax.swing.JButton jButton_WyswietlZalecenia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Tytul;
    private javax.swing.JLabel jLabel_Waga;
    private javax.swing.JLabel jLabel_Wzrost;
    private javax.swing.JPanel jPanel_ObliczanieBMI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_InterpretacjaWyniku;
    private javax.swing.JTextField jTextField_Waga;
    private javax.swing.JTextField jTextField_WynikBMI;
    private javax.swing.JTextField jTextField_Wzrost;
    // End of variables declaration//GEN-END:variables
}
