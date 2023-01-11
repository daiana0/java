/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        int doble = num * 2 ;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("el doble del numero es " +doble);
        System.out.println("el triple del numero es " +triple);
        System.out.println("la raiz del numero es " +raiz);
        
        
        
    }
    
}
