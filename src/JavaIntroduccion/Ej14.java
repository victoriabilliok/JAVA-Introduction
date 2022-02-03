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
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
        Scanner leer = new Scanner(System.in);
        int num1, num2, menu;
        String respuesta = "";

        System.out.println("Ingrese dos números enteros positivos:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("Qué operación desea realizar\n" + "MENU\n"
                    + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("La suma de los números es:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es:" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es:" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("La división es:" + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por 0");
                    }
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir?S/N");
                    respuesta = leer.next();
                    respuesta = respuesta.toUpperCase();
                    break;
                default:
                    System.out.println("El número ingresado no es válido");
                    break;
            }
        } while (menu != 5 || !respuesta.equals("S"));

    }

}
