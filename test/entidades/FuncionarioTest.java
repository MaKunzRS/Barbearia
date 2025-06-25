/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Suporte Time Lapse
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }
    
    private Funcionario funcionario;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        funcionario = new Funcionario();
    }
    
    @After
    public void tearDown() {
        
        funcionario = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   
   public void testGettersAndSetters() {
       
        int idEsperado = 42;
        String nomeEsperado = "Juca Bala";
        String cargoEsperado = "Barbeiro";
        String telefoneEsperado = "(51)99548-8974";
        String salarioEsperado = "2000";
       
        // Act: usamos setters
        funcionario.setId(idEsperado);
        funcionario.setNome(nomeEsperado);
        funcionario.setCargo(cargoEsperado);
        funcionario.setTelefone(telefoneEsperado);
        funcionario.setSalario(salarioEsperado);
        

        // Assert: verificamos via getters
        assertEquals(idEsperado, funcionario.getId());
        assertEquals(nomeEsperado, funcionario.getNome());
        assertEquals(cargoEsperado, funcionario.getCargo());
        assertEquals(telefoneEsperado, funcionario.getTelefone());
        assertEquals(salarioEsperado, funcionario.getSalario());
       
    }
   
    @Test
    public void testToString() {
        // Arrange
        funcionario.setId(5);
        funcionario.setNome("Cleiton");
        funcionario.setCargo("Barbeiro");
        funcionario.setTelefone("(51)99452-1548");
        funcionario.setSalario("2000");
        
        // Act
        String esperado = "5;Cleiton;Barbeiro;(51)99452-1548;2000";
        String obtido = funcionario.toString();

        // Assert
        assertEquals(esperado, obtido);
    }
  
}
