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
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/
        Scanner leer = new Scanner(System.in);
        int i, j, contador;
        
        System.out.println("Ingrese el tamaño del vector:");
        int n=leer.nextInt();
        
        int[]vector = new int[n];
        
        for (i=0; i<n; i++){
            vector[i]=(int) (Math.random()*100+1);
             System.out.print(vector[i]+" ");
        }
       
        System.out.println("Ingrese el número a buscar:");
        j=leer.nextInt();
        
        contador=0;
        for (i=0; i<n-1; i++){
            if (vector[i]==j) {
                System.out.println("El numero buscado se encuentra en posición " +i);
                contador = contador + 1;
            }
       
    }
        if (contador==0) {
		System.out.println ("El numero no se encuentra dentro del arreglo.");
                        }else {
		System.out.println("El número fue encontrado " +contador+ " veces.");
        }
    }
}
