/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas a evaluar");
        int n = leer.nextInt();
        int cont = 0;
        int suma = 0;
        int cont1 = 0;
        int suma1 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese estatura");
            int altura = leer.nextInt();
            cont = cont + 1;
            suma = suma + altura;
            if (altura < 1.60) {
                cont1 = cont1 + 1;
                suma1 = suma1 + altura;
            }
        }

        System.out.println("el promedio de alturas ingresadas es: " + suma / cont);
        System.out.println("el promedio de estaturas por debajo de 1.60 es: " + suma1 / cont1);
    }

}
     
    
