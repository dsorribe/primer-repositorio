/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos
. El programa deberá después mostrar el resultado de la suma
*/
package guia2;

import java.util.Scanner;

public class clase3Eje1 {
    public static void main(String[] args){
    
    int x, y, resultado;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el numero 1: ");
    x = leer.nextInt();
    
    System.out.println("Ingrese el numero 1: ");
    y = leer.nextInt();
    
    resultado = x + y;
    
    System.out.println("El resultado es: " + resultado);
    
    }
} 
