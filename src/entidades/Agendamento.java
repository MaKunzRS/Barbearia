/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author matheus.kunz
 */
public class Agendamento {

//Variáveis
    private int id;
    private int idPessoa;
    private int idFuncionario;
    private Date dataHora;
    private String status;

//Construtor
    public Agendamento() {
    }

//Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//Método para imprimir atributos
    public void exibeAtributos() {
        System.out.println(id);
        System.out.println(idPessoa);
        System.out.println(idFuncionario);
        System.out.println(dataHora);
        System.out.println(status);
    }
}
