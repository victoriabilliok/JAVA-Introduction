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
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.*/
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        int i, j;

        System.out.println("Matriz Original:\n");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 99 + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        //transponer la matriz
        int aux;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("\nMatriz Transpuesta:\n");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
