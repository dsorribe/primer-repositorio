/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia3;

import java.util.Scanner;

public class clase5Eje3Ext {

    public static void main(String[] args) {
        
        String letra;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese una letra");
            letra = leer.next();    
        }while(letra.length()!= 1); 
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("ES IGUAL");
        }else{
            System.out.println("NO ES IGUAL");
        }
        
    }
    
}
