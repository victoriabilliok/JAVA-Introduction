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
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        int num, suma, cont;

        suma = 0;

        for (cont = 0; cont < 20; cont++) {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                System.out.println("Se capturó el numero cero.");
                break;
            }
        }  
        System.out.println("La suma de los números leídos es" + suma);
        }
    }


