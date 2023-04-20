/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas 
enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,  
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final 
de los envíos 
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas re cibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia3;

import java.util.Scanner;

public class clase4Eje7 {
    
    public static void main(String[] args) {
        String frase;
        int x, contCorrectas, contIncorrectos;
        
        contCorrectas = 0;
        contIncorrectos = 0;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese la frase de 5 caracteres y que empiece con X y teminte con O");
            frase = leer.next();
            
            x = frase.length();
            
            if (x>5 || frase.substring(0,1).equalsIgnoreCase("X") != true || frase.substring(x-1).equalsIgnoreCase("O") != true) {
                contIncorrectos = contIncorrectos + 1;
            }
            if ( x == 5 || frase.substring(0,1).equalsIgnoreCase("X") == true || frase.substring(x-1).equalsIgnoreCase("O") == true) {
                contCorrectas = contCorrectas + 1;
            }
            
            
        }while(frase.equalsIgnoreCase("&&&&&") != true);
        
        System.out.println("Correcta: " + contCorrectas);
        
        System.out.println("Incorrecta: " + contIncorrectos);
        
    }
   
}
