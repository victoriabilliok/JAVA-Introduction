/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntroduccion;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/

        Scanner leer = new Scanner(System.in);
        int i, j, cont1, cont2, cont3, cont4, cont5;

        System.out.println("Ingrese el tamaño del vector:");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);
            System.out.print(vector[i] + " ");
        }
        
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        
        for (i = 0; i < n-1; i++){
        if (vector[i] < 10) {
            cont1 = cont1 + 1;
        } else if (vector[i] < 100) {
            cont2 = cont2 + 1;
        } else if (vector[i] < 1000) {
            cont3 = cont3 + 1;
        } else if (vector[i] < 10000) {
            cont4 = cont4 + 1;
        } else {
            cont5 = cont5 + 1;
        }
    }
        System.out.println("Dentro del vector hay:\n" +cont1+" numeros de 1 dígito.\n"+cont2+ " numeros de 2 dígitos.\n"+cont3+ " numeros de 3 dígitos.\n"+cont4+" numeros de 4 digitos.\n"+cont5+ " numeros de 5 dígitos.");
}
}
