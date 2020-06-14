

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PessoaTest.
 *
*  @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
  */
public class PessoaTest
{
    private Pessoa pessoa = new Pessoa();
    
    public PessoaTest()
    {
        
            pessoa.setIdade(55);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
      pessoa.setIdade(55);
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }
    /**
     * @return a idade do nadador ex
     */
    @Test
    public void testGetIdade(){
        pessoa.setIdade(15);
        assertEquals(15, pessoa.getIdade());
    }
    
    /**
     * @return a classificaçao do nadador
     */
    @Test
    public void testVerificarNadador(){    
        pessoa.setIdade(65);
        assertEquals("Adulto", pessoa.verificarNadador());
        pessoa.setIdade(15);
        assertEquals("juvenil", pessoa.verificarNadador());
        pessoa.setIdade(9);
        assertEquals("infantil", pessoa.verificarNadador());
        pessoa.setIdade(4);
        assertEquals("não pode ser nadador. minimo oito anos", pessoa.verificarNadador());
        
    }
}
