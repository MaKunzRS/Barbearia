/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ClienteDAO {
    
     ResultSet resultadoQ = null;

    public void salvar(Cliente c) throws SQLException {
        String sql = ""
                + "INSERT INTO cliente (nome, cpf, endereco, data_nasc) VALUES ("
                + "'" + c.getNome() + "',"
                + "'" + c.getCpf() + "',"
                + "'" + c.getTelefone() + "',"
                + "'" + c.getEmail() + "',"
                + "'" + c.getDataNascimento() + "'"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public ArrayList<Cliente> recuperarTodos() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList();

        String sql = ""
                + "SELECT * FROM cliente ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Cliente cliente = new Cliente();

            cliente.setId(resultadoQ.getInt("id"));
            cliente.setNome(resultadoQ.getString("nome"));
            cliente.setCpf(resultadoQ.getString("cpf"));
            cliente.setTelefone(resultadoQ.getString("telefone"));
            cliente.setEmail(resultadoQ.getString("email"));
            cliente.setDataNascimento(resultadoQ.getString("data_nascimento"));

            clientes.add(cliente);
        }

        return clientes;
    
    }

}
