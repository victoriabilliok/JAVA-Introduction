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
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
         */
        Scanner leer = new Scanner(System.in);
        int i, j, lado;

        System.out.println("Ingrese el tamaño por lado del cuadrado:");
        lado = leer.nextInt();

        for (i = 0; i < lado; i++) {
            System.out.print("*");
        }
            System.out.println();
        for (i = 0; i < lado - 2; i++) {
            System.out.print("*");
            for (j = 0; j < lado - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (i = 0; i < lado; i++) {
            System.out.print("*");
        }
        }

    }

