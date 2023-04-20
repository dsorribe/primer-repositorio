package guia2;
/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



public class clase3Eje3  {

    public static void main(String[] args) {
      String frase, fraseM, frasem; //defino variables del tipo string
      
      Scanner leer = new Scanner(System.in); // defino scanner leer
      
        System.out.println("Ingrese una frase: "); // Imprimo en pantalla la orden al usuario
        frase = leer.next(); // guardo en la variable frase el valor que el usuario ingresa por teclado
        
        fraseM = toUpperCase(frase); // convierto frase a letras may�sculas
        frasem = toLowerCase(frase); // convierto frase a letras min�scula
        
        //ejemplo 1
        System.out.println("La frase en min�scula es: " + toLowerCase(frase)); //Imprimo en pantalla  la frase en min�scula
        System.out.println("La frase en may�scula es: " + toUpperCase(frase)); // Imprimo en pantalla la frase en may�scula
        
        //ejemplo 2
        System.out.println("La frase en min�scula es: " + frasem); //Imprimo en pantalla  la frase en min�scula
        System.out.println("La frase en may�scula es: " + fraseM); // Imprimo en pantalla la frase en may�scula
    }
    
}