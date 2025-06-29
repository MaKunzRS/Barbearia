/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import controladores.ControlaUsuario;
import entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheus.kunz
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    ControlaUsuario cu = new ControlaUsuario();
    int codigo = 0;

    public TelaUsuario() {
        initComponents();
        montaTabela();
    }

    private void montaTabela() {
        ArrayList<Usuario> usuarios = cu.recuperarTodos();
        if (usuarios == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuários");
        } else {
            tblUsuarios.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "ID";
                        case 1:
                            return "Usuário";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 2;
                }

                @Override
                public int getRowCount() {
                    return usuarios.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Usuario u = usuarios.get(rowIndex);

                    if (u != null) {
                        switch (columnIndex) {
                            case 0:
                                return u.getId();
                            case 1:
                                return u.getUsuario();

                        }

                    }

                    return "n/d";
                }
            });

            tblUsuarios.getColumnModel().getColumn(0).setMinWidth(80);
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(20);
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerAbasUsuario = new javax.swing.JTabbedPane();
        abaCadastro = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha2 = new javax.swing.JLabel();
        txtSenha2 = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);

        lblUsuario.setText("Usuário");

        lblSenha.setText("Digite uma senha");

        lblSenha2.setText("Digite a senha novamente");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disco.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUsuario)
                        .addComponent(txtUsuario)
                        .addComponent(lblSenha)
                        .addComponent(txtSenha)
                        .addComponent(lblSenha2)
                        .addComponent(txtSenha2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerAbasUsuario.addTab("Cadastro", abaCadastro);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUsuarios);

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lapis.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaListagemLayout = new javax.swing.GroupLayout(abaListagem);
        abaListagem.setLayout(abaListagemLayout);
        abaListagemLayout.setHorizontalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaListagemLayout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar))
                    .addComponent(btnExcluir))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnEditar)))
        );

        containerAbasUsuario.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasUsuario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerAbasUsuario)
                .addGap(200, 200, 200))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Usuario u = new Usuario();

        if (txtSenha.getText().equals(txtSenha2.getText())) {

//            u.setUsuario(txtUsuario.getText());
//            u.setSenha(txtSenha.getText());
            String usuario = txtUsuario.getText().trim();
            String senha = txtSenha.getText().trim();

            if (usuario.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!");
                return;
            }

            u.setUsuario(usuario);
            u.setSenha(senha);

            if (codigo == 0) {
                boolean retorno = cu.salvar(u);
                if (retorno) {
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso");

                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtSenha2.setText("");

                    txtUsuario.requestFocus();
                    
                    montaTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
                }
            } else {
                u.setId(codigo);
                boolean retorno = cu.editar(u);
                if (retorno) {
                    JOptionPane.showMessageDialog(null, "Editado com sucesso");
                    txtUsuario.setText("");
                    txtSenha.setText("");
                    txtSenha2.setText("");

                    montaTabela();
                    containerAbasUsuario.setSelectedIndex(1);
                    codigo = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "As senhas não conferem, digite novamente");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String idString = String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Usuario u = cu.recuperar(id);

        if (u == null) {
            JOptionPane.showMessageDialog(null, "Registro não localizado!");
        } else {
            // preenche a variavel codigo que sera usada para salvar ou editar
            codigo = u.getId();

            // mudar a aba ativa para Cadastro
            containerAbasUsuario.setSelectedIndex(0);

            // coloca dados nos campos de interface
            txtUsuario.setText(u.getUsuario());
            txtSenha.setText("");
            txtSenha2.setText("");

            txtUsuario.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        String idString = String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = cu.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane containerAbasUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
