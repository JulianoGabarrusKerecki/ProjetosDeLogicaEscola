

public class Professor extends Pessoa{
    
    private double horaTrabalhada;
    private double valorHora;
    
    public double getHoraTraBalhada(){
        return this.horaTrabalhada;
    }
    public void setHoraTraBalhada(double horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    //numero de registro, numero de horas trabalhadas, 
    //valor hora, calcular salario bruto, calcularFGTS
    public double salarioBruto(){
        return this.horaTrabalhada * this.valorHora;
    }
    
    public double valorFGTS(){
        return this.salarioBruto() * 0.08;
    }
    
    @Override
    public String toString(){
        return "###########PROFESSOR##########" 
             + "\nHora de trabalhada: " + this.horaTrabalhada
             + "\nValor hora: " + this.valorHora
             + "\nSalario Bruto: " + this.salarioBruto()
             + "\nValor do FGTS: " + this.valorFGTS();
        
    }
    

   

   
}

