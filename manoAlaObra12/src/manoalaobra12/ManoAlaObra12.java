/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra12;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ingrese dos numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
        public static void EsMultiplo (int num1, int num2) {
        int resto=num1%num2;
        if (resto == 0) {
                System.out.println("el numero es multiplo");
        } else 
                System.out.println("el primer numero no es multiplo del segundo.");
    }
        }
   
    

