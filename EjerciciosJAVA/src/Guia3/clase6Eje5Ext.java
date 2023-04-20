/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */

package guia3;

import java.util.Scanner;

public class clase6Eje5Ext {
    
    public static void main(String[] args) {
        
        String socio;
        int importe;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese que tipo de socio es A, B o C: ");
        socio = leer.next();
        
        switch(socio){
            case "a":
                System.out.println("Cuanto abona: ");
                importe = leer.nextInt();
                
                System.out.println("El total seria: " + importe / 2);
                break;
            case "b":
                System.out.println("Cuanto abona: ");
                importe = leer.nextInt();
                
                System.out.println("El total seria: " + 0.35*importe);
                break;
            case "c":
                System.out.println("Cuanto abona: ");
                importe = leer.nextInt();
                
                System.out.println("El total seria: " + importe);
                break;           
        }
    }
    
}
