/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas
y frenar cuando el usuario ingrese la palabra “No”.


 */
package guia4;

import java.util.Scanner;

public class clase7Eje2 {
    
    public static void main(String[] args) {
       String opcion;
       
       
       Scanner read = new Scanner(System.in);
            
        do{
            datos();
            
            do{
                System.out.println("Quiere seguir?: ");
                opcion = read.next();
            }while(!opcion.equalsIgnoreCase("no") && !opcion.equalsIgnoreCase("si"));
            
        }while(!opcion.equalsIgnoreCase("no"));  
    }
    
    public static void datos(){
        int edad;
        String nombre;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = read.next();
        
        System.out.println("Ingrese su edad: ");
        edad = read.nextInt();
        
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " es menor de edad");
        }  
    } 
}
