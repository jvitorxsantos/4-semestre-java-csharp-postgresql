/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.exerciciocalculadora;

/**
 *
 * @author Fatec
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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
        jLabel1 = new javax.swing.JLabel();
        n1_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        n2_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultado_txt = new javax.swing.JTextField();
        botao_soma = new javax.swing.JButton();
        botao_subtracao = new javax.swing.JButton();
        botao_multiplicacao = new javax.swing.JButton();
        botao_divisao = new javax.swing.JButton();
        botao_quadrado = new javax.swing.JButton();
        botao_cubo = new javax.swing.JButton();
        botao_limpar = new javax.swing.JButton();
        botao_raiz = new javax.swing.JButton();
        botao_fatoracao = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Primeiro Numero");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Segundo Numero");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Resultado:");

        resultado_txt.setEditable(false);
        resultado_txt.setBackground(new java.awt.Color(255, 255, 255));

        botao_soma.setBackground(new java.awt.Color(0, 204, 0));
        botao_soma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_soma.setText("+");
        botao_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_somaActionPerformed(evt);
            }
        });

        botao_subtracao.setBackground(new java.awt.Color(0, 204, 0));
        botao_subtracao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_subtracao.setText("-");
        botao_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_subtracaoActionPerformed(evt);
            }
        });

        botao_multiplicacao.setBackground(new java.awt.Color(0, 204, 0));
        botao_multiplicacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_multiplicacao.setText("*");
        botao_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_multiplicacaoActionPerformed(evt);
            }
        });

        botao_divisao.setBackground(new java.awt.Color(0, 204, 0));
        botao_divisao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_divisao.setText("/");
        botao_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_divisaoActionPerformed(evt);
            }
        });

        botao_quadrado.setBackground(new java.awt.Color(0, 204, 0));
        botao_quadrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_quadrado.setText("x²");
        botao_quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_quadradoActionPerformed(evt);
            }
        });

        botao_cubo.setBackground(new java.awt.Color(0, 204, 0));
        botao_cubo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_cubo.setText("x³");
        botao_cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cuboActionPerformed(evt);
            }
        });

        botao_limpar.setBackground(new java.awt.Color(0, 204, 0));
        botao_limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_limpar.setText("C");
        botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limparActionPerformed(evt);
            }
        });

        botao_raiz.setBackground(new java.awt.Color(0, 204, 0));
        botao_raiz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_raiz.setText("Sqrt");
        botao_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_raizActionPerformed(evt);
            }
        });

        botao_fatoracao.setBackground(new java.awt.Color(0, 204, 0));
        botao_fatoracao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botao_fatoracao.setText("n!");
        botao_fatoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fatoracaoActionPerformed(evt);
            }
        });

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n1_txt)
                            .addComponent(n2_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(resultado_txt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(btn_sair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_soma)
                                    .addComponent(botao_subtracao)
                                    .addComponent(botao_multiplicacao))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_divisao)
                                    .addComponent(botao_quadrado)
                                    .addComponent(botao_cubo))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_fatoracao)
                                    .addComponent(botao_raiz)
                                    .addComponent(botao_limpar))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_cubo, botao_divisao, botao_fatoracao, botao_limpar, botao_multiplicacao, botao_quadrado, botao_raiz, botao_soma, botao_subtracao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(n1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resultado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_soma)
                    .addComponent(botao_divisao)
                    .addComponent(botao_limpar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_subtracao)
                    .addComponent(botao_quadrado)
                    .addComponent(botao_raiz))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_multiplicacao)
                    .addComponent(botao_cubo)
                    .addComponent(botao_fatoracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btn_sair)
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_cubo, botao_divisao, botao_fatoracao, botao_limpar, botao_multiplicacao, botao_quadrado, botao_raiz, botao_soma, botao_subtracao});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_somaActionPerformed
        double n1, n2, resultado;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado = n1 + n2;
        resultado_txt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botao_somaActionPerformed

    private void botao_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_subtracaoActionPerformed
        double n1, n2, resultado;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado = n1 - n2;
        resultado_txt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botao_subtracaoActionPerformed

    private void botao_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_multiplicacaoActionPerformed
        double n1, n2, resultado;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado = n1 * n2;
        resultado_txt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botao_multiplicacaoActionPerformed

    private void botao_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_divisaoActionPerformed
        double n1, n2, resultado;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado = n1 / n2;
        resultado_txt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botao_divisaoActionPerformed

    private void botao_quadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_quadradoActionPerformed
        double n1, n2, resultado_1, resultado_2;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado_1 = n1 * n1;
        resultado_2 = n2 * n2;
        resultado_txt.setText(String.valueOf(resultado_1) + " e " + String.valueOf(resultado_2));
    }//GEN-LAST:event_botao_quadradoActionPerformed

    private void botao_cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cuboActionPerformed
        double n1, n2, resultado_1, resultado_2;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado_1 = n1 * n1 * n1;
        resultado_2 = n2 * n2 * n2;
        resultado_txt.setText(String.valueOf(resultado_1) + " e " + String.valueOf(resultado_2));
    }//GEN-LAST:event_botao_cuboActionPerformed

    private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limparActionPerformed
        n1_txt.setText("");
        n2_txt.setText("");
        resultado_txt.setText("");
    }//GEN-LAST:event_botao_limparActionPerformed

    private void botao_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_raizActionPerformed
        double n1, n2, resultado_1, resultado_2;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        resultado_1 = Math.sqrt(n1);
        resultado_2 = Math.sqrt(n2);
        resultado_txt.setText(String.valueOf(resultado_1) + " e " + String.valueOf(resultado_2));
    }//GEN-LAST:event_botao_raizActionPerformed

    private void botao_fatoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fatoracaoActionPerformed
        double n1, n2, resultado_1, resultado_2,fat_1, fat_2;
        n1 = Double.parseDouble(n1_txt.getText());
        n2 = Double.parseDouble(n2_txt.getText());
        fat_1 = n1;
        fat_2 = n2;
        
        while (n1>1){
            fat_1 = fat_1 * (n1-1);
            n1--;
        }
        resultado_1 = fat_1;
        
        while (n2>1){
            fat_2 = fat_2 * (n2-1);
            n2--;
        }
        resultado_2 = fat_2;
        resultado_txt.setText(String.valueOf(resultado_1) + " e " + String.valueOf(resultado_2));
    }//GEN-LAST:event_botao_fatoracaoActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cubo;
    private javax.swing.JButton botao_divisao;
    private javax.swing.JButton botao_fatoracao;
    private javax.swing.JButton botao_limpar;
    private javax.swing.JButton botao_multiplicacao;
    private javax.swing.JButton botao_quadrado;
    private javax.swing.JButton botao_raiz;
    private javax.swing.JButton botao_soma;
    private javax.swing.JButton botao_subtracao;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n1_txt;
    private javax.swing.JTextField n2_txt;
    private javax.swing.JTextField resultado_txt;
    // End of variables declaration//GEN-END:variables
}
