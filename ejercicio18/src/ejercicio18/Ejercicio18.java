/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;


import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Dai
 */
public class Ejercicio18 {
static Scanner leer = new Scanner (System.in);  
static Random aleatorio = new Random ();
    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int [][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= aleatorio.nextInt(30);
                System.out.print(matriz[i][j] +"|");               
                }
            System.out.println(" ");
            
        }
        System.out.println("matriz traspuesta");
           for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j] +"|");               
                }
            System.out.println(" ");
            
        }
        
        
        
        
        
    }
}
        
      /*  Random random = new Random();
        int [][] matriz = new int[4][4];
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                         matriz[i][j]=random.nextInt(20);
            }
            
        }
                String respuesta="";
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) 
                        respuesta =respuesta ", " + matriz [][];
                        
                    }
            
        }
    }
    
}
*/