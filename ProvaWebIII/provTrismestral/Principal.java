import java.util.Scanner;

/**
 *  @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
 */
public class Principal{
    
    public static void main(String args[]){
    System.out.println("\f");
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(System.in);
    
    double mes = scanner.nextDouble();
    
    Trimestre trimestre = new Trimestre();
    trimestre.setMes("dezembro");
    System.out.println(trimestre);
    
        
    }
    
    
}