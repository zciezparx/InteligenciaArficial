/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.util.Scanner;

/**
 *
 * @author Fausto Sánchez Muñoz
 */
public class InteligenciaArtificial {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Alumno pepe = Alumno.crearAlumno();
        pepe.mostrarAlumno(); 
        
        Alumno_IA antonio = new Alumno_IA();
        antonio.crearNotas();
        
    }
    
    
    
}
