/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import entidades.DAO.FuncionarioDAO;
import entidades.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ControlaFuncionario {
    
   FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

      public boolean salvar(Funcionario f) {
        try {
            funcionarioDAO.salvar(f);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar funcionario: " + ex.getMessage());
            return false;
        }
    }
    
     public ArrayList<Funcionario> recuperarTodos(){
        ArrayList<Funcionario> vetorFuncionarios = null;
        try {
            vetorFuncionarios = funcionarioDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar funcionario: " + ex.getMessage());
        }
        return vetorFuncionarios;
    }
}
