public class Pricipal  {
    
    public static void main(String args[]){
                
              
        
        System.out.println("\f");
        
        Funcionario funcionario = new Funcionario();
        //professor
        funcionario.setRegistro(121212);
        funcionario.setSalarioFixo(1888);
        //pessoa
        funcionario.nome = "Juliano";
        funcionario.sobrenome = "Gabarrus";
        funcionario.email = "julianogke@hotmail.com";
        funcionario.dataDeNacimento = "04/12/1999";
        System.out.println(funcionario);
        
        //aluno
        
        Aluno aluno = new Aluno();
        aluno.setNota1(10);
        aluno.setNota2(10);
        System.out.println(aluno);
        
        //professor
        
        Professor professor = new Professor();
        
        professor.setHoraTraBalhada(160);
        professor.setValorHora(11.80);
        
        System.out.println(professor);
        
      
        
        
  
        
        
              
 
                
    }      
    
  

}