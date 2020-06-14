public class Pessoa{
    /**
     *  @author  (Juliano Gabarrus)
     * @version (1.0 01/06/2020)
     */
    private String nome;
    private int idade;
    
    public Pessoa(){
    
    }
    
    public String getNome(){
    
        return this.nome;        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){    
        return this.idade;        
    }
    
    public void setIdade(int idade){
        this.idade = idade>0 ? idade : 0;
    }
    /**
     * @return Rtornar a classificação do nadador
     */
    public String verificarNadador(){       
        
        if(this.idade >= 18){
            return "Adulto";
        
        }else if(this.idade > 11){
            return "juvenil";
        }else if(this.idade > 8){
            return "infantil";        
        }else{
            return "não pode ser nadador. minimo oito anos";
        }  
                
    }
    /**
     * @return retornar o nome e idade 
     */   
    @Override
    public String toString(){
        return "\nNome: " + this.nome 
            +  "\nIdade: " + this.idade
            +  "\nCategoria: " + this.verificarNadador();
    }
    
    
}