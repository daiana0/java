/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("elija el tipo de socio al que pertenece: ");
        String tipo = leer.nextLine();
        System.out.println("ingrese el valor a pagar: ");
        double monto1 = leer.nextDouble();
        double monto2=0;
        
        switch (tipo) {
            case "A":
                System.out.println("el monto a pagar es: " +monto1);
                monto2=monto1*0.5;
                System.out.println("el valor a pagar con el descuento incluido es: " +monto2);
                break;
            case "B":
                System.out.println("el monto a pagar es: " +monto1);
                monto2=monto1*0.65;
                System.out.println("el valor a pagar con el descuento incluido es: " +monto2);
                break;
            case "C":
                System.out.println("el monto a pagar es: " +monto1);
                break;
        }
        
         
    }
    
}
