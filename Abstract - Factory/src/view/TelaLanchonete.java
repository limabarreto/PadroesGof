/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import abstracts.Bebida;
import factory.FactoryCha;
import factory.FactoryCafe;
import factory.FactoryCappuccino;
import factory.FactoryChocolate;
import interfaces.FactoryBebidas;
import javax.swing.JOptionPane;

/**
 *
 * @author MATHEUS LIMA
 */
public class TelaLanchonete extends javax.swing.JFrame {

    /**
     * Creates new form TelaLanchonete
     */
    public TelaLanchonete() {
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
        lblLanchonete = new javax.swing.JLabel();
        btnCha = new javax.swing.JButton();
        btnChocolate = new javax.swing.JButton();
        btnCafe = new javax.swing.JButton();
        btnCappucino = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblLanchonete.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        lblLanchonete.setForeground(new java.awt.Color(255, 204, 204));
        lblLanchonete.setText("Lanchonete");

        btnCha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-café-100.png"))); // NOI18N
        btnCha.setToolTipText("Chá");
        btnCha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChaActionPerformed(evt);
            }
        });

        btnChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-iced-coffee-100.png"))); // NOI18N
        btnChocolate.setToolTipText("Chocolate");
        btnChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChocolateActionPerformed(evt);
            }
        });

        btnCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-café-para-viagem-100.png"))); // NOI18N
        btnCafe.setToolTipText("Café");
        btnCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeActionPerformed(evt);
            }
        });

        btnCappucino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-milk-shake-100.png"))); // NOI18N
        btnCappucino.setToolTipText("Cappuccino");
        btnCappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCappucinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(btnCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblLanchonete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblLanchonete)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChaActionPerformed
        // botão para chamar a tela cha
        FactoryBebidas factory = new FactoryCha();

        Object[] items = {"Gelado", "Quente"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item ", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                items, items[0]);

        if (selectedValue.equals(items[0])) {
            Bebida cold = factory.coldBebida();
            TelaBebidas tela = new TelaBebidas(
                    cold.getNome(),
                    cold.getDescricao(),
                    cold.getIngredientes(),
                    cold.getPreco()
            );
            tela.setVisible(true);
            this.dispose();

        } else if (selectedValue.equals(items[1])) {
            Bebida hot = factory.hotBebida();
            TelaBebidas tela = new TelaBebidas(
                    hot.getNome(),
                    hot.getDescricao(),
                    hot.getIngredientes(),
                    hot.getPreco()
            );
            tela.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_btnChaActionPerformed

    private void btnChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChocolateActionPerformed
        // botão para chamar a tela cha
        FactoryBebidas factory = new FactoryChocolate();

        Object[] items = {"Gelado", "Quente"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item ", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                items, items[0]);

        if (selectedValue.equals(items[0])) {
            Bebida cold = factory.coldBebida();
            TelaBebidas tela = new TelaBebidas(
                    cold.getNome(),
                    cold.getDescricao(),
                    cold.getIngredientes(),
                    cold.getPreco()
            );
            tela.setVisible(true);
            this.dispose();

        } else if (selectedValue.equals(items[1])) {
            Bebida hot = factory.hotBebida();
            TelaBebidas tela = new TelaBebidas(
                    hot.getNome(),
                    hot.getDescricao(),
                    hot.getIngredientes(),
                    hot.getPreco()
            );
            tela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnChocolateActionPerformed

    private void btnCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeActionPerformed
        // botão para chamar a tela cha
        FactoryBebidas factory = new FactoryCafe();

        Object[] items = {"Gelado", "Quente"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item ", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                items, items[0]);

        if (selectedValue.equals(items[0])) {
            Bebida cold = factory.coldBebida();
            TelaBebidas tela = new TelaBebidas(
                    cold.getNome(),
                    cold.getDescricao(),
                    cold.getIngredientes(),
                    cold.getPreco()
            );
            tela.setVisible(true);
            this.dispose();

        } else if (selectedValue.equals(items[1])) {
            Bebida hot = factory.hotBebida();
            TelaBebidas tela = new TelaBebidas(
                    hot.getNome(),
                    hot.getDescricao(),
                    hot.getIngredientes(),
                    hot.getPreco()
            );
            tela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCafeActionPerformed

    private void btnCappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCappucinoActionPerformed
        // botão para chamar a tela cha
        FactoryBebidas factory = new FactoryCappuccino();

        Object[] items = {"Gelado", "Quente"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item ", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                items, items[0]);

        if (selectedValue.equals(items[0])) {
            Bebida cold = factory.coldBebida();
            TelaBebidas tela = new TelaBebidas(
                    cold.getNome(),
                    cold.getDescricao(),
                    cold.getIngredientes(),
                    cold.getPreco()
            );
            tela.setVisible(true);
            this.dispose();

        } else if (selectedValue.equals(items[1])) {
            Bebida hot = factory.hotBebida();
            TelaBebidas tela = new TelaBebidas(
                    hot.getNome(),
                    hot.getDescricao(),
                    hot.getIngredientes(),
                    hot.getPreco()
            );
            tela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCappucinoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLanchonete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLanchonete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLanchonete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLanchonete.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLanchonete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCafe;
    private javax.swing.JButton btnCappucino;
    private javax.swing.JButton btnCha;
    private javax.swing.JButton btnChocolate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLanchonete;
    // End of variables declaration//GEN-END:variables

}
