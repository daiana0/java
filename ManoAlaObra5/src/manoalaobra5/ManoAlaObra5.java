/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra5;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero decimal");
        double decimal = leer.nextDouble();
        System.out.println("ingrese un caracter");
        char caracter = leer.next().charAt(0);
        System.out.println("es el num decimal ingresado igual a 5");
        boolean verdad = 5 > decimal ;
        
        
    }
    
}
