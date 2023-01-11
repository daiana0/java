/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int AUX = 0;
         System.out.println("el valor de A es: " +A+ ", el de B es: " +B+ ", el de C es: " +C+ " y el de D es: " +D);
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
         System.out.println("el valor de A es: " +A+ ", el de B es: " +B+ ", el de C es: " +C+ " y el de D es: " +D);;
               
        
    }
    
}
