/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia3;

import java.util.Scanner;

public class clase6Eje7Ext {

    public static void main(String[] args) {
        
       double  num, max, min, promedio; 
       int n, i;
       
       i = 0;
       max = 0;
       min = 0;
       promedio = 0;
       
       
       Scanner read = new Scanner(System.in);
       
       System.out.println("Ingrese la cantidad de numeros a calcular: ");
       n = read.nextInt();
       
       
       /*  *****Version for*****
        for (int i = 0; i <= n; i++) {
            System.out.println("Ingrese el valor " + i + " :");
            num = read.nextDouble();
            
            if (i == 0) {
                min = num;
            }
            
            if (num<min) {
                min = num;
            }
            
            if (num > max) {
                max = num;
            }
            
        } */
        
       do{
            System.out.println("Ingrese el valor " + i + " :");
            num = read.nextDouble();
            
            if (i == 0) {
                min = num;
            }
            
            if (num<min) {
                min = num;
            }
            
            if (num > max) {
                max = num;
            }
            i++;
        }while(i <= n);
       
        System.out.println("Max; " );
       
    }
    
}
