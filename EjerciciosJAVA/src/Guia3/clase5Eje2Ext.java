/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, 
realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome 
el valor de B. Mostrar los valores iniciales y los valores 
finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3;

public class clase5Eje2Ext {
    
    public static void main(String[] args) {
       int A,B,C,D,aux;
       
       aux = 0;
    
       A = 1;
       B = 9;
       C = 8;
       D = 56;
       
        System.out.println("A -" + A);
        System.out.println("B -" + B);
        System.out.println("C -" + C);
        System.out.println("D -" + D);    
        
        System.out.println("");
                                
       aux = B;
       
       B = C;
       C = A;
       A = D;
       D = aux;
       
        System.out.println("A -" + A);
        System.out.println("B -" + B);
        System.out.println("C -" + C);
        System.out.println("D -" + D);       
    }
    
}
