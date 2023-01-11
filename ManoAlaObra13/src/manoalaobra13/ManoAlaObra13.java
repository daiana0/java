/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manoalaobra13;
import java.util.Scanner;
/**
 *
 * @author Dai
 */
public class ManoAlaObra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        String[] Equipo = new String[7];
        
        
        for (int i=0; i<7; i++) {
            
                System.out.println("ingrese el nombre:");
                nombre = leer.nextLine();
                
                Equipo[i]= nombre;
                     
        }
        
        for (int i=0; i<7; i++) {
            System.out.print(Equipo[i]+ ", ");
        }
        }
    
        
    }
    

