/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.DAO.ProdutoDAO;
import entidades.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ControlaProduto {
    
ProdutoDAO produtoDAO = new ProdutoDAO();

      public boolean salvar(Produto p) {
        try {
            produtoDAO.salvar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar produto: " + ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<Produto> recuperarTodos(){
        
        ArrayList<Produto> vetorProdutos = null;
        try {
            vetorProdutos = produtoDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produtos: " + ex.getMessage());
        }
        return vetorProdutos;
    
    }
    
}
