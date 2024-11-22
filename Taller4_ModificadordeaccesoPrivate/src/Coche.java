public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidadMaxima(velocidadMaxima); 
    }

   
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima >= 0) { 
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad máxima no puede ser negativa.");
        }
    }

   
    public void acelerar(double incremento) {
        if (incremento > 0) { 
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}

