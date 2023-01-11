/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese cantidad de filas y columnas");
        int num = leer.nextInt();              
        int[][] matriz = new int[num][num];
        
        
        rellenarMatriz(matriz, num);
      

    }

    public static void rellenarMatriz(int[][] matriz, int num) {
        Scanner leer = new Scanner(System.in);
        int numero;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                do{
                    System.out.println("ingrese numero: ");
                    numero = leer.nextInt();
                } while (numero>10);
                        matriz[i][j] = numero;
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matriz[i][j]+"|");
            }
            System.out.print("");
                
            }
            
        }
                
         public static void matrizMagica (int [][] matriz, int num) {
             int resultadoMagico, cont =0;
              int[] sumaColumna = new int[num];
             int[] sumaFila = new int[num];
                int[] sumaDiagonal = new int[2];
             
                sumaDiagonal[0]=0;
                for (int i = 0; i < num; i++) {
                    sumaColumna[i]=0;
                    for (int j = 0; j < num; j++) {
                        sumaColumna[i]=sumaColumna[i]+matriz[i][j];
                        if (i==j) {
                            sumaDiagonal[0]=sumaDiagonal[0]+matriz[i][j];
                        }
                        
                    }
                    System.out.println("la suma de las columnas en la fila " +i+1+ " es: " +sumaColumna);
                    
             }
                System.out.println("la suma de la diagonal 1 es: " +sumaDiagonal[0]);
                for (int i = 0; i < num; i++) {
                    if (sumaColumna[0] != sumaColumna[i]){
                        cont ++;
                                }
                    }
                 sumaDiagonal[1]=0;
                 for (int i = num-1; i >=0; i--) {
                     sumaFila[i]=0;
                     for (int j = 0; j < num; j++) {
                         sumaFila[i]=sumaFila[i]+matriz[j][i];
                         if (i==j) {
                             sumaDiagonal[1]=sumaDiagonal[1]+ matriz[i][j];
                         
                     }
                 
             }
                     System.out.println("la suma de las filas de la columna ");
             }
         }      
        
   

    public static void sumarMatriz(int[][] matriz) {
        int diag=0;
        int col=0;
        int fila=0;
            
              
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0 ) {
                    col += matriz [i][j];
                    System.out.println("col" +col);
                }
        
                if (i==0 ) {
                    fila += matriz [i][j];
                    System.out.println("fila" +fila);
                }         
                
               

            }

        }
    }
}
        
        
       
    
            
        

        

    
    

