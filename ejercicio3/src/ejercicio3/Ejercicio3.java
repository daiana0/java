/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        System.out.println("la frase en minuscula es " +minuscula);
        System.out.println("la frase en minuscula es " +mayuscula);     
        
    }
   
}


