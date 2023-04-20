/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

public class clase9Eje3 {

    public static void main(String[] args) {
        int n = 5;
        int cont1 = 0,cont2 = 0,cont3 = 0,cont4 = 0,cont5 = 0;
        
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);

            int numEntero = 4;
            String numCadena = String.valueOf(vector[i]);

            System.out.println("[" + vector[i] + "]");

            switch (numCadena.length()) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            } 
        }
        System.out.println("Un digito: " + cont1);
            System.out.println("Dos digitos: " + cont2);
            System.out.println("Tres digitos: " + cont3);
            System.out.println("Cuatro digitos: " + cont4);
            System.out.println("Cinco digitos: " + cont5);

    }

}
