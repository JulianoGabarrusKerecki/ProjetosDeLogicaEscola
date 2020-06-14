public class PessoaFisica extends Cliente{
    //<- Pessoa Fisica estadoCivil, CPF, dataNascimento
    
    public PessoaFisica(){
        super();
    }
    
    @Override
    public String toString(){
       return "##PESSOA FISICA##"
        + "\nEstado Civil: " + this.getEstadoCivil()
        + "\nCPF: " + this.getCpf()
        + "\nData de nascimento: " + this.getDataDeNascimento();
    }
    
}