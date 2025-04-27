/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ControlaFuncionario {
    
    ArrayList<Funcionario> vtrFuncionario = new ArrayList();
    
    public void salvar(Funcionario f){
        vtrFuncionario.add(f);
    }
    
    public ArrayList<Funcionario> RecuperarTodos(){
         
        return vtrFuncionario;
    }
}
