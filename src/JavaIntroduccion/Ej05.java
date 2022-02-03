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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
        Scanner leer = new Scanner(System.in);
        int num, doble, triple;
        double raiz;
        
        System.out.println("Escriba un número para operar:");
        num = leer.nextInt();
        
        doble= num*2;
        triple= num*3;
        raiz=Math.sqrt(num);
        
        System.out.println(" El doble es: "+doble+ "\n El triple es: "+triple+"\n La raiz es: "+raiz);
    
        
    }
    
}
