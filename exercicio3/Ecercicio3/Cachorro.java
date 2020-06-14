public class Cachorro extends Animal{
    
    public Cachorro(){
        super();
    }
    
     @Override
     public String toString(){
         return "###DADOS CACHORRO### "
        +"\nOnde mija o cachorro: " + this.getOndeMijaCachorro()
        + "\nVantagem de ter um cachorro: " + this.getVantagemCachorro()
        + "\nO que mais o cachorro gosta: " + this.getOqueMaisGostaCachorro();
    
    }
        
    
}