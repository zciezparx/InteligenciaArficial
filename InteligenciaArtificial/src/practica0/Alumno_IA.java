/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.util.Scanner;

/**
 *
 * @author zciez
 */
public class Alumno_IA extends Alumno{
    public String grupoP;
    public double notaP;
    
    
    void crearNotas(){
        Scanner sc = new Scanner(System.in);
        int resultado=0;
        double notas[] = new double[4];
        for (int i = 0; i < 4; i++) {
           System.out.println(i+1+"º nota:");
             notas[i] = Double.valueOf(sc.nextLine()); 
             resultado+=notas[i];
        }
        notaP=resultado/4;
        System.out.println("La media es" + notaP);
        
        
    }
}
