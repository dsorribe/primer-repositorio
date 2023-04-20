/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia5;


import java.util.Scanner;

public class clase10Eje6 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int var = 0;
        int n, aux = 0, aux1 = 0, aux2 = 0, aux3 = 0;
        Boolean verdad = true;
        
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                do{
                    n = read.nextInt();
                }while(n<1 || n > 9 );
                
                matriz[i][j] = n;
            }
        }
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i==0) {
                    var = var + matriz[i][j];
                }
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <=2; j++) {
                if ( verdad == true) {
                    aux = aux + matriz[i][j];
                    aux2 = aux2 + matriz[j][i];
                }
                if (i==j) {
                    aux1 = aux1 + matriz[i][j];
                }
          
            }
         
            if (aux != var || aux2 != var) {
                verdad = false;
            }
            aux2 = 0;
            aux = 0;
        }
        
        for (int i = 0, j = 2; i <= 2 && j >= 0; i++, j--) {
            aux3 = aux3 + matriz[i][j];
        }
        
        if (aux3 != var) {
            verdad = false;
        }
  
        System.out.println("matriz??" + verdad);
    }
    
}
