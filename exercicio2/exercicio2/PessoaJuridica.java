 public class PessoaJuridica extends Cliente{
    
    public PessoaJuridica(){
        super();
    }

    @Override
    public String toString(){
        return "##PESSOA JURIDICA##"
            +  "\nRazão social: " + this.getRazaoSocial()
            +  "\nCNPJ: " + this.getCnpj()
            +  "\nInscrição: " + this.getInscricao()
            +  "\nEstadual: " + this.getEstadual()
            +  "\nCapital inicial" + this.getCapitalInicial();
    }
    
    
    
    
}