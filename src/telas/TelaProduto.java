/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import controladores.ControlaProduto;
import entidades.Cliente;
import entidades.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matheus
 */
public class TelaProduto extends javax.swing.JInternalFrame {

    ControlaProduto cp = new ControlaProduto();

    public TelaProduto() {
        initComponents();
        montaTabela();
    }

  private void montaTabela() {
        ArrayList<Produto> produtos = cp.recuperarTodos();
        if (produtos == null) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar clientes");
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
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblTempoEstimado = new javax.swing.JLabel();
        txtTempoEstimado = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);

        lblId.setText("Id");

        lblDescricao.setText("Descrição");

        lblPreco.setText("Preço");

        lblTempoEstimado.setText("Tempo Estimado");

        lblTipo.setText("Tipo");

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        lblEstoque.setText("Estoque");

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
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId)
                    .addComponent(txtId)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco)
                    .addComponent(lblTempoEstimado)
                    .addComponent(txtTempoEstimado)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo)
                    .addComponent(lblEstoque)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTempoEstimado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTempoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
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

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaListagemLayout = new javax.swing.GroupLayout(abaListagem);
        abaListagem.setLayout(abaListagemLayout);
        abaListagemLayout.setHorizontalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addGroup(abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        abaListagemLayout.setVerticalGroup(
            abaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        containerAbasProduto.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerAbasProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerAbasProduto)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    //Botão de salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Produto pr = new Produto();

        String idString = txtId.getText();
        int id = Integer.parseInt(idString);
        String idConvertido = String.valueOf(id);

        pr.setId(id);

        pr.setDescricao(txtDescricao.getText());
        pr.setPreco(txtPreco.getText());
        pr.setTipo(txtTipo.getText());

        String tempoEstimadoString = txtTempoEstimado.getText();
        int tempoEstimado = Integer.parseInt(tempoEstimadoString);
        String tempoEstimadoConvertido = String.valueOf(tempoEstimado);

        pr.setTempoEstimado(tempoEstimado);

        String estoqueString = txtEstoque.getText();
        int estoque = Integer.parseInt(estoqueString);
        String estoqueConvertido = String.valueOf(estoque);

        pr.setEstoque(estoque);

        cp.salvar(pr);

        JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        txtId.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtTipo.setText("");
        txtTempoEstimado.setText("");
        txtEstoque.setText("");

        txtId.requestFocus();

    //    montaTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        montaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTabbedPane containerAbasProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTempoEstimado;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTempoEstimado;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
