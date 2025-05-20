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

//Método para salvar funcionário
    public boolean salvar(Funcionario f) {
        try {
            funcionarioDAO.salvar(f);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar funcionario: " + ex.getMessage());
            return false;
        }
    }

//Método para editar funcionário
    public boolean editar(Funcionario f) {
        try {
            funcionarioDAO.editar(f);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar funcionário: " + ex.getMessage());
            return false;
        }
    }

//Método para excluir funcionário    
    public boolean excluir(int id) {
        try {
            funcionarioDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir funcionario: " + ex.getMessage());
            return false;
        }
    }

//Método para recuperar um funcionário    
    public Funcionario recuperar(int id) {
        try {
            Funcionario funcionario = funcionarioDAO.recuperar(id);
            return funcionario;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar funcionario: " + ex.getMessage());
            return null;
        }
    }

//Método para recuperar todos os funcionários
    public ArrayList<Funcionario> recuperarTodos() {
        ArrayList<Funcionario> vetorFuncionarios = null;
        try {
            vetorFuncionarios = funcionarioDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar funcionario: " + ex.getMessage());
        }
        return vetorFuncionarios;
    }
}
