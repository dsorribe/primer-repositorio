package Guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PichiFly
 */
public class ejercicio2_Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Diseñe una función que pida el nombre y la edad de N 
        personas e imprima los datos de las personas ingresadas
        por teclado e indique si son mayores o menores de edad. 
        Después de cada persona, el programa debe preguntarle al usuario 
        si quiere seguir mostrando personas y frenar cuando el usuario 
        ingrese la palabra “No”.
        */
        
     Scanner leer = new Scanner(System.in);
     String nombre;
     String apellido;
     String edad;
     boolean check=true;
     
     //arranca el bucle
    while (check){
         System.out.print("nombre: ");
        nombre = leer.next();
         System.out.print("apellido: ");
        apellido = leer.next();
         System.out.print("edad: ");
        edad = leer.next();
        check = nombres(nombre, apellido, edad); 
     }
          
    }
    //funcion
    public static boolean nombres (String name, String lastname, String age){
        Scanner leer = new Scanner(System.in);
        int edad = Integer.parseInt(age);
        String confirmacion="";
        boolean Check;
        
        if(edad<18){
            System.out.println("La siguiente persona es menor de edad");
        }else{
            System.out.println("La siguiente persona es mayor de edad");
        }
        
       System.out.println("nombre: "+name+"\napellido: "+lastname+"\nedad: "+age);
     
       
       System.out.println("Desea seguir agregando personas?(Si,No)");
      while(!confirmacion.toUpperCase().equals("SI")&& !confirmacion.toUpperCase().equals("NO") ){
          confirmacion = leer.next();
    }
      Check = confirmacion.toUpperCase().equals("SI");
       return Check; 
    }
}
