/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10;

import java.util.Scanner;


/**
 *
 * @author Dai
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int resultado;
        int num1=(int) (Math.random()*(10-0));
        int num2=(int) (Math.random()*(10-0));
        
        System.out.println(num1+ " * " +num2+ " = ");
        resultado = leer.nextInt();
        
        while (resultado!=(num1*num2)) {
            System.out.println("intente de nuevo");
            resultado = leer.nextInt();
              
        }
        
        System.out.println("adivino el resultado de la multiplicacion");
    }
    
}
