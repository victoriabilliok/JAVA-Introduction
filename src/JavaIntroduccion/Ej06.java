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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
        Scanner leer = new Scanner(System.in);

        int num1, num2, mayor;

        System.out.println("Ingrese los números que desea comparar:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        /*if (num1 != num2) {
            if (num1 > num2) {
            mayor = num1;
            System.out.println("El número más alto es: "+mayor);
        } else {
            mayor = num2;
            System.out.println("El número más alto es: "+mayor);
        } }
        if (num1 == num2){
        System.out.println("Los numeros son iguales.");
        }*/
        if (num1 != num2) {
            mayor = Math.max(num1, num2);
            System.out.println("El número más alto es: " + mayor);
        } else {
            System.out.println("Los numeros son iguales.");
        }
    }
}
