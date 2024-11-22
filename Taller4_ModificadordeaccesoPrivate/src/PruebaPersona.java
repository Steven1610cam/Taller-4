public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        
       
        System.out.println(p.getNombre()); // Correcto: se usa el método get para acceder a 'nombre'
        // Comentario: Ahora se accede al atributo privado 'nombre' a través de su método público 'getNombre',
        // cumpliendo con el principio de encapsulación.
    }
}