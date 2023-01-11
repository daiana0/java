/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra8;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una nota");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("ingrese otra nota");
            nota = leer.nextInt();            
        }
        System.out.println("la nota ingresada es " +nota);
    }
    
}
