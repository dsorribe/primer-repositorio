package guia2;
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/



/**
 *
 * @author LAURA
 */
public class clase3Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int grados= 10;
       double f;
       f = 32 + (9 * grados / 5);
        System.out.println("El equivalente en grados Fahreneit es: " + f);
    }
    
}
