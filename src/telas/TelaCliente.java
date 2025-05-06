/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

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

    ControlaCliente cc = new ControlaCliente();

    public TelaCliente() {
        initComponents();
        montaTabela();
    }

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
        txtDataNasc = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAtualiza = new javax.swing.JButton();

        setClosable(true);

        lblNome.setText("Nome");

        lblDataNasc.setText("Data de Nascimento");

        lblTelefone.setText("Telefone");

        lblEmail.setText("Email");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF");

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNome)
                        .addComponent(lblDataNasc)
                        .addComponent(lblTelefone)
                        .addComponent(lblEmail)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(txtDataNasc)
                        .addComponent(txtEmail)
                        .addComponent(lblCpf)
                        .addComponent(txtCpf))
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(16, 16, 16))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnSalvar)
                .addContainerGap())
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

        btnAtualiza.setText("Atualizar");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaListagemLayout = new javax.swing.GroupLayout(abaListagem);
        abaListagem.setLayout(abaListagemLayout);
        abaListagemLayout.setHorizontalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(btnAtualiza)
                .addGap(16, 16, 16))
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaListagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualiza)
                .addContainerGap())
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


        String nome = txtNome.getText();
        cl.setNome(nome);
        cl.setCpf(txtCpf.getText());
        cl.setTelefone(txtTelefone.getText());
        cl.setEmail(txtEmail.getText());
        cl.setDataNascimento(txtDataNasc.getText());

        cc.salvar(cl);

        JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtDataNasc.setText("");

        txtNome.requestFocus();

        montaTabela();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane containerAbasCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
