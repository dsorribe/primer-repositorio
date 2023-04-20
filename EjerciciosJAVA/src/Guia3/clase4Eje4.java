/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Jav
 */
package guia3;

import java.util.Scanner;

public class clase4Eje4 {
    
    public static void main(String[] args) {
        String frase, x;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        
        if(frase.charAt(0) == 'A') {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        if(frase.substring(1) == "A") {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
