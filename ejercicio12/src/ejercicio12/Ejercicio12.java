/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        int contCorrecto= 0;
        int contIncorrecto= 0;
        do {
            System.out.println("ingrese una frase");
            frase = leer.nextLine();
            int largoFrase = frase.length();
            frase = frase.substring(0, largoFrase);
            if (largoFrase <= 5 && !"&&&&&".equals(frase)) {

               
                if (frase.charAt(0) == 'X' && frase.charAt(largoFrase-1) == 'O') {
                    System.out.println("la frase es correcta");
                    contCorrecto=contCorrecto+1;
                } else {
                    System.out.println("secuencia incorrecta");
                    contIncorrecto=contIncorrecto+1;
                }
            }

        } while (!"&&&&&".equals(frase));
        System.out.println("FDE, final de envio");
        System.out.println("la cantidad de secuencias correctas ingresadas es: " +contCorrecto);
        System.out.println("la cantidad de secuencias incorrectas ingresadas es: " +contIncorrecto);
    }
}
