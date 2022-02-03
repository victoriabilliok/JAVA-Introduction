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
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).*/
        Scanner leer = new Scanner(System.in);
        int i, j, n;
        boolean log;

        System.out.println("Ingrese el tamaño de la matriz cuadrada:");
        n = leer.nextInt();

        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];

        System.out.println("Matriz Original:\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 99 + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        //transponer la matriz
        System.out.println("\nMatriz Transpuesta:\n");
        matrizT = matriz;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
        
        log = false;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (matriz[i][j]*-1 == matriz[j][i]) {
                    log = true;
                }
            }
        }

        if (log = true) {
            System.out.println("Es asimetrico.");
        }
    }
}


