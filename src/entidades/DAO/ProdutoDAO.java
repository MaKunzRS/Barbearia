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

    public void salvar(Produto p) throws SQLException {
        String sql = ""
                + "INSERT INTO produto (descricao, preco, tipo, estoque, tempo_estimado) VALUES ("
                + "'" + p.getDescricao()+ "',"
                + "'" + p.getPreco() + "',"
                + "'" + p.getTipo() + "',"
                + "'" + p.getEstoque() + "',"
                + "'" + p.getTempoEstimado() + "'"
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

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
            produto.setTempoEstimado(resultadoQ.getInt("tempo_estimado"));

            produtos.add(produto);
        }

        return produtos;
    
    }
}
