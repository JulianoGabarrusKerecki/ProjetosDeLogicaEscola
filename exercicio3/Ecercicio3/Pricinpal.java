public class Pricinpal{
    
    public static void main(String args[]){
        System.out.println("\f");
        
        
        //CLASS GATO
        Gato gato = new Gato();
        gato.setBarulhoGato("Syames");
        gato.setAcaoGato("Correr pela casa quinem loko");
        gato.setTamanhoGato("Pequeno");
       
        System.out.println(gato);
        
        //CLASS CACHORRO
        Cachorro cachorro = new Cachorro();
        cachorro.setOndeMijaCachorro("Na roda do teu caro");
        cachorro.setVantagemCachorro("Ele pode ser teu melhor amigo");
        cachorro.setOqueMaisGostaCachorro("Comida");
        System.out.println(cachorro);
        
     
        
        
        
        
        //ClASS ANIMAL
        Animal animal = new Animal();
        animal.setRasa("Animais de casa");
        animal.setSexo("Sexo Femea");
        animal.setCor("variada");
        
        
        System.out.println(animal);
    }
}