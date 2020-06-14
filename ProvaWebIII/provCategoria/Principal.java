




 /**
 * @author(Juliano Gabarrus)
 * @version(1.0 01/06/2020)
 * 
 * @return o import java.ultil.Scanner seria pra canear a idade digitada 
 * pelo usuario
 */
import java.util.Scanner;

public class Principal{
    
    public static void main(String args[]){
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in); 
        
        
       System.out.println("Digite seu nome ");
        String nome = scanner.next();
        
        System.out.println("Digitar idade: ");
        int idade = scanner.nextInt();
        
        
        /**
         * @return Retorne a classe do nadador de acordo com a idade dele
         */
        
        if(idade >= 18){
         System.out.println("Adulto");
        
        }else if(idade > 11){
            System.out.println("juvenil");
        }else if(idade > 8){
            System.out.println("infantil");        
        }else{
            System.out.println("não pode ser nadador. minimo oito anos");
        }  
        
        /**
         * @return Dados do nadador 
         */
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juliano");
        pessoa.setIdade(20);
        System.out.println(pessoa);
        
        
    
    }

}