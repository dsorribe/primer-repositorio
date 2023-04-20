/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 
1600 minutos,
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia3;

import java.util.Scanner;

public class clase5Eje1Ext {

    public static void main(String[] args) {
        int minIngresados, dias, horas, resto;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tiempo en minutos: ");
        minIngresados = leer.nextInt();
        
        horas = minIngresados / 60;
        
        if (horas > 24) {
            dias = horas / 24;
            resto = horas % 24;
            
            System.out.println("Dias: " + dias);
            System.out.println("Horas: " + resto);
        }else{
            System.out.println("Horas: " + horas);
        }
    }
    
}
