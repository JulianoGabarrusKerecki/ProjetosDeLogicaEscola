public class Animal{
    
    protected String rasa; 
    protected String sexo;
    protected String cor;
    
    private String barulhoGato;
    private String acaoGato;
    private String tamanhoGato;
    
    private String ondeMijaCachorro;
    private String vantagemCachorro;
    private String oqueMaisGostaCachorro;
    
    public Animal(){    
     
    }
    
    public String getRasa(){
        return this.rasa = rasa;
    }
        public void setRasa(String rasa){
        this.rasa = rasa;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    
    //GATO
    public String getBarulhoGato(){
        return this.barulhoGato;
    }
    public void setBarulhoGato(String barulhoGato){
         this.barulhoGato = barulhoGato;
    }
    
    public String getAcaoGato(){
        return this.acaoGato;
    }
    public void setAcaoGato(String acaoGato){
        this.acaoGato = acaoGato;
    }
    
    public String getTamanhoGato(){
        return this.tamanhoGato;
    }
    public void setTamanhoGato(String tamanhoGato){
        this.tamanhoGato = tamanhoGato;
    }
    
    //CACHORRO
    
    public String getOndeMijaCachorro(){
        return this.ondeMijaCachorro;
    }
    public void setOndeMijaCachorro(String ondeMijaCachorro){
        this.ondeMijaCachorro = ondeMijaCachorro;
    }
    
    public String getVantagemCachorro(){
        return this.vantagemCachorro;
    }
    public void setVantagemCachorro(String vantagemCachorro){
        this.vantagemCachorro = vantagemCachorro;
    }
    
    public String getOqueMaisGostaCachorro(){
        return this.oqueMaisGostaCachorro;
    }
    public void setOqueMaisGostaCachorro(String oqueMaisGostaCachorro){
        this.oqueMaisGostaCachorro = oqueMaisGostaCachorro;
    }
    
    
   @Override
    public String toString(){
        return "###ANIMAL###"
        + "\nRasa: " + this.rasa
        + "\nSexo: " + this.sexo
        + "\nCor: " + this.cor;
       
        
    }
}