/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para rellenar el vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        for (int i = 0; i < n; i++) {
            vector[i] = i;
            //System.out.println(" " + vector[i]);
            //System.out.println("el vector contiene " +((int)Math.log10(i)+1)+ " digitos");
            switch (((int) Math.log10(i) + 1)) {
                case 1:
                    cont1 = cont1 + 1;

                    break;
                case 2:
                    cont2 = cont2 + 1;

                    break;
                case 3:
                    cont3 = cont3 + 1;

                    break;
                case 4:
                    cont4 = cont4 + 1;

                    break;
                case 5:
                    cont5 = cont5 + 1;

                    break;

            }

        }
        if (cont1!=0 ) {
            System.out.println("hay " + cont1 + " numeros de 1 digito");
        }
        if (cont2!=0 ) {  
        System.out.println("hay " + cont2 + " numeros de 2 digitos");
        }
        if (cont3!=0 ) { 
        System.out.println("hay " + cont3 + " numeros de 3 digitos");
        }
        if (cont4!=0 ) { 
        System.out.println("hay " + cont4 + " numeros de 4 digitos");
        }
        if (cont5!=0 ) { 
        System.out.println("hay " + cont5 + " numeros de 5 digitos");
        }
    }

}
