

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PostoTest.
 *
 * @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
 */
public class PostoTest
{
    private Posto posto = new Posto(); 
    
    public PostoTest(){
        
        posto.setGasolinaPreco(20);
        
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){        
        posto.setGasolinaPreco(20);
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    /**
     * @return teste do valor que da gasolina
     */
    @Test
    public void testGasolinaPreco(){       
        posto.setGasolinaPreco(20);
        assertEquals(20.0, posto.getGasolinaPreco());
    }
    
    /**
     * @return teste da Gasolina
     */
    @Test
    public void testGasolina(){
        posto.setGasolinaPreco(20);
        assertEquals(89.80000000000001 , posto.gasolina());
    }
}
