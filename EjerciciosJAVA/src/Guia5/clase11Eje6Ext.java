/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 
caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), 
Length() y Math.random().
 */
package guia5;

import java.util.Scanner;

public class clase11Eje6Ext {

    public static void main(String[] args) {
        String palabra;
        int n = 10;
        int m = 10;
        int num;

        Scanner read = new Scanner(System.in);

        String matriz[][] = new String[n][m];

        num = (int) (Math.random() * 10+1);

        for (int i = num; i < n; i++) {
            do {
                System.out.println("ingrese una frase: ");
                palabra = read.next();
            } while (palabra.length() < 2 || palabra.length() > 6);

            for (int j = 0; j < m; j++) {
                matriz[i][j] = palabra.substring(j);
                
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == "" || matriz[i][j] == " ") {
                    matriz[i][j] = "0";
                }
            }
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
