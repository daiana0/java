/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author Dai
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero entero: ");
        int n = leer.nextInt();
        int maximo = 0;
        int minimo=9999999;
        int cont=0;
        int suma=0;
        double promedio=0;
        
        while (cont!=n) {
            System.out.println("ingrese numeros para sumar");
            int numero=leer.nextInt();
            if (numero>maximo) {
                maximo=numero;
            }
            if (numero<minimo) {
                minimo=numero;
            }
            cont=cont+1;
            suma=suma+numero;
            
        }
        promedio=suma/n;
        System.out.println("el valor maximo es: " +maximo+ " ,el valor minimo es: " +minimo+ " y el promedio: " +promedio);  
    }
    
}
