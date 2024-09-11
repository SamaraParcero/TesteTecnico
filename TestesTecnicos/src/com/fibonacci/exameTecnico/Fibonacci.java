package com.fibonacci.exameTecnico;

import java.util.Scanner;

public class Fibonacci {
	
	 public static boolean fibonacci(int numero) {
	        int numero1 = 0, numero2 = 1;
	        while (numero1 < numero) {
	            int temporario = numero1;
	            numero1 = numero2;
	            numero2 = temporario + numero2;
	        }
	        return numero1 == numero;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	            System.out.print("Digite um número inteiro positivo: ");
	            int numero = scanner.nextInt();

	            if (fibonacci(numero)) {
	                System.out.println(numero + " é Fibonacci.");
	            } else {
	                System.out.println(numero + " não é Fibonacci.");
	            }
	        
	    }



}
