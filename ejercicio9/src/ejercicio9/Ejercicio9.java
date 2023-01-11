/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        String palabra = leer.nextLine();
        String primerLetra = palabra.substring(0,1);
        if (primerLetra.equals("a")) {
           System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
        }
       
    }

    

