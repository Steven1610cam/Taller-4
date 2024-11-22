public class PruebaCoche {
    public static void main(String[] args) {
        
        Coche coche = new Coche("Toyota", "Corolla", 120.0);
        
        
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

       
        coche.acelerar(20); 
        System.out.println("Velocidad Máxima después de acelerar: " + coche.getVelocidadMaxima());

       
        coche.acelerar(-10); 
    }
}