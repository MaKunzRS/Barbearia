/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import apoio.Formatacao;
import controladores.ControlaProduto;
import entidades.Cliente;
import entidades.Produto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matheus
 */
public class TelaProduto extends javax.swing.JInternalFrame {

//Variáveis
    ControlaProduto cp = new ControlaProduto();
    int codigo = 0;

    public TelaProduto() {
        initComponents();
        montaTabela();
    }

//Método para montar tabela de listagem
    private void montaTabela() {
        ArrayList<Produto> produtos = cp.recuperarTodos();
        if (produtos == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar produtos");
        } else {
            tblProdutos.setModel(new AbstractTableModel() {
                @Override
                public String getColumnName(int column) {
                    switch (column) {
                        case 0:
                            return "ID";
                        case 1:
                            return "Descrição";
                        case 2:
                            return "Preço";
                        case 3:
                            return "Tempo Estimado";
                        case 4:
                            return "Tipo";
                        case 5:
                            return "Estoque";
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
                    return produtos.size();
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Produto p = produtos.get(rowIndex);

                    if (p != null) {
                        switch (columnIndex) {
                            case 0:
                                return p.getId();
                            case 1:
                                return p.getDescricao();
                            case 2:
                                return p.getPreco();
                            case 3:
                                return p.getTempoEstimado();
                            case 4:
                                return p.getTipo();
                            case 5:
                                return p.getEstoque();
                        }

                    }

                    return "n/d";
                }
            });

            tblProdutos.getColumnModel().getColumn(0).setMinWidth(80);
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(20);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerAbasProduto = new javax.swing.JTabbedPane();
        abaCadastro = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        lblTempoEstimado = new javax.swing.JLabel();
        txtTempoEstimado = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        txtPreco = new javax.swing.JTextField();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        lblDescricao.setText("Descrição*");

        lblPreco.setText("Preço*");

        lblTempoEstimado.setText("Tempo Estimado");

        lblTipo.setText("Tipo*");

        lblEstoque.setText("Estoque");

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/disco.png"))); // NOI18N
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

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Produto", "Serviço" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSalvar)
                        .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescricao)
                            .addComponent(lblPreco)
                            .addComponent(lblTempoEstimado)
                            .addComponent(lblTipo)
                            .addComponent(lblEstoque)
                            .addComponent(txtDescricao)
                            .addComponent(cbTipo, 0, 280, Short.MAX_VALUE)
                            .addComponent(txtTempoEstimado)
                            .addComponent(txtEstoque)))
                    .addComponent(txtPreco))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPreco)
                .addGap(2, 2, 2)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addGap(3, 3, 3)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTempoEstimado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTempoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        containerAbasProduto.addTab("Cadastro", abaCadastro);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProdutos);

        btnAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lapis.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
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
                .addContainerGap()
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(abaListagemLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar)
                        .addGap(555, 555, 555)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerAbasProduto.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasProduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerAbasProduto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão de salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Produto pr = new Produto();

//        String descricao = txtDescricao.getText();
//        pr.setDescricao(descricao);
        String descricao = txtDescricao.getText().trim();
        String preco = txtPreco.getText().trim();
        String tipo = cbTipo.getSelectedItem().toString().trim();
        pr.setPreco(txtPreco.getText());
        if (!txtTempoEstimado.getText().trim().equals("")) {
            pr.setTempoEstimado(Integer.parseInt(txtTempoEstimado.getText()));
        }
        if (!txtEstoque.getText().trim().equals("")) {
            pr.setEstoque(Integer.parseInt(txtEstoque.getText()));
        }
        pr.setTipo(cbTipo.getSelectedItem().toString());
        System.out.println(pr.getTipo());

        if (descricao.isEmpty() || preco.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios: Descrição, Preço e Tipo.");
            return;
        }

        if (codigo == 0) {
            if (cbTipo.getSelectedItem() == "") {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
            } else {
                if (cbTipo.getSelectedItem() == "Serviço") {

                    cbTipo.setSelectedIndex(1);

                } else if (cbTipo.getSelectedItem() == "Produto") {
                    cbTipo.setSelectedIndex(2);
                } else {
                    JOptionPane.showMessageDialog(this, "Tipo não pode ser vazio!");
                }
                boolean retorno = cp.salvar(pr);
                if (retorno) {
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso");

                    txtDescricao.setText("");
                    txtEstoque.setText("");
                    txtPreco.setText("");
                    txtTempoEstimado.setText("");
                    cbTipo.setSelectedItem("");

                    txtDescricao.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique os logs.");
                }
            }
        } else {
            pr.setId(codigo);
            if (cbTipo.getSelectedItem() == "") {
                JOptionPane.showMessageDialog(null, "Tipo não pode ser vazio!");
            } else {
                boolean retorno = cp.editar(pr);
                if (retorno) {
                    JOptionPane.showMessageDialog(null, "Editado com sucesso");
                    txtDescricao.setText("");
                    txtEstoque.setText("");
                    txtPreco.setText("");
                    txtTempoEstimado.setText("");
                    if (cbTipo.getSelectedItem() == "Serviço") {

                        cbTipo.setSelectedIndex(1);

                    } else if (cbTipo.getSelectedItem() == "Produto") {
                        cbTipo.setSelectedIndex(2);
                    } else {
                        JOptionPane.showMessageDialog(this, "Tipo não pode ser vazio!");
                    }

                    montaTabela();
                    containerAbasProduto.setSelectedIndex(1);
                    codigo = 0;
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
//Botão atualizar
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

//Botão editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String idString = String.valueOf(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        Produto p = cp.recuperar(id);

        if (p == null) {
            JOptionPane.showMessageDialog(null, "Registro não localizado!");
        } else {
            // preenche a variavel codigo que sera usada para salvar ou editar
            codigo = p.getId();

            // mudar a aba ativa para Cadastro
            containerAbasProduto.setSelectedIndex(0);

            // coloca dados nos campos de interface
            txtDescricao.setText(p.getDescricao());
            txtPreco.setText(p.getPreco());
            txtEstoque.setText(String.valueOf(p.getEstoque()));
            txtTempoEstimado.setText(String.valueOf(p.getTempoEstimado()));
            cbTipo.setSelectedItem(p.getTipo());
            txtDescricao.requestFocus();
        }

    }//GEN-LAST:event_btnEditarActionPerformed

//Botão excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        String idString = String.valueOf(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0));
        int id = Integer.parseInt(idString);

        boolean retorno = cp.excluir(id);
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            montaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

//Abertura da combo ao editar
    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        if (cbTipo.getSelectedItem() == "Serviço") {
            txtEstoque.setEnabled(false);
            txtTempoEstimado.setEnabled(true);
        } else if (cbTipo.getSelectedItem() == "Produto") {
            txtEstoque.setEnabled(true);
            txtTempoEstimado.setEnabled(false);
        }
    }//GEN-LAST:event_cbTipoActionPerformed

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
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTabbedPane containerAbasProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTempoEstimado;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTempoEstimado;
    // End of variables declaration//GEN-END:variables
}
