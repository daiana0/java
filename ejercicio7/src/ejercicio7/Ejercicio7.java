/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
    
}