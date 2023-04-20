/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package guia3;

import java.util.Scanner;

public class clase4Eje2 {
    public static void main(String[] args) {
        String frase;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        
        //Opcion 1
        if ("eureka".equalsIgnoreCase(frase)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");    
        }
        
        //Opcion 2
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");    
        }
    }
    
}
