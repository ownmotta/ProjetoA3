/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author frank
 */
public class cadastroContinuacaoRequisitos extends javax.swing.JFrame {

    /**
     * Creates new form cadastroContinuacaoRequisitos
     */
    public cadastroContinuacaoRequisitos() {
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

        labelEsforcoEstimado = new javax.swing.JLabel();
        campoTextoEsforcoEstimado = new javax.swing.JTextField();
        labelModulo = new javax.swing.JLabel();
        campoTextoModulo = new javax.swing.JTextField();
        labelFuncionalidade = new javax.swing.JLabel();
        campoTextoFuncionalidade = new javax.swing.JTextField();
        labelDataUltimaAlteracao = new javax.swing.JLabel();
        campoTextoDataUltimaAlteracao = new javax.swing.JFormattedTextField();
        labelAutorUltimaAlteracao = new javax.swing.JLabel();
        selecaoAutorUltimaAlteracao = new javax.swing.JComboBox<>();
        labelVersao = new javax.swing.JLabel();
        campoTextoVersao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoTextoComplexidade = new javax.swing.JTextField();
        botaoSalvarCadatroRequisito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEsforcoEstimado.setText("Esforço Estimado em Horas");

        labelModulo.setText("Módulo");

        labelFuncionalidade.setText("Funcionalidade");

        labelDataUltimaAlteracao.setText("Data da última Alteração");

        labelAutorUltimaAlteracao.setText("Autor da Última Alteração");

        selecaoAutorUltimaAlteracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelVersao.setText("Versão");

        jLabel1.setText("Complexidade");

        botaoSalvarCadatroRequisito.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSalvarCadatroRequisito)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoTextoComplexidade))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelVersao)
                            .addGap(18, 18, 18)
                            .addComponent(campoTextoVersao))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelAutorUltimaAlteracao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selecaoAutorUltimaAlteracao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelDataUltimaAlteracao)
                            .addGap(18, 18, 18)
                            .addComponent(campoTextoDataUltimaAlteracao))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelFuncionalidade)
                            .addGap(18, 18, 18)
                            .addComponent(campoTextoFuncionalidade))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelModulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoTextoModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelEsforcoEstimado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(campoTextoEsforcoEstimado))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEsforcoEstimado)
                    .addComponent(campoTextoEsforcoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModulo)
                    .addComponent(campoTextoModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncionalidade)
                    .addComponent(campoTextoFuncionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataUltimaAlteracao)
                    .addComponent(campoTextoDataUltimaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutorUltimaAlteracao)
                    .addComponent(selecaoAutorUltimaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVersao)
                    .addComponent(campoTextoVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvarCadatroRequisito)
                .addContainerGap(21, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroContinuacaoRequisitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroContinuacaoRequisitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarCadatroRequisito;
    private javax.swing.JTextField campoTextoComplexidade;
    private javax.swing.JFormattedTextField campoTextoDataUltimaAlteracao;
    private javax.swing.JTextField campoTextoEsforcoEstimado;
    private javax.swing.JTextField campoTextoFuncionalidade;
    private javax.swing.JTextField campoTextoModulo;
    private javax.swing.JTextField campoTextoVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAutorUltimaAlteracao;
    private javax.swing.JLabel labelDataUltimaAlteracao;
    private javax.swing.JLabel labelEsforcoEstimado;
    private javax.swing.JLabel labelFuncionalidade;
    private javax.swing.JLabel labelModulo;
    private javax.swing.JLabel labelVersao;
    private javax.swing.JComboBox<String> selecaoAutorUltimaAlteracao;
    // End of variables declaration//GEN-END:variables
}
