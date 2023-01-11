/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero entero: ");
        int num = leer.nextInt();
        
        //int cont =0;
        //linea sup
        for (int i = 0; i < num ; i++) {
            System.out.print("*");
        }  
        System.out.println();
        //centro
        for (int i = 0; i < num-2; i++) {
            System.out.print("*");
            for (int j = 0; j < num-2; j++) {
                System.out.print(" ");
                
            }
            System.out.println("*");  
        }
        
        //linea inf
        for (int i = 0; i < num ; i++) {
            System.out.print("*");
        }
            
            
           /* if (i==0 || i==num) {
                do {
                    System.out.print(" * ");
                    cont=cont+1;
            } while (cont==num);
                System.out.println(" * ");
            } else {
                 System.out.print(" * ");
                 do {
                     System.out.print(" ");
                     cont=cont+1;
                 } while (i==num*2);
                         System.out.println(" * ");
                 }*/
            
            }
            
        }
    
    

