/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import apoio.Formatacao;
import controladores.ControlaCliente;
import entidades.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheus.kunz
 */
public class TelaCliente extends javax.swing.JInternalFrame {

//Variáveis
    ControlaCliente cc = new ControlaCliente();
    int codigo = 0;

    public TelaCliente() {
        initComponents();
        montaTabela();
        Formatacao.formatarCpf(txtCpf);
        Formatacao.formatarData(txtDataNasc);
        Formatacao.formatarTelefone(txtTelefone);
    }

//Método para montar a tabela de listagem
    private void montaTabela() {
        ArrayList<Cliente> clientes = cc.recuperarTodos();
        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes");
        } else {
            tblClientes.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "ID";
                        case 1:
                            return "Nome";
                        case 2:
                            return "CPF";
                        case 3:
                            return "Telefone";
                        case 4:
                            return "Email";
                        case 5:
                            return "Data Nascimento";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 6;
                }

                @Override
                public int getRowCount() {
                    return clientes.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Cliente c = clientes.get(rowIndex);

                    if (c != null) {
                        switch (columnIndex) {
                            case 0:
                                return c.getId();
                            case 1:
                                return c.getNome();
                            case 2:
                                return c.getCpf();
                            case 3:
                                return c.getTelefone();
                            case 4:
                                return c.getEmail();
                            case 5:
                                return c.getDataNascimento();
                        }

                    }

                    return "n/d";
                }
            });

            tblClientes.getColumnModel().getColumn(0).setMinWidth(80);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(20);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerAbasCliente = new javax.swing.JTabbedPane();
        abaCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDataNasc = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAtualiza = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setClosable(true);

        lblNome.setText("Nome*");

        lblDataNasc.setText("Data de Nascimento");

        lblTelefone.setText("Telefone");

        lblEmail.setText("Email");

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF*");

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(lblDataNasc)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblCpf)
                    .addComponent(txtNome)
                    .addComponent(txtCpf)
                    .addComponent(txtDataNasc)
                    .addComponent(txtTelefone))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        containerAbasCliente.addTab("Cadastro", abaCadastro);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnAtualiza.setBackground(new java.awt.Color(204, 204, 204));
        btnAtualiza.setText("Atualizar");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaListagemLayout = new javax.swing.GroupLayout(abaListagem);
        abaListagem.setLayout(abaListagemLayout);
        abaListagemLayout.setHorizontalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaListagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        containerAbasCliente.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasCliente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão de salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Cliente cl = new Cliente();

        String nome = txtNome.getText().trim();
        cl.setNome(nome);
        String cpf = txtCpf.getText().trim();
        cl.setCpf(cpf);
        cl.setTelefone(txtTelefone.getText().trim());
        cl.setEmail(txtEmail.getText().trim());
        cl.setDataNascimento(txtDataNasc.getText().trim());

        if (nome.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos obrigatórios: Nome e CPF.");
            return;
        }

        if (codigo == 0) {
            boolean retorno = cc.salvar(cl);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");

                txtNome.setText("");
                txtCpf.setText("");
                txtTelefone.setText("");
                txtEmail.setText("");
                txtDataNasc.setText("");

                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        } else {
            cl.setId(codigo);
            boolean retorno = cc.editar(cl);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Editado com sucesso");
                txtNome.setText("");
                txtCpf.setText("");
                txtTelefone.setText("");
                txtEmail.setText("");
                txtDataNasc.setText("");
                montaTabela();
                containerAbasCliente.setSelectedIndex(1);
                codigo = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

//Botão de atualizar
    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizaActionPerformed

//Botão de excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String idString = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = cc.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

//Botão de editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String idString = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Cliente c = cc.recuperar(id);

        if (c == null) {
            JOptionPane.showMessageDialog(null, "Registro não localizado!");
        } else {

            codigo = c.getId();

            containerAbasCliente.setSelectedIndex(0);

            txtNome.setText(c.getNome());
            txtCpf.setText(c.getCpf());
            txtDataNasc.setText(c.getDataNascimento());
            txtTelefone.setText(c.getTelefone());
            txtEmail.setText(c.getEmail());

            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane containerAbasCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
