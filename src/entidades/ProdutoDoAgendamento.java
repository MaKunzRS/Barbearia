/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author matheus.kunz
 */
public class ProdutoDoAgendamento {

//Variáveis
    private int id;
    private int idAgendamento;
    private int idProduto;

//Construtor
    public ProdutoDoAgendamento() {
    }

//Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

//Método para imprimir atributos
    public void exibeAtributos() {
        System.out.println(id);
        System.out.println(idAgendamento);
        System.out.println(idProduto);

    }
}
