/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barbearia;

import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import telas.TelaPrincipal;

/**
 *
 * @author matheus.kunz
 */
public class Barbearia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Inicia tela principal
        try {
            ConexaoBD.getInstance().getConnection();
            TelaPrincipal tp = new TelaPrincipal();
            tp.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados!\nPor favor entre em contato com o suporte.");
        } finally {
            ConexaoBD.getInstance().shutdown();
        }
    }

}
