package com.stringInversa.exameTecnico;

import java.util.Scanner;

public class StringInversa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase:");
        String frase = scan.nextLine(); 
        
        String inversa = "";
        
       
        for (int i = frase.length() - 1; i >= 0; i--) {
            inversa = inversa + frase.charAt(i);
        }
        
        System.out.println("String invertida: " + inversa);
    }
}
