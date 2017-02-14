package practica0;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fausto Sánchez Muñoz
 */

public class Main {
    

    public static void main(String[] args) throws IOException {
        Alumno pepe = Alumno.crearAlumno(); //Creamos un objeto de la clase Alumno llamando al método crearAlumno
        pepe.mostrarAlumno(); //llamamos al metodo mostrarAlumno
        
        Alumno_IA antonio = new Alumno_IA(); //Creamos un nuevo objeto de la subclase Alumno
        antonio.crearNotas(); //llamamos al metodo para pasarle 4 notas
        antonio.leerArchivo(); //llamamos al metodo para leer y escribir en el fichero
        
    }
}
