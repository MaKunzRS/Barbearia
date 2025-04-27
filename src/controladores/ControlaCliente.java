/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author matheus.kunz
 */
public class ControlaCliente {

    ArrayList<Cliente> vtrClientes = new ArrayList();

    public void salvar(Cliente c) {
        vtrClientes.add(c);

    }

    public ArrayList<Cliente> recuperarTodos(){

        return vtrClientes;

    }
}
