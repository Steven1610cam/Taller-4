public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // COSNTRUCTOR
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad); 
        setNotaPromedio(notaPromedio); 
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { 
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) { 
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0 y 10.");
        }
    }
}


