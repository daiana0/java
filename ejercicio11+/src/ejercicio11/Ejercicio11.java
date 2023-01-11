/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int nummenu=0;
      
       do {        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion:");
        nummenu = leer.nextInt(); 
        
        switch  (nummenu) {
            case 1:
                int suma= num1 + num2;
                System.out.println("la suma es: " +suma);
                
                break;
            case 2:
                int rest = num1 - num2;
                System.out.println("la resta es: " +rest);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.println("la multiplicacion es: " +mult);
                break;
            case 4:
                double div = num1 / num2;
                System.out.println("La division es: " +div);
                break;
            case 5:                
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                Scanner leer2 = new Scanner(System.in);
                String rpta = leer2.nextLine();
                if ("s".equals(rpta)) {
                System.out.println("Saliendo, hasta la proxima");
                } else {
                    nummenu=nummenu+1;
                System.out.println("elija otra opcion" +nummenu);
                } 
                break;
            default:
                System.out.println("ingrese otro num");
                
        }
        
               
       } while (nummenu != 5);
       
    }
    
}
