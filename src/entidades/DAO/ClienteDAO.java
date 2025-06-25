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
 
//Método para salvar no BD
    public void salvar(Cliente c) throws SQLException {
        String sql = ""
                + "INSERT INTO cliente (nome, cpf, telefone, email, dataNascimento) VALUES ("
                + "'" + c.getNome() + "',"
                + "'" + c.getCpf() + "',"
                + "'" + c.getTelefone() + "',"
                + "'" + c.getEmail() + "',"
                + "'" + c.getDataNascimento() + "'"
                + ")";
        
        System.out.println("sql: " + sql);
        
        ConexaoBD.executeUpdate(sql);
    }
 
//Método para consultar todos no BD
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
            cliente.setDataNascimento(resultadoQ.getString("dataNascimento"));
            
            clientes.add(cliente);
        }
        
        return clientes;
        
    }

//Método para conultar todos no BD    
    public Cliente recuperar(int id) throws SQLException {
        Cliente cliente = null;
        String sql = ""
                + "SELECT * FROM cliente WHERE id = " + id;
        
        resultadoQ = ConexaoBD.executeQuery(sql);
        
        if (resultadoQ.next()) {
            cliente = new Cliente();
            
            cliente.setId(resultadoQ.getInt("id"));
            cliente.setNome(resultadoQ.getString("nome"));
            cliente.setTelefone(resultadoQ.getString("telefone"));
            cliente.setCpf(resultadoQ.getString("cpf"));
            cliente.setEmail(resultadoQ.getString("email"));
            cliente.setDataNascimento(resultadoQ.getString("dataNascimento"));
        }
        return cliente;
    }

//Método para editar no BD
    public void editar(Cliente c) throws SQLException {
        String sql = ""
                + "UPDATE cliente "
                + "SET "
                + "nome = '" + c.getNome() + "',"
                + "telefone = '" + c.getTelefone() + "',"
                + "cpf = '" + c.getCpf() + "',"
                + "email = '" + c.getEmail() + "',"
                + "dataNascimento = '" + c.getDataNascimento() + "' "
                + "WHERE id = " + c.getId();
        
        System.out.println("sql: " + sql);
        
        ConexaoBD.executeUpdate(sql);
        
    }
    
//Método para excluir no BD
    public void excluir(int id) throws SQLException{
        String sql = ""
                + "DELETE FROM cliente WHERE id = " + id;
        
        System.out.println("sql: " + sql);
        
        ConexaoBD.executeUpdate(sql);
    }
}
