/**
 *  @author  (Juliano Gabarrus)
 * @version (1.0 01/06/2020)
 * 
 */
 public class Trimestre{
    
        String mes;
    
       public Trimestre() {
        
       }    
       public String getMes(){
         return this.mes;
       }
    
       public void setMes(String mes){
         this.mes = mes;
       }
       /**
       * @return retornar a classificaçao do trimestre
       **/
        public String verificarTrimestre(){
        if(this.mes == "janeiro" | "fevereiro" | "março" ){
            return "1º trimestre";
        }else if(this.mes == "abril" | "maio" |"junho"){
            return "2º trimestre";
        }else if(this.mes == "julho" | "agosto" | "setembro"){
            return "3º trimestre";
        } else if(this.mes == "outubro" | "novembro" | "dezembro"){
            return "4º trimestre";
        }
       }
           
     
     
   
         @Override
         public String toString(){
              return "\nMes: " + this.mes
              + "\nTrimestre: " + this.verificarTrimestre();
            
        }
     
}