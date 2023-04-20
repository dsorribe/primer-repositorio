/*
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.
 */
package guia3;


import java.util.Scanner;

public class clase6Eje6Ext {

    public static void main(String[] args) {
        
        int cont, cont1;
        double promedio, personas;
        
        cont = 0;
        cont1 = 0;
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese la estatura " + i + " : ");
            personas = leer.nextInt();
            
            if (personas > 1.60) {
                cont++;
            }else{
                cont1++;
            }
            
        }
    }
    
}
