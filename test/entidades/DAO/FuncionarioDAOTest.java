/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidades.DAO;

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
public class FuncionarioDAOTest {
    
        // SQL para criar e dropar a tabela de teste
    private static final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS funcionario ( "
            + "  id SERIAL PRIMARY KEY, "
            + "  nome VARCHAR(255) NOT NULL, "
            + "  cpf CHAR(11) NOT NULL, "
            + "  email VARCHAR(255) NOT NULL, "
            + "  dataNascimento DATE NOT NULL,"
            + "  telefone VARCHAR(255) NOT NULL "
            + ");";
    
    public FuncionarioDAOTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
