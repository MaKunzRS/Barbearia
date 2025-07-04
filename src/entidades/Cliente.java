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
public class Cliente {

//Variáveis    
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String dataNascimento;

//Construtor    
    public Cliente() {
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cpf + ";" + email + ";" + dataNascimento + ";" + telefone;

    }

//Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

////Método para imprimir atributos
    public void exibeAtributos() {
        System.out.println(id);
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        System.out.println(dataNascimento);
    }
}
