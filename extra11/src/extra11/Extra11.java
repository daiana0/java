/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra11;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int digitos;
        System.out.println("ingrese un numero entero: ");
        int num = leer.nextInt();
        
        
        devolverDigitos (num);
        System.out.println("digitos: " +devolverDigitos (num));
        
    
}
    public static int devolverDigitos (int num) {
        int cont=0;
        do {
            num/=10;
            cont++;
            
        } while (num!=0);
        return cont;
    }
}

