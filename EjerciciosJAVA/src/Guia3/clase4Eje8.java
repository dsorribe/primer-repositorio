/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos 
por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia3;

public class clase4Eje8 {

    public static void main(String[] args) {
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==0 || j == 0 || j == 3 || i == 3) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
