
public class Cliente{
    
    
    protected String codigoCliente;
    protected String nome;
    protected String profissao;
    
          
    private String estadoCivil;
    private String cpf;
    private String dataDeNascimento;
    
 
    
    private String razaoSocial;
    private String cnpj;
    private String inscricao;
    private String estadual;
    private String capitalInicial;
    
    public Cliente (){
        
    }
    
    public Cliente(String razaoSocial){
         this.razaoSocial = razaoSocial; 
    }
    public String getCodigoCliente(){
        return this.codigoCliente;
    }
    public void setCodigoCliente(String codigoCliente){
        this.codigoCliente = codigoCliente;
    }


    

    public String getRazaoSocial(){
       return this.razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
         this.cnpj = cnpj;
    }
    public String getInscricao(){
        return this.inscricao;
    }
    public void setInscricao(String inscricao){
        this.inscricao = inscricao;
    }
    
    public String getEstadual(){
        return this.estadual;
    }
    public void setEstadual(String estadual){
        this.estadual = estadual;
    }
    
    public String getCapitalInicial(){
        return this.capitalInicial;
    }
    public void setCapitalInicial(String capitalIncial){
        this.capitalInicial = capitalInicial;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
     public String getCpf(){
        return this.cpf;
    }    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getDataDeNascimento(){
        return this.dataDeNascimento;
    }    
    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
    

    
    
    @Override 
    public String toString(){
        return"####CLIENTE####" 
            + "\nCodigo cliente: " + this.codigoCliente
            + "\nNome: " + this.nome
            + "\nProfissão: " + this.profissao;        
  
       }

    }
    
    
    
