package logica;
import java.time.LocalDate;
import logica.Persona;
import logica.Hombre;
import logica.Hombre;

public class Principal {

    // Constructor con el caso
    public Principal() {
        try {
            // Caso válido
            Hombre h1 = new Hombre(80, 175, LocalDate.of(1995, 5, 20));
            System.out.println("Edad del hombre: " + h1.calcularEdad());
            System.out.println("TMB del hombre: " + h1.calcularTMB());
            
            // Caso inválido
            Mujer m1 = new Mujer(50, 200, LocalDate.of(1990, 3, 15));
            System.out.println("Edad de la mujer: " + m1.calcularEdad());
            System.out.println("TMB de la mujer: " + m1.calcularTMB());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //main ()
    public static void main(String[] args) {
        new Principal();
    }
}
