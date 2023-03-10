/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2dia2y3;

import java.util.Scanner;

/**
 *
 * @author jona
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println("la frase en minuscula es: " + frase.toLowerCase());
        System.out.println("la frase en mayuscula es: " + frase.toUpperCase());
        
        
        
        
    }
}
