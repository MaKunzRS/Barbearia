/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package apoio;

import apoio.ConexaoBD;
import org.junit.Test;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
/**
 *
 * @author matheus.kunz
 */
public class ConexaoBDTest {

    public ConexaoBDTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConnection() throws SQLException {
        // Obtém a Connection a partir do singleton ConexaoBD
        Connection conn = ConexaoBD.getInstance().getConnection();

        // Verifica se não é null
        assertNotNull("A conexão não deve ser nula", conn);

        // Verifica se está aberta
        assertFalse("A conexão não deve estar fechada", conn.isClosed());

        conn.close();
        ConexaoBD.getInstance().shutdown();
    }
}
