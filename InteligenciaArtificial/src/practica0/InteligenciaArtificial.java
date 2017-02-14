package practica0;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fausto Sánchez Muñoz
 */

public class InteligenciaArtificial {
    

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Alumno pepe = Alumno.crearAlumno();
        pepe.mostrarAlumno();
        
        Alumno_IA antonio = new Alumno_IA();
        antonio.crearNotas();
        antonio.leerArchivo();
        
    }
}
