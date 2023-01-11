/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un limite");
        int limite = leer.nextInt();
        int suma = 0;
        int num = 0;
        int num1=0;

        do {
        System.out.println("ingrese nuevamente un limite positivo");
        limite = leer.nextInt();
            
        } while (limite < 0);

        while (num < limite && suma < limite) {
            System.out.println("ingrese otro numero");
            num = leer.nextInt();

            suma = suma + num;
        }
        System.out.println("el total es: " + suma);
    }
}

