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
public class Ejercicio13_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[8];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i <= 7; i++) {
            System.out.println("Ingrese el nombre del " + (i + 1) + " participante");
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i <= 7; i++) {
            System.out.print(" [ " + equipo[i] + " ]");

        }
        System.out.println("\n");
    }
    
}
