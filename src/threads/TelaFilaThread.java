package threads;

public class TelaFilaThread extends javax.swing.JFrame {

    public TelaFilaThread() {
        initComponents();
        setTitle("Tela Fila e pilha com thread");
        setLocationRelativeTo(null);
        setResizable(false);
        
        fila.start();//inicia a Thread ImplementacaoFilaThread
        
        jLerroNome.setVisible(false);
        jLerroEmail.setVisible(false);
    }
    int contadorCliques = 0;
    
    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnome = new javax.swing.JLabel();
        jTFnome = new javax.swing.JTextField();
        jLemail = new javax.swing.JLabel();
        jTFemail = new javax.swing.JTextField();
        jBgerar = new javax.swing.JButton();
        jBstop = new javax.swing.JButton();
        jLerroNome = new javax.swing.JLabel();
        jLerroEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 240));
        setPreferredSize(new java.awt.Dimension(300, 340));

        jLnome.setText("Nome");

        jLemail.setText("E-mail");

        jBgerar.setText("Gerar");
        jBgerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgerarActionPerformed(evt);
            }
        });

        jBstop.setText("Stop");
        jBstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBstopActionPerformed(evt);
            }
        });

        jLerroNome.setForeground(new java.awt.Color(255, 0, 0));
        jLerroNome.setText("Digite o nome");

        jLerroEmail.setForeground(new java.awt.Color(255, 0, 0));
        jLerroEmail.setText("Digite o email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLemail)
                    .addComponent(jLnome)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBgerar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(jBstop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTFemail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFnome, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLerroNome)
                            .addComponent(jLerroEmail))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLerroNome)
                .addGap(18, 18, 18)
                .addComponent(jLemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerroEmail)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBgerar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBstop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBgerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgerarActionPerformed
        if (fila == null) {
            fila = new ImplementacaoFilaThread();
            fila.start();
        }
        for (int i = 0; i < 10; i++) {
            if (!jTFnome.getText().equals("")) {
            if (!jTFemail.getText().equals("")) {
               String nome = jTFnome.getText();
               String email = jTFemail.getText();
                      
                //criando o objeto
                ObjetoFilaThread filaThread = new ObjetoFilaThread(i+" - "+nome, email);
                //adicionando na lista
                fila.add(filaThread);
                
                contadorCliques++;
            }else{
                jLerroEmail.setVisible(true);     
            }
        }else{
            jLerroNome.setVisible(true);
        }
        }
    }//GEN-LAST:event_jBgerarActionPerformed

    private void jBstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBstopActionPerformed
   
        fila = null;
        
    }//GEN-LAST:event_jBstopActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFilaThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFilaThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFilaThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFilaThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilaThread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBgerar;
    private javax.swing.JButton jBstop;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLerroEmail;
    private javax.swing.JLabel jLerroNome;
    private javax.swing.JLabel jLnome;
    private javax.swing.JTextField jTFemail;
    private javax.swing.JTextField jTFnome;
    // End of variables declaration//GEN-END:variables
}
