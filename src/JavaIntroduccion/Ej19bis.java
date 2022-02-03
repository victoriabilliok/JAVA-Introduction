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
public class Ej19bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
        Scanner leer = new Scanner(System.in);
        double euro, cambio;
        String moneda;

        System.out.println("Diga la cantidad de euros que va a convertir: ");
        euro = leer.nextDouble();

        System.out.print("Introduce el tipo de moneda que desea obtener(dolares, libras, yenes): ");
        moneda = leer.next();
        
        intercambio(euro, moneda);

    }

    public static void intercambio(double euro, String moneda){
        double cambio;
        
        switch (moneda.toUpperCase()) {
            case "DOLARES":
                cambio=euro*0.86;
                System.out.println(euro+" euros pasado a dolares es igual a: "+cambio);
                break;
            case "YENES":
                cambio=euro*1.28611/1;
                System.out.println(euro+" euros pasado a yenes es igual a: "+cambio);        
                break;
            case "LIBRAS":
                cambio=euro*129.852/1;
                System.out.println(euro+" euros pasado a libras es igual a: "+cambio);   
                break;
}
}
}
