/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author matheus.kunz
 */
public class Funcionario {

//Variáveis
    private int id;
    private String nome;
    private String cargo;
    private String telefone;
    private String salario;

//Construtor
    public Funcionario() {
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cargo + ";" + telefone + ";" + salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

//Método para imprimir atributos
    public void exibeAtributos() {
        System.out.println(id);
        System.out.println(nome);
        System.out.println(cargo);
        System.out.println(telefone);
        System.out.println(salario);
    }
}
