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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
        Scanner leer = new Scanner(System.in);
        String frase, cont;
        boolean log;

        System.out.println("Ingrese la contraseña:");
        frase = leer.nextLine();

        cont = "eureka";
        if (frase.equals(cont)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
