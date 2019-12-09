/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20181041110008
 */
public class paciente extends javax.swing.JDialog {

    public int ind;
    
    public paciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        if (TelaLogin.CPFs.contains(TelaLogin.cpfLogin)) {
            ind = TelaLogin.CPFs.indexOf(TelaLogin.cpfLogin);
        }
        
        nomeTelaInicialPac.setText(TelaLogin.nomePaciente.get(ind).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        Opções = new javax.swing.JLabel();
        solAgend = new javax.swing.JButton();
        VisConsulta = new javax.swing.JButton();
        resConsulta = new javax.swing.JButton();
        verMen = new javax.swing.JButton();
        painelCab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeTelaInicialPac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(662, 517));
        setResizable(false);

        Painel.setBackground(new java.awt.Color(255, 255, 255));
        Painel.setPreferredSize(new java.awt.Dimension(662, 517));

        Opções.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Opções.setText("Você deseja:");

        solAgend.setBackground(new java.awt.Color(255, 102, 102));
        solAgend.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        solAgend.setText("Solicitar agendamento de consulta");
        solAgend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solAgendActionPerformed(evt);
            }
        });

        VisConsulta.setBackground(new java.awt.Color(255, 102, 102));
        VisConsulta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        VisConsulta.setText("Visualizar consultas agendadas");
        VisConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisConsultaActionPerformed(evt);
            }
        });

        resConsulta.setBackground(new java.awt.Color(255, 102, 102));
        resConsulta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        resConsulta.setText("Visualizar resutado de uma consulta");
        resConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resConsultaActionPerformed(evt);
            }
        });

        verMen.setBackground(new java.awt.Color(255, 102, 102));
        verMen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        verMen.setText("Visualizar mensagens de consultas");
        verMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Opções))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VisConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(solAgend, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(resConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(verMen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Opções)
                .addGap(18, 18, 18)
                .addComponent(solAgend)
                .addGap(18, 18, 18)
                .addComponent(VisConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resConsulta)
                .addGap(18, 18, 18)
                .addComponent(verMen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        painelCab.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seja bem-vindo,");

        nomeTelaInicialPac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeTelaInicialPac.setText("jLabel1");

        javax.swing.GroupLayout painelCabLayout = new javax.swing.GroupLayout(painelCab);
        painelCab.setLayout(painelCabLayout);
        painelCabLayout.setHorizontalGroup(
            painelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTelaInicialPac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCabLayout.setVerticalGroup(
            painelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTelaInicialPac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addComponent(painelCab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelCab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void solAgendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solAgendActionPerformed
        agenConsulta a = new agenConsulta(null, false);
        a.setVisible(true);
    }//GEN-LAST:event_solAgendActionPerformed

    private void VisConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisConsultaActionPerformed
        VisConsulta v = new VisConsulta (null, false);
        v.setVisible(true);
    }//GEN-LAST:event_VisConsultaActionPerformed

    private void resConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resConsultaActionPerformed
    resConsulta r = new resConsulta (null, false);
   r.setVisible(true);
    }//GEN-LAST:event_resConsultaActionPerformed

    private void verMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMenActionPerformed
        msgPaciente mp = new msgPaciente(null, false);
        mp.setVisible(true);
    }//GEN-LAST:event_verMenActionPerformed

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
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                paciente dialog = new paciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Opções;
    private javax.swing.JPanel Painel;
    private javax.swing.JButton VisConsulta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeTelaInicialPac;
    private javax.swing.JPanel painelCab;
    private javax.swing.JButton resConsulta;
    private javax.swing.JButton solAgend;
    private javax.swing.JButton verMen;
    // End of variables declaration//GEN-END:variables
}
