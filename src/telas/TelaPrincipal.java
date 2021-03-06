
package telas;

import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
           //bloqueia o maximizar da janela
        this.setResizable(false);
        //inicia a janela no meio da tela
        this.setLocationRelativeTo(null);
        setTitle("Tela principal");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtTelaGenerosPreferidos = new javax.swing.JToggleButton();
        BtTelaAvaliarMusicas = new javax.swing.JToggleButton();
        BtTelaRecomendacoes = new javax.swing.JToggleButton();
        BtSairPrograma = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtTelaGenerosPreferidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtTelaGenerosPreferidos.setText("Meus gêneros preferidos");
        BtTelaGenerosPreferidos.setToolTipText("Meus gêneros");
        BtTelaGenerosPreferidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtTelaGenerosPreferidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTelaGenerosPreferidosActionPerformed(evt);
            }
        });

        BtTelaAvaliarMusicas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtTelaAvaliarMusicas.setText("Avaliar músicas");
        BtTelaAvaliarMusicas.setToolTipText("Avaliar");
        BtTelaAvaliarMusicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtTelaAvaliarMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTelaAvaliarMusicasActionPerformed(evt);
            }
        });

        BtTelaRecomendacoes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtTelaRecomendacoes.setText("Quero recomendações!");
        BtTelaRecomendacoes.setToolTipText("recomendações");
        BtTelaRecomendacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtTelaRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTelaRecomendacoesActionPerformed(evt);
            }
        });

        BtSairPrograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtSairPrograma.setText("Sair");
        BtSairPrograma.setToolTipText("Sair da aplicação");
        BtSairPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtSairPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairProgramaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("       Bem vindo ao sistema de recomendação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(BtTelaGenerosPreferidos)
                            .addComponent(BtTelaAvaliarMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtTelaRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtSairPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtTelaGenerosPreferidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BtTelaAvaliarMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtTelaRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtSairPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtTelaGenerosPreferidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTelaGenerosPreferidosActionPerformed
        new TelaGenerosPreferidos().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BtTelaGenerosPreferidosActionPerformed

    private void BtTelaAvaliarMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTelaAvaliarMusicasActionPerformed
        //abre tela Avaliar Musicas
        new TelaAvaliarMusicas().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtTelaAvaliarMusicasActionPerformed

    private void BtSairProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairProgramaActionPerformed
       int sair=JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
       if(sair==JOptionPane.YES_OPTION){
       System.exit(0);
    }//GEN-LAST:event_BtSairProgramaActionPerformed
    }
    private void BtTelaRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTelaRecomendacoesActionPerformed
        //abre tela Recomendações
        new TelaRecomendacoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtTelaRecomendacoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtSairPrograma;
    private javax.swing.JToggleButton BtTelaAvaliarMusicas;
    private javax.swing.JToggleButton BtTelaGenerosPreferidos;
    private javax.swing.JToggleButton BtTelaRecomendacoes;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
