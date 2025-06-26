/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
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
            + "  cargo VARCHAR(255) NOT NULL, "
            + "  salario VARCHAR(255) NOT NULL, "
            + "  telefone VARCHAR(255) NOT NULL "
            + ");";

    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS funcionario;";

    private FuncionarioDAO dao;

    public FuncionarioDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {

        try {
            System.setProperty("db.config", "db-test.properties");
            ConexaoBD.executeUpdate(SQL_CREATE_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @BeforeClass: falha ao criar tabela 'funcionario'.\n" + e.getMessage(), e);
        }
    }

    @AfterClass
    public static void tearDownClass() {

        try {
            ConexaoBD.executeUpdate(SQL_DROP_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @AfterClass: falha ao dropar tabela 'funcionario'.\n" + e.getMessage(), e);
        }
    }

    @Before
    public void setUp() {

        // Garante que começa com uma conexão “zerada”
        ConexaoBD.getInstance().shutdown();

        // Instancia o DAO
        dao = new FuncionarioDAO();

        // Limpa todos os registros da tabela antes de cada teste e reseta a sequência do serial
        try {
            ConexaoBD.executeUpdate("TRUNCATE TABLE funcionario RESTART IDENTITY;");
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @Before setUp(): falha ao truncar ou reiniciar serial da tabela 'funcionario'.\n" + e.getMessage(), e);
        }
    }

    @After
    public void tearDown() {

        ConexaoBD.getInstance().shutdown();
    }

    public void testInserirERetornarFuncionario() throws SQLException {
        // 1) Cria objeto e insere no banco
        Funcionario f = new Funcionario();
        f.setNome("João da Silva");
        f.setCargo("Barbeiro");
        f.setTelefone("(51)98588-5478");
        f.setSalario("2000");
        dao.salvar(f);

        // 2) Recupera todos os funcionarios, deve haver 1
        ArrayList<Funcionario> lista = dao.recuperarTodos();
        assertNotNull("Lista não deve ser nula", lista);
        assertEquals("Deve haver exatamente 1 funcionario na tabela", 1, lista.size());

        // 3) Recupera o funcionario inserido e valida os dados
        Funcionario recuperado = dao.recuperar(1);
        assertNotNull("recuperar(id) não deve retornar null", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals(f.getNome(), recuperado.getNome());
        assertEquals(f.getCargo(), recuperado.getCargo());
        assertEquals(f.getTelefone(), recuperado.getTelefone());
        assertEquals(f.getSalario(), recuperado.getSalario());
    }

    @Test
    public void testEditarFuncionario() throws SQLException {
        // 1) Primeiro insere um registro
        Funcionario f = new Funcionario();
        f.setNome("Maria Pereira");
        f.setCargo("Barbeiro");
        f.setSalario("2000");
        f.setTelefone("(51)98789-8568");

        dao.salvar(f);

        // 2) Prepara novo objeto com ID = 1 e informações modificadas e edita
        Funcionario modificado = new Funcionario();
        modificado.setId(1);                          // fixa ID = 1
        modificado.setNome("Maria P. Oliveira");      // novo nome
        modificado.setCargo("Barbeiro");             // mantém cargo original
        modificado.setTelefone("(51)98789-8578");  // novo telefone
        modificado.setSalario("2000");         // mantém salario
        dao.editar(modificado);

        // 3) Recupera do banco e valida que os campos foram atualizados
        Funcionario recuperado = dao.recuperar(1);
        assertNotNull("Funcionario com ID 1 deveria existir após edição", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals("Maria P. Oliveira", recuperado.getNome());
        assertEquals("Barbeiro", recuperado.getCargo());
        assertEquals("(51)98789-8578", recuperado.getTelefone());
        assertEquals("2000", recuperado.getSalario());

    }

    @Test
    public void testExcluirFuncionario() throws SQLException {
        // 1) Insere um registro
        Funcionario f = new Funcionario();
        f.setNome("Carlos Souza");
        f.setCargo("Barbeiro");
        f.setTelefone("(51)98789-8568");
        f.setSalario("2000");

        dao.salvar(f);

        // Confirma que existe antes da exclusão
        Funcionario antes = dao.recuperar(1);
        assertNotNull("Funcionario com ID 1 deveria existir antes da exclusão", antes);

        // 2) Exclui o funcionario de ID = 1
        dao.excluir(1);

        // 3) Verifica que recuperar(1) agora retorne null
        Funcionario depois = dao.recuperar(1);
        assertNull("recuperar(1) deve retornar null após exclusão", depois);

        // 4) Verifica que recuperarTodos() retorne lista vazia
        ArrayList<Funcionario> todos = dao.recuperarTodos();
        assertNotNull("Lista retornada por recuperarTodos não deve ser null", todos);
        assertTrue("Lista deve estar vazia após exclusão do funcionario", todos.isEmpty());
    }

}
