/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Dai
 */
public class Ejercicio19 {
static Scanner leer = new Scanner (System.in);  
static Random aleatorio = new Random ();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //rellenar matriz
        int[][] matriz = new int[3][3];
        rellenarMatriz(matriz);
        mostrarMatrizOriginal(matriz);
        mostrarMatrizTraspuesta(matriz);
        comprobarMatriz(matriz);
    }

    public static void rellenarMatriz(int[][] matriz) {
        int numero;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese numero: ");
                numero = leer.nextInt();
                matriz[i][j] = numero;
                //System.out.print(matriz[i][j] +"|");               
            }
        }

    }

    public static void mostrarMatrizOriginal(int[][] matriz) {
        System.out.println("matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println(" ");

        }
    }

    public static void mostrarMatrizTraspuesta(int[][] matriz) {
        System.out.println("matriz traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + "|");
            }
            System.out.println(" ");

        }
    }

    public static void comprobarMatriz(int[][] matriz) {
        boolean bandera = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    
                    bandera = true;
                    break;

                }

            }
            if (bandera == true) {

            }
        }
        System.out.println("la matriz no es antisimetrica");
    }
}



     
     

