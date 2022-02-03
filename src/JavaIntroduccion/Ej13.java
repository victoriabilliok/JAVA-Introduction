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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
        Scanner leer = new Scanner(System.in);

        int i, num, suma;

        System.out.println("Ingrese un valor límite positivo:");
        i = leer.nextInt();

        suma = 0;

        do {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma = suma + num;
            System.out.println(suma);
        } while (suma <= i);

    }
}
