/**
 * A classe de teste PostoTest.
 *
 * @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
 */
import java.util.Scanner;
public class Principal{

   public static void main(String args[]){
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("digite o valor de gasolina que desejas: ");
       double gasolinaPreco = scanner.nextInt();
       
       
       
       /**
        * return dados da gasolina 
        **/
       
       Posto posto = new Posto();
       posto.setGasolinaPreco(20.0);
       System.out.println(posto);
       
   }

}