/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ProdutoDAO {

    ResultSet resultadoQ = null;

//Método para salvar no BD
    public void salvar(Produto p) throws SQLException {
        String sql = ""
                + "INSERT INTO produto (descricao, preco, tipo, estoque, tempoEstimado) VALUES ("
                + "'" + p.getDescricao() + "',"
                + "'" + p.getPreco() + "',"
                + "'" + p.getTipo() + "',"
                + "'" + p.getEstoque() + "',"
                + "'" + p.getTempoEstimado() + "'"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

//Método para consultar no BD
    public Produto recuperar(int id) throws SQLException {
        Produto produto = null;
        String sql = ""
                + "SELECT * FROM produto WHERE id = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            produto = new Produto();

            produto.setId(resultadoQ.getInt("id"));
            produto.setDescricao(resultadoQ.getString("descricao"));
            produto.setPreco(resultadoQ.getString("preco"));
            produto.setTipo(resultadoQ.getString("tipo"));
            produto.setEstoque(resultadoQ.getInt("estoque"));
            produto.setTempoEstimado(resultadoQ.getInt("tempoEstimado"));
        }
        return produto;
    }

//Método para editar no BD
    public void editar(Produto p) throws SQLException {
        String sql = ""
                + "UPDATE produto "
                + "SET "
                + "descricao = '" + p.getDescricao() + "',"
                + "preco = '" + p.getPreco() + "',"
                + "tipo = '" + p.getTipo() + "',"
                + "estoque = '" + p.getEstoque() + "',"
                + "tempoEstimado = '" + p.getTempoEstimado() + "' "
                + "WHERE id = " + p.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);

    }

//Método para consultar todos no BD
    public ArrayList<Produto> recuperarTodos() throws SQLException {
        ArrayList<Produto> produtos = new ArrayList();

        String sql = ""
                + "SELECT * FROM produto ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Produto produto = new Produto();

            produto.setId(resultadoQ.getInt("id"));
            produto.setDescricao(resultadoQ.getString("descricao"));
            produto.setPreco(resultadoQ.getString("preco"));
            produto.setTipo(resultadoQ.getString("tipo"));
            produto.setEstoque(resultadoQ.getInt("estoque"));
            produto.setTempoEstimado(resultadoQ.getInt("tempoEstimado"));

            produtos.add(produto);
        }

        return produtos;

    }

//Método para excluir no BD
    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM produto WHERE id = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}
