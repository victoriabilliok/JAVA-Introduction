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
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in);
        int longitud, contadorC, contadorI;
        String FDE, cadena, primero, ultimo;

        System.out.println("Ingrese una cadena (max 5 caracteres, que comience en X y termine en O):");
        cadena = leer.nextLine();
        cadena = cadena.toUpperCase();

        FDE = "&&&&&";
        contadorC = 0;
        contadorI = 0;

        while (!cadena.equals("&&&&&")) {
            longitud = cadena.length();
            primero = cadena.substring(0, 1);
            ultimo = cadena.substring(longitud - 1);
            
            if ((longitud <= 5) && (primero.equals("X")) && (ultimo.equals("O"))){
            contadorC = contadorC + 1;
            } else {
            contadorI = contadorI +1;
            }
        System.out.println("Ingrese una cadena (max 5 caracteres, que comience en X y termine en O):");
        cadena = leer.nextLine();
        cadena = cadena.toUpperCase();
        }
        
        System.out.println("La cantidad de lecturas correctas es: "+ contadorC+"\nLa cantidad de lecturas incorrectas es: "+contadorI);

    }

}
