package threads;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        setTitle("Tela de time com thread");
        setLocationRelativeTo(null);
        setResizable(false);

        jBstop.setEnabled(false);
        jTFdata.setEnabled(false);
        jTFhora.setEnabled(false);
        jLrelogioTexto.setEnabled(false); 
    }
    //variavel para parar as threads
    boolean cancela = false;  
    
    private Runnable threadData = new Runnable() {
        @Override
        public void run() {
            while (!cancela) {//fica sempre rodando
                jTFdata.setText(new SimpleDateFormat("dd/MM/yyyy").
                        format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    
    private Runnable threadHora = new Runnable(){
        @Override
        public void run() {
            while (!cancela) {                
                jTFhora.setText(new SimpleDateFormat("hh:mm:ss").
                        format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private Thread data;
    private Thread hora;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBstart = new javax.swing.JButton();
        jBstop = new javax.swing.JButton();
        jTFdata = new javax.swing.JTextField();
        jTFhora = new javax.swing.JTextField();
        jLdata = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jLrelogioTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBstart.setText("START");
        jBstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBstartActionPerformed(evt);
            }
        });

        jBstop.setText("STOP");
        jBstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBstopActionPerformed(evt);
            }
        });

        jTFdata.setEditable(false);

        jTFhora.setEditable(false);

        jLdata.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLdata.setForeground(new java.awt.Color(0, 0, 0));
        jLdata.setText("Data atual");

        jLhora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLhora.setForeground(new java.awt.Color(0, 0, 0));
        jLhora.setText("Horário atual");

        jLrelogioTexto.setBackground(new java.awt.Color(255, 255, 255));
        jLrelogioTexto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLrelogioTexto.setForeground(new java.awt.Color(0, 0, 0));
        jLrelogioTexto.setText("Relógio parado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLrelogioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBstart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jBstop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLdata)
                                .addComponent(jTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLhora)
                                .addComponent(jTFhora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLrelogioTexto)
                .addGap(18, 18, 18)
                .addComponent(jLdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLhora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBstart)
                    .addComponent(jBstop))
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBstartActionPerformed
        cancela = false;
        jLrelogioTexto.setText("Relógio iniciado...");
        
        //iniciando as treads
        data = new Thread(threadData);
        data.start();
        hora = new Thread(threadHora);
        hora.start();
        
        //desabilitando/habilitando os botões e visores
        jBstart.setEnabled(false);
        jBstop.setEnabled(true);
        jTFdata.setEnabled(true);
        jTFhora.setEnabled(true);
        jLrelogioTexto.setEnabled(true);
    }//GEN-LAST:event_jBstartActionPerformed

    private void jBstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBstopActionPerformed
        cancela = true;
        jLrelogioTexto.setText("Relógio parado.");
        
        jBstop.setEnabled(false);
        jBstart.setEnabled(true);
        jLrelogioTexto.setEnabled(false);
    }//GEN-LAST:event_jBstopActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBstart;
    private javax.swing.JButton jBstop;
    private javax.swing.JLabel jLdata;
    private javax.swing.JLabel jLhora;
    private javax.swing.JLabel jLrelogioTexto;
    private javax.swing.JTextField jTFdata;
    private javax.swing.JTextField jTFhora;
    // End of variables declaration//GEN-END:variables
}
