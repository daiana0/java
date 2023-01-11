/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra9;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManosAlaObra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num;
        int suma = 0;
        int cont = 0;
        
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
        cont++;
           if (num>0) { 
            suma = suma + num;            
           } else {
               suma = suma;
           }
        }while (num!=0 && cont<5);  
        /*if (num>0) {
            suma=suma + num; */
            if (num==0) { 
                System.out.println("se capturo el numero cero");
            }
        System.out.println("la suma de los numeros ingresados es " +suma);
        //+= es suma = suma+resta
                           
    }
    

}