/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra4;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("soy " +nombre+ " y tengo " +edad+ " años");
    }
    
}
