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
public class EjercicioExtra7_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int num = leer.nextInt();
        int[] vector = new int [num];
        
            for (int i = 0; i < num; i++) {
                if (i <=1){
                    vector[i]=1;
                }else{
                vector[i]=vector[i-1]+vector[i-2];
                }
                
            }
            System.out.println("los primeros " + num + " numeros de Fibonacci son: ");
            for (int i = 0; i < num; i++) {
                System.out.print(" [ " + vector[i] + " ] "); 
            
            }
            
            System.out.println(" ");
    }
}
