public class Principal{
    
    public static void main(String args[]){
      
        System.out.println("\f");
        // Pessoa juridica      
         
      
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
         
        pessoaJuridica.setRazaoSocial("Empresarial");
        pessoaJuridica.setCnpj("233.456.789.12");
        pessoaJuridica.setInscricao("Mei");
        pessoaJuridica.setEstadual("Rio Grande do Sul ");
        pessoaJuridica.setCapitalInicial("Deposito");        
         System.out.println(pessoaJuridica);
        
        
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        
        pessoaFisica.setEstadoCivil("Solteiro" );       
        pessoaFisica.setCpf("123.456.456.56");       
        pessoaFisica.setDataDeNascimento("20/11/1996");
        System.out.println(pessoaFisica);
        System.out.println(pessoaFisica.getEstadoCivil());
       
        
        
        
        
             
        
        
        Cliente cliente = new Cliente();
        cliente.codigoCliente =("456");
        cliente.nome = ("joao");
        cliente.profissao = ("Tecnico de informatica");
        System.out.println(cliente);
        
        
    }
}