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
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/
        Scanner leer = new Scanner(System.in);
        int[] vector; 
       vector = new int[101]; 
       
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
    }
    }   
}
