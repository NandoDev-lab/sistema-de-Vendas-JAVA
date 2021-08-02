package VIEW;

import controller.ControllerCliente;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;

public class ViewCliente extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    String salvarAlterar;

    public ViewCliente() {
        initComponents();
        carregarCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela_cadastro_cli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        cbx_estado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cli = new javax.swing.JTable();
        btn_cancelar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("codigo");

        jLabel2.setText("Nome do CLiente");

        jLabel3.setText("Endereço");

        jLabel4.setText("Bairro");

        jLabel5.setText("Cidade");

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "MG", "AL", " " }));

        jLabel6.setText("Estado");

        jLabel7.setText("CEP");

        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone");

        tbl_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "CIDADE", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_cli);
        if (tbl_cli.getColumnModel().getColumnCount() > 0) {
            tbl_cli.getColumnModel().getColumn(0).setMinWidth(20);
            tbl_cli.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btn_cancelar.setText("CANCELAR");

        btn_novo.setText("NOVO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_alterar.setText("ALTERAR");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tela_cadastro_cliLayout = new javax.swing.GroupLayout(tela_cadastro_cli);
        tela_cadastro_cli.setLayout(tela_cadastro_cliLayout);
        tela_cadastro_cliLayout.setHorizontalGroup(
            tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5)
                                    .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_cadastro_cliLayout.createSequentialGroup()
                                        .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_cadastro_cliLayout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                                .addComponent(btn_cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_novo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_alterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salvar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        tela_cadastro_cliLayout.setVerticalGroup(
            tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_cadastro_cliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(tela_cadastro_cliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_novo)
                    .addComponent(btn_alterar)
                    .addComponent(btn_salvar)
                    .addComponent(btnExcluir))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_cadastro_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_cadastro_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        if (salvarAlterar.equals("novo")) {
            this.salvarCliente();

            this.carregarCliente();
            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Cliente Cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar um novo Cliente");
            }
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarCliente();
    }//GEN-LAST:event_btn_salvarActionPerformed
    }
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tbl_cli.getSelectedRow();
        int codigoCliente = (int) tbl_cli.getValueAt(linha, 0);
        try {
            if (controllerCliente.excluirClienteController(codigoCliente)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com sucesso!");
                carregarCliente();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado Excluido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "alterar";

        int linha = tbl_cli.getSelectedRow();

        try {
            int codigoCliente = (int) tbl_cli.getValueAt(linha, 0);
            /**
             * recuperar oss dados do banco
             */
            modelCliente = controllerCliente.getClienteController(codigoCliente);
            /**
             * preencher na interface
             */
            this.txtCod.setText(String.valueOf(modelCliente.getIdCliente()));
            this.txtNome.setText(modelCliente.getCliNome());
            this.txtEndereco.setText(modelCliente.getCliEndereco());
            this.txtBairro.setText(modelCliente.getCliBairro());
            this.txtCep.setText(modelCliente.getCliCep());
            this.txtCidade.setText(modelCliente.getCliCidade());
            this.txtTelefone.setText(modelCliente.getCliTelefone());
            this.cbx_estado.setSelectedItem(modelCliente.getCliUf());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "codigo invalido ou nenhum registro selecionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "novo";
    }//GEN-LAST:event_btn_novoActionPerformed

    @Override
    public void print(Graphics g) {
        super.print(g); //To change body of generated methods, choose Tools | Templates.
    }

    private void carregarCliente() {
        listaModelCliente = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) tbl_cli.getModel();
        modelo.setNumRows(0);
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getIdCliente(),
                listaModelCliente.get(i).getCliNome(),
                listaModelCliente.get(i).getCliCidade(),
                listaModelCliente.get(i).getCliTelefone()

            });
        }
    }

    private void salvarCliente() {
        modelCliente.setCliNome(this.txtNome.getText());
        modelCliente.setCliEndereco(this.txtEndereco.getText());
        modelCliente.setCliBairro(this.txtBairro.getText());
        modelCliente.setCliCidade(this.txtCidade.getText());
        modelCliente.setCliUf(this.cbx_estado.getSelectedItem().toString());
        modelCliente.setCliCep(this.txtCep.getText());
        modelCliente.setCliTelefone(this.txtTelefone.getText());

        if (controllerCliente.salvarClienteController(modelCliente) > 0) {
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado com sucesso");
            limparCampos();
            this.carregarCliente();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar um novo produto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarCliente() {
        modelCliente.setCliNome(this.txtNome.getText());
        modelCliente.setCliEndereco(this.txtEndereco.getText());
        modelCliente.setCliBairro(this.txtBairro.getText());
        modelCliente.setCliCidade(this.txtCidade.getText());
        modelCliente.setCliUf(this.cbx_estado.getSelectedItem().toString());
        modelCliente.setCliCep(this.txtCep.getText());
        modelCliente.setCliTelefone(this.txtTelefone.getText());
        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Cliente Alterado com sucesso");
            limparCampos();

            this.carregarCliente();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Alterar um produto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * limpa os campos do formulario: nome, estoque e valor
     */
    private void limparCampos() {
        txtCod.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtTelefone.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cbx_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_cli;
    private javax.swing.JPanel tela_cadastro_cli;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
