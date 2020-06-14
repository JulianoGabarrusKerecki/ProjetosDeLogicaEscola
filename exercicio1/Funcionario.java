public class Funcionario extends Pessoa {
    //numero de registro, salario fixo, calcularFGTS
    
    private int registro;
    private int salarioFixo;
    
    
    
   
    
    
    public int getRegistro(){
        return this.registro;
    }
    public void setRegistro(int registro){
        this.registro = registro;    
    }
    public int getSalarioFixo(){
        return this.salarioFixo;
    }
    public void setSalarioFixo(int salarioFixo){
        this.salarioFixo = salarioFixo;
    }
 
    public double calcularFGTS(){
        return this.salarioFixo * 0.08;
    }
  
    
    @Override
    public String toString() {
        return "#########FUNCIONARIO######"
             + "Registro: " + this.registro    
             + "\nSalario Fixo: " + this.salarioFixo
             + "\nCusto do FGTS: " + this.calcularFGTS()
             + "\nNome: " + this.nome
             + "\nSobrenome: " + this.sobrenome
             + "\nEmail" + this.email
             + "\nDAta de nacimento : " + this.dataDeNacimento;

    
    }
  
}