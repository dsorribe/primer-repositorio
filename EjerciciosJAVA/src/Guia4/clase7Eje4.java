/*
 Crea una aplicación que nos pida un número "enteros" por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 
25 es divisible entre 5, sin embargo, 17 si es primo.

"Dividir al número dado por todos los números menores o iguales a su raíz cuadrada, si ninguno de los cocientes 
es entero se puede deducir que el número es primo."

 */
package guia4;

import java.util.Scanner;

public class clase7Eje4 {

    public static void main(String[] args) {
        int num;
        
        Scanner read = new Scanner(System.in);
        
       
        System.out.println("Ingrese un numero: ");
        num = read.nextInt();
        
        System.out.println("Numero primo? : " + primo(num));    
    }
    public static boolean primo(int num){
        
        if (num < 1) {
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }
}
