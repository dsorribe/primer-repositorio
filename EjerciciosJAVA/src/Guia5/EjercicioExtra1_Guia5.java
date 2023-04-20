package Guia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PichiFly
 */
public class EjercicioExtra1_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n, suma=0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese el tamaño del vector: ");
            n = leer.nextInt();
        }while(n<1);

        int[] vector = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Ingrese el valor de la posicion: " +(i+1));
             vector[i] = leer.nextInt();
             suma+=vector[i];
        }

        System.out.println("La suma es:" +suma);
    }    
}
    
    

