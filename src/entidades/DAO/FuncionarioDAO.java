/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class FuncionarioDAO {

    ResultSet resultadoQ = null;

    public void salvar(Funcionario f) throws SQLException {
        String sql = ""
                + "INSERT INTO cliente (nome, cargo, telefone, salario) VALUES ("
                + "'" + f.getNome() + "',"
                + "'" + f.getCargo() + "',"
                + "'" + f.getTelefone() + "',"
                + "'" + f.getSalario() + "',"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Funcionario> recuperarTodos() throws SQLException {
        ArrayList<Funcionario> funcionarios = new ArrayList();

        String sql = ""
                + "SELECT * FROM funcionario ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Funcionario funcionario = new Funcionario();

            funcionario.setId(resultadoQ.getInt("id"));
            funcionario.setNome(resultadoQ.getString("nome"));
            funcionario.setTelefone(resultadoQ.getString("telefone"));
            funcionario.setCargo(resultadoQ.getString("cargo"));
            funcionario.setSalario(resultadoQ.getString("salario"));
            
            funcionarios.add(funcionario);
        }

        return funcionarios;

    }

}
