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
public class Alumno {
    public String nombre;
    public String dni;
    public String correo;
    
    public Alumno(){
        nombre = null;
        dni = null;
        correo = null;
    }
    
    public Alumno(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }
    
    void mostrarAlumno(){
        System.out.println("Nombre: "+ nombre); 
        System.out.println("DNI: "+ dni);
        System.out.println("Correo: "+ correo); 
    }
    
    static Alumno crearAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del alumno ...");
        String nombre = sc.nextLine(); // 
        System.out.println("Dime el DNI del alumno ...");
        String dni = sc.nextLine();
        System.out.println("Dime el Correo del alumno ...");
        String correo = sc.nextLine();
        return new Alumno(nombre, dni, correo );
    }
  
}
