/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import apoio.Formatacao;
import controladores.ControlaFuncionario;
import entidades.Cliente;
import entidades.Funcionario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matheus
 */
public class TelaFuncionario extends javax.swing.JInternalFrame {

//Variáveis
    ControlaFuncionario cf = new ControlaFuncionario();
    int codigo = 0;

    public TelaFuncionario() {
        initComponents();
        montaTabela();
        Formatacao.formatarTelefone(txtTelefone);
    }

//Método para montar a tabela de listagem
    private void montaTabela() {
        ArrayList<Funcionario> funcionarios = cf.recuperarTodos();
        if (funcionarios == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes");
        } else {
            tblFuncionarios.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "ID";
                        case 1:
                            return "Nome";
                        case 2:
                            return "Cargo";
                        case 3:
                            return "Telefone";
                        case 4:
                            return "Salário";
                        default:
                            return "";
                    }
                }

                @Override
                public int getColumnCount() {
                    return 5;
                }

                @Override
                public int getRowCount() {
                    return funcionarios.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Funcionario f = funcionarios.get(rowIndex);

                    if (f != null) {
                        switch (columnIndex) {
                            case 0:
                                return f.getId();
                            case 1:
                                return f.getNome();
                            case 2:
                                return f.getCargo();
                            case 3:
                                return f.getTelefone();
                            case 4:
                                return f.getSalario();
                        }

                    }

                    return "n/d";
                }
            });

            tblFuncionarios.getColumnModel().getColumn(0).setMinWidth(80);
            tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblFuncionarios.getColumnModel().getColumn(0).setMaxWidth(20);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerAbasFuncionario = new javax.swing.JTabbedPane();
        abaCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtCargo = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);

        lblNome.setText("Nome*");

        lblCargo.setText("Cargo*");

        lblTelefone.setText("Telefone");

        lblSalario.setText("Salario*");

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(lblCargo)
                    .addComponent(lblTelefone)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtCargo)
                    .addComponent(txtTelefone))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        containerAbasFuncionario.addTab("Cadastro", abaCadastro);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblFuncionarios);

        btnAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaListagemLayout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerAbasFuncionario.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasFuncionario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasFuncionario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão de salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Funcionario fun = new Funcionario();

        String nome = txtNome.getText().trim();
        fun.setNome(nome);
        String cargo = txtCargo.getText().trim();
        fun.setCargo(cargo);
        fun.setTelefone(txtTelefone.getText().trim());
        fun.setSalario(txtSalario.getText().trim());

        if (nome.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos obrigatórios: Nome e Cargo.");
            return;
        }

        if (codigo == 0) {
            boolean retorno = cf.salvar(fun);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");

                txtNome.setText("");
                txtCargo.setText("");
                txtTelefone.setText("");
                txtSalario.setText("");

                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        } else {
            fun.setId(codigo);
            boolean retorno = cf.editar(fun);
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Editado com sucesso");
                txtNome.setText("");
                txtCargo.setText("");
                txtTelefone.setText("");
                txtSalario.setText("");

                montaTabela();
                containerAbasFuncionario.setSelectedIndex(1);
                codigo = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

//Botão excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        String idString = String.valueOf(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = cf.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

//Botão editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String idString = String.valueOf(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Funcionario f = cf.recuperar(id);

        if (f == null) {
            JOptionPane.showMessageDialog(null, "Registro não localizado!");
        } else {
            // preenche a variavel codigo que sera usada para salvar ou editar
            codigo = f.getId();

            // mudar a aba ativa para Cadastro
            containerAbasFuncionario.setSelectedIndex(0);

            // coloca dados nos campos de interface
            txtNome.setText(f.getNome());
            txtCargo.setText(f.getCargo());
            txtTelefone.setText(f.getTelefone());
            txtSalario.setText(f.getSalario());

            txtNome.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

//Botão atualizar
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane containerAbasFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
