/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra10;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManosAlaobra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner (System.in);
      int num;
      
      for (int i=0; i<4; i++) {
        do {  
          System.out.println("ingrese un numero");
          num = leer.nextInt();
        } while (num<1 || num>20);
              System.out.print(num+" "); 
           for (int j=0; j<num; j++){
                System.out.print("*");
          }
          System.out.println("");
      }
    }
}    

   
    

