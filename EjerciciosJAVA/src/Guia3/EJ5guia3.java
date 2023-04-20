/*
 *Escriba un programa en el cual se ingrese un valor límite positivo, 
 *y a continuación solicite números al usuario hasta que la suma de los números 
 *introducidos supere el límite inicial.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class EJ5guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int suma = 0;
 
        do {
          System.out.println("Ingrese otro numero");
         int num1 = leer.nextInt();
          suma = suma + num1;
        } while (suma<50);
        System.out.println("A superado el limite");
        
    }
    
}
