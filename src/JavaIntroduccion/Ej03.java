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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase cualquiera:");
        frase = leer.nextLine();

        System.out.print("En mayúsculas: " + frase.toUpperCase());
        System.out.print(" ");
        System.out.print("En minúsculas: " + frase.toLowerCase());
    }

}
