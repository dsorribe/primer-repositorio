/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guia2;

import java.util.Scanner;

public class clase3Eje2 {
    public static void main(String[]args){
    
    String nombre;
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese tu nombre: ");
        nombre =  leer.next();
        
        System.out.println("Tu nombre es: " + nombre);
    }
}
