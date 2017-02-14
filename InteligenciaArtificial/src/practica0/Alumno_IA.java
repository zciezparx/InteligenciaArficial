/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    void leerArchivo() throws FileNotFoundException, IOException{
      String cadena;
      String cadenaDni="";
      String ruta = "./pares.txt";
      File archivo = new File(ruta);
      BufferedWriter bw = null;
      bw = new BufferedWriter(new FileWriter(archivo));
      FileReader f = new FileReader("./datos.txt");
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          for (int i = 0; i < cadena.length(); i++) {
              if(Character.isDigit(cadena.charAt(i))){
                  dni+=cadena.charAt(i);
                  if(dni.length()==8 && (Integer.parseInt(dni)%2==0)){
                        bw.write(cadena + "\r\n");
                      cadenaDni+=cadena;
                  }
              }else{
                  dni="";
              }
          }
      }
      bw.close();
      b.close();
    }
}
