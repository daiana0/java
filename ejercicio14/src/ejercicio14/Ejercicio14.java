/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class Ejercicio14 {
/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("introduce un monto en euros: ");
        double euro = leer.nextInt();
        double dolar = 0;
        double yen = 0;
        double libra = 0;

        cambioMoneda(euro, dolar, yen, libra);
        
    }

    public static void cambioMoneda(double euro, double dolar, double yen, double libra) {
        dolar = euro * 1.28611;
        yen = euro * 129.852;
        libra = euro * 0.86;
        System.out.println(" " +dolar+ " " +yen+ " " +libra);
    }
}
