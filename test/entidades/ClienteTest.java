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
 * @author mateus
 */
public class ClienteTest {

    public ClienteTest() {
    }

    private Cliente cliente;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Este método roda antes de CADA @Test. 
        // Aqui criamos um novo Cliente para cada caso de teste.
        cliente = new Cliente();
    }

    @After
    public void tearDown() {
        // Este método roda depois de CADA @Test.
        // Em testes simples, basta “zerar” ou liberar a instância.
        cliente = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange (já temos 'cliente' criado no setUp):
        int idEsperado = 42;
        String nomeEsperado = "Leandro Souza";
        String cpfEsperado = "123.456.789-00";
        String emailEsperado = "Teste@teste.com";
        String dataEsperada = "01/01/1990";
        String telefoneEsperado = "(51)99548-8974";

        // Act: usamos setters
        cliente.setId(idEsperado);
        cliente.setNome(nomeEsperado);
        cliente.setCpf(cpfEsperado);
        cliente.setEmail(emailEsperado);
        cliente.setDataNascimento(dataEsperada);
        cliente.setTelefone(telefoneEsperado);

        // Assert: verificamos via getters
        assertEquals(idEsperado, cliente.getId());
        assertEquals(nomeEsperado, cliente.getNome());
        assertEquals(cpfEsperado, cliente.getCpf());
        assertEquals(emailEsperado, cliente.getEmail());
        assertEquals(dataEsperada, cliente.getDataNascimento());
        assertEquals(telefoneEsperado, cliente.getTelefone());
    }

    @Test
    public void testToString() {
        // Arrange
        cliente.setId(5);
        cliente.setNome("Cleiton");
        cliente.setCpf("987.654.321-00");
        cliente.setEmail("Teste@teste.com");
        cliente.setDataNascimento("15/05/1985");
        cliente.setTelefone("(51)99452-1548");

        // Act
        String esperado = "5;Cleiton;987.654.321-00;Teste@teste.com;15/05/1985;(51)99452-1548";
        String obtido = cliente.toString();

        // Assert
        assertEquals(esperado, obtido);
    }
}
