/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cont=0;
        int numero;
        int contpar=0;
        int contimpar=0;
        
        do {
        System.out.println("ingrese un numero entero");
        numero = leer.nextInt(); 
        cont=cont+1;
            if (numero%2==0) {
                contpar=contpar+1;
            } else {
                contimpar=contimpar+1;
            }
        } while (numero%5!=0);
        
        System.out.println("la cantidad de numeros ingresados es: " +cont+ " , los pares: " +contpar+ " y los impares " +contimpar);
        }
    }
    

