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
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
         */
        Scanner leer = new Scanner(System.in);
        int num, i, contador;

        contador = 0;

        do {
            System.out.println("Ingrese un número entero entre 1 y 20:");
            num = leer.nextInt();
            if (num >= 1 && num <= 20) {
                System.out.print(num+" ");
                for (i = 0; i < num; i++) {
                    System.out.print("*");
                }
                contador = contador + 1;
            } else {
                System.out.print("El numero ingresado no es válido.\n");
            }

        } while (contador <= 3);
    }

}
