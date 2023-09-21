/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumadedosnumeros;

import java.util.Scanner;

/**
 *
 * @author moram
 */
public class SumaDeDosNumeros {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Ingresa el primer numero ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo numero ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2; 
        
        System.out.println(" La suma es: " + suma);
        
         scanner.close();
    }
}
