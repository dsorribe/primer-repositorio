/*
MO1: Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
--------------------------------------------------------------------------------------------
MO2: ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.
--------------------------------------------------------------------------------------------
MO3: Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
--------------------------------------------------------------------------------------------
MO4: Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas
terminamos de escribirla tocar 
el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

*/

package guia2;

public class clase2MO {
   
    public static void main(String[] args) {
        
        //MO1 y MO2"
        float pi = 3.14f;
        char digito = 'd';
        int num = 12;
        long largo = 121;
        String cadena = "Sebastián";
        boolean f = false;
        
        //MO3
        int n1 = 100;
        int n2 = 5;
        int res = 0;
        
        res = n1 - n2;
        System.out.println(res);
        
        f = n1 > n2;
        System.out.println(f);
        
        n1++; n2++;
        System.out.println(n1);
        System.out.println(n2);
       
        //MO4
        String nombre = "Manuel";
        int edad = 21; 
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    }  
}
