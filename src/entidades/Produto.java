/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author matheus.kunz
 */
public class Produto {

//Variáveis
    private int id;
    private String descricao;
    private String preco;
    private int tempoEstimado;
    private String tipo;
    private int estoque;

//Construtor
    public Produto() {
    }

//Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

//Método para imprimir atributos
    public void exibeAtributos() {
        System.out.println(id);
        System.out.println(descricao);
        System.out.println(preco);
        System.out.println(tempoEstimado);
        System.out.println(tipo);
        System.out.println(estoque);
    }
}
