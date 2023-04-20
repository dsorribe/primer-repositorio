package Guia4;


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
public class ejercicio4_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        num = leer.nextInt();


       if(evaluarPrimo(num)){
           System.out.println("es primo");
       } else {
           System.out.println("no es primo");
       }

    }

    public static boolean evaluarPrimo(int num){

       if (num<=1) {
           
           return false;

       } 
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
    

