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

//Método para salvar produto
    public boolean salvar(Produto p) {
        try {
            produtoDAO.salvar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar produto: " + ex.getMessage());
            return false;
        }
    }

//Método para editar produto
    public boolean editar(Produto p) {
        try {
            produtoDAO.editar(p);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar produto: " + ex.getMessage());
            return false;
        }
    }
 
//Método para excluir produto    
     public boolean excluir(int id) {
        try {
            produtoDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produto: " + ex.getMessage());
            return false;
        }
    }

//Método para recuperar um produto
    public Produto recuperar(int id) {
        try {
            Produto produto = produtoDAO.recuperar(id);
            return produto;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produto: " + ex.getMessage());
            return null;
        }
    }

//Método para recuperar todos os produtos    
    public ArrayList<Produto> recuperarTodos() {

        ArrayList<Produto> vetorProdutos = null;
        try {
            vetorProdutos = produtoDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produtos: " + ex.getMessage());
        }
        return vetorProdutos;

    }

}
