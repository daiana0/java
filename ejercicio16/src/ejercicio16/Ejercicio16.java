/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int n = leer.nextInt();
        System.out.println("ingrese el numero que desee buscar: ");
        int num = leer.nextInt();
       
        int[] vector = new int[n];
        int cont=0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 20 + 1);
            
            
            if (vector[i] == num) {
                System.out.println("el numero " + num + " fue encontrado en el vector " + i);
                cont=cont+1;
                System.out.println("el numero aparece " +cont+ " vez o veces");
            }            }

        }

}
    

