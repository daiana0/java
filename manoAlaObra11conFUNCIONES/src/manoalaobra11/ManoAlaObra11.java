/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra11;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese una frase");
        String frase1 = leer.nextLine();
        String fraseNueva ;
        fraseNueva=fraseFinal(frase1);
        System.out.println(fraseNueva);
    }
    

public static String fraseFinal(String frase1) {
        String frase2= "";
        int longitud = frase1.length();

        for (int i = 0; i < longitud; i++) {
            
            switch (frase1.substring(i, i+1)) {
                case "a":
                    frase2 = frase2.concat("@");
                    break;
                case "A":
                    frase2 = frase2.concat("@");
                    break;
                case "e":
                    frase2 = frase2.concat("#");
                    break;
                case "E":
                    frase2 = frase2.concat("#");
                    break;
                case "i":
                    frase2 = frase2.concat("$");
                    break;
                case "I":
                    frase2 = frase2.concat("$");
                    break;
                case "o":
                    frase2 = frase2.concat("%");
                    break;
                case "O":
                    frase2 = frase2.concat("%");
                    break;
                case "u":
                    frase2 = frase2.concat("*");
                    break;
                case "U":
                    frase2 = frase2.concat("*");
                    break;
                default: 
                        frase2 = frase2.concat(frase1.substring(i, i+1));
            }

        }
                return frase2;
}
}
