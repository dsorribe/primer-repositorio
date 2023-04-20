/*
 
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben devolver
sus resultados 
para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;

public class clase7Eje1 {

    public static void main(String[] args) {
       
        int opcion, num1, num2, retorno;
        
       Scanner read = new Scanner(System.in);
       
        do{
            
        System.out.println("Ingrese 2 numeros: ");
        num1 = read.nextInt();
        num2 = read.nextInt();
        
       //MENU
       System.out.println("MENU");
       System.out.println("1 - Sumar");
       System.out.println("2 - Restar");
       System.out.println("3 - Division");
       System.out.println("4 - Multiplicacion");
       System.out.println("5 - Salir");
       System.out.println("opcion - - >");
        System.out.println("");
       opcion = read.nextInt();
       
        
       
            switch(opcion){
                 case 1:
                    retorno = sumar(num1,num2);
                     System.out.println("La suma es: " + retorno);
                break;
                case 2:
                    retorno = restar(num1,num2);
                    System.out.println("La resta es: " + retorno);
                break;
                 case 3:
                    retorno = dividir(num1,num2);
                    System.out.println("La division es: " + retorno);
                 break;
                case 4:
                    retorno = multiplicar(num1,num2);
                    System.out.println("La multi es: " + retorno);
                break;
           
                 default:
                     System.out.println("");
            }
        }while(opcion != 5);
    }
    
    public static int sumar(int num1, int num2){
    int suma;
        
    suma = num1 + num2;

    return suma;
    }
    public static int restar(int num1, int num2){
    int resta;
        
    resta = num1 - num2;

    return resta;
    }
    public static int dividir(int num1, int num2){
    int dividir;
        
    dividir = num1 / num2;

    return dividir;
    }
    public static int multiplicar(int num1, int num2){
    int multi;
        
    multi = num1 * num2;

    return multi;
    }
}

