/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra9;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
         System.out.println("ingrese dos numeros enteros");
         int dividendo= leer.nextInt();
         int divisor= leer.nextInt();
         int cociente=0;
         int resto;
         
         do {
             dividendo -= divisor;
             resto = dividendo;
             cociente ++;
             
             
         } while (resto > divisor);

         System.out.println("el cociente es: " +cociente);
         System.out.println("el resto es: " +resto);
        
    }
    
}
