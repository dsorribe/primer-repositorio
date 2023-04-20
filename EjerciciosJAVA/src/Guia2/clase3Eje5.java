package guia2;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */


import java.util.Scanner;

public class clase3Eje5 {
    public static void main(String[]args){
    int num;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un numero: ");
    num = leer.nextInt();
    
    System.out.println("Por 2: " + num*2);
    System.out.println("Por 3: " + num*3);
    
    //Math.sqrt() : raiz cuadrada
    System.out.println("Raiz cuadrada? : " + Math.sqrt(num)); 
    
    }
}
