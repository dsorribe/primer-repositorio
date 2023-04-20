/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario
hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia3;

import java.util.Scanner;

public class clase4Eje5 {
    
    public static void main(String[] args) {
        int num, var, limite;
        
        limite = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite: ");
        num = leer.nextInt();
        
        do{
            System.out.println("Ingrese un numero: ");
            var = leer.nextInt();
            
            limite = var + limite; 
        }while(limite < num);
        
        System.out.println("Numero: " + num);
        System.out.println("Limite: " + limite);
    }
    
}
