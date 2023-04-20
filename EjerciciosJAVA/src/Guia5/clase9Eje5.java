/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;


public class clase9Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
      Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
      traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
      La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
      sus filas por columnas (o viceversa).
         */

        int[][] matrizA = {{0, -2, 4}, {2, 0, 2}, {-4, -4, 0}};

        boolean control = true;

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {

                if (matrizA[f][c] != (matrizA[c][f] * -1)) {
                    control = false;

                }
            }
        }
        if (control) {
            System.out.println("la matriz es antisimetrica");
        } else {
            System.out.println("no es antisimetrica");
        }

    }

}


    

