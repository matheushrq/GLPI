/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author mathe
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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
        jlUsuario = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlRepitaSenha = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlApelido = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JTextField();
        jtfRepitaSenha = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfApelido = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jbGravar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlNovo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlUsuario.setText("Usuário:");

        jlSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlSenha.setText("Senha:");

        jlRepitaSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlRepitaSenha.setText("Repita Senha:");

        jlNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlNome.setText("Nome:");

        jlApelido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlApelido.setText("Apelido:");

        jlTipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlTipo.setText("Tipo:");

        jtfUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfRepitaSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfApelido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jcbTipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Usuário" }));

        jbGravar.setText("Gravar");

        jbCancelar.setText("Cancelar");

        jlNovo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNovo.setText("Novo Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlApelido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlRepitaSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbGravar))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfUsuario)
                                    .addComponent(jtfSenha)
                                    .addComponent(jtfRepitaSenha)
                                    .addComponent(jtfNome)
                                    .addComponent(jtfApelido)
                                    .addComponent(jcbTipo, 0, 104, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jbCancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jlNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlNovo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRepitaSenha)
                    .addComponent(jtfRepitaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApelido)
                    .addComponent(jtfApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTipo)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbGravar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro tela = new TelaCadastro();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGravar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlApelido;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNovo;
    private javax.swing.JLabel jlRepitaSenha;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JTextField jtfApelido;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRepitaSenha;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}