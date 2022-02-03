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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/
       
        Scanner leer= new Scanner(System.in);
        int num1,num2,suma;
        
        System.out.println ("Ingrese los números con los que desea operar:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("El resultado de la suma es " +suma+ ".");
    }
    
}
