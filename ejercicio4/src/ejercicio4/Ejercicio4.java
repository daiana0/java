/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una temperatura en grados celsius");
        double celsius = leer.nextDouble();
        double farenheit = 32 + (9 * celsius / 5);
        System.out.println("el valor en farenheit es " +farenheit);
        }
    
}
