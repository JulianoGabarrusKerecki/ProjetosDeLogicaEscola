public class Gato extends Animal{
    public Gato(){
        super();
    }
    @Override
     public String toString(){
         return "###DADOS GATO### "
        + "\nRasa do gato: " + this.getBarulhoGato()
        + "\nAçao do gato: " + this.getAcaoGato()
        + "\nTamanho gato: " + this.getTamanhoGato();
    }
        
    
}
