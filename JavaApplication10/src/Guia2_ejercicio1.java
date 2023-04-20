/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author PichiFly
 */
public class Guia2_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese a continuacion dos numeros: ");
        num1 = read.nextInt();
        num2 = read.nextInt();
        int addition = num1 + num2;
        System.out.println("La suma de esos numeros es: " + addition );
    }
    
}
