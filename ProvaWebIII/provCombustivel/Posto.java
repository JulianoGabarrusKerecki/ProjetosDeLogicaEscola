/**
 * A classe de teste PostoTest.
 *
 * @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
 */
import java.util.Scanner;
public class Posto{
    
    double gasolinaPreco;
    
    
    public double getGasolinaPreco(){
        return this.gasolinaPreco;
    }
    public void setGasolinaPreco(double gasolinaPreco){
        this.gasolinaPreco = gasolinaPreco;
    }
    /**
     * @return retornar o valor da gasolina 
     */
    public double gasolina(){
        return this.gasolinaPreco * 4.49;
        
    }
    /**
     * @return retornar o valor do alcool
     */
    public double alcool(){
        return this.gasolinaPreco * 3.68;
    }
    /**
     * @return retornar o valor do disel
     */
    public double disel(){
        return this.gasolinaPreco * 3.71;
    }
    public double flex(){
        return (alcool() / 2 ) + (gasolina() / 2);
    }
    /**
     * Return os preços da gasolina
     */
    @Override
    
    public String toString(){
        return"\nValor adicionado: " + this.gasolinaPreco
            + "\nGasolina: " + this.gasolina()
            + "\nAlcol: " + this.alcool() 
            + "\nDisel: " + this.disel()
            + "\nFlex: " + this.flex();
    }
    
    
}