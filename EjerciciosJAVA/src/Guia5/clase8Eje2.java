/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le 
pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

public class clase8Eje2 {

    public static void main(String[] args) {
        
      int n = 10;
      int numero, cont = 0;
      int [] vector = new int[n];
      
      Scanner read = new Scanner(System.in);
      
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10+1);
            System.out.println("[" + vector[i] + "] = " + i);
        }
        
        System.out.println("Ingrese un numero a buscar entre 1 y 10: ");
        numero = read.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (numero == vector[i]) {
                System.out.println("El numero se encuentra en: [" + i + "]");
                cont++;
            }
        }
        System.out.println("El numero se encontro: " + cont + " veces");
    }
    
}
