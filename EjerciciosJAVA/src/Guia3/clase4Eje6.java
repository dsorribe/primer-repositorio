/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’
se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia3;

import java.util.Scanner;

public class clase4Eje6 {

    public static void main(String[] args) {
        int num, num1, opcion;
        String letra;
        
        letra = "N";
        
        Scanner leer = new Scanner(System.in);
        
        do{
            
        System.out.println("ingrese el primer num: ");
        num = leer.nextInt();
        
        System.out.println("ingrese el segundo num: ");
        num1 = leer.nextInt();
        
        //MENU
        System.out.println("MENU");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("");

        System.out.print("Opcion --> ");
        opcion = leer.nextInt();
        
        switch (opcion) {
        	case 1:
                System.out.println("La suma es: " + (num + num1));
            break;

        	case 2:
                System.out.println("La resta es: " + (num - num1));
            break;
            
                case 3:
                System.out.println("La multiplicacion es: " + (num * num1));
            break;
            
                case 4:
                System.out.println("La division es: " + (num / num1));
            break;
            
                case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                letra = leer.next();
               
            break;
            
        	default:
                 System.out.println("El valor ingresado en la variable opcion es diferente a todos los casos analizados por el switch");
            }
        
        }while(letra.equalsIgnoreCase("S")!= true );
        
    }

}
