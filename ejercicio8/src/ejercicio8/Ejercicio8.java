/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una palabra de 8 caracteres de largo");
        String frase = leer.nextLine();
        
        if (frase.length()==8) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }

}
