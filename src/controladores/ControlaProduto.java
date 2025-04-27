/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Produto;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ControlaProduto {
    
    ArrayList<Produto> vtrProduto = new ArrayList();
    
    public void salvar(Produto p){
        vtrProduto.add(p);
    }
    
    public ArrayList<Produto> recuperarTodos(){
        
        return vtrProduto;
    }
    
}
