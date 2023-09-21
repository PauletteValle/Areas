/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesodolareuro;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class PesoDolarEuro {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LecturaDePesos = new Scanner (System.in);
        
        System.out.println("Dame el valor en pesos");
        double pesos = LecturaDePesos.nextDouble();
        double euros = pesos/18.2;
        double dolares = pesos/17.5;
        System.out.println("Tu cantidad de pesos es " + euros);
        System.out.println("Tu cantidad de pesos es " + dolares);
        
       
       
        
    }
    
}
