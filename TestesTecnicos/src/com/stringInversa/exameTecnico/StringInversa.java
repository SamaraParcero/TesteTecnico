package com.stringInversa.exameTecnico;

import java.util.Scanner;

public class StringInversa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = scan.next();
		
		String inversa = "";
		
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
		inversa = inversa + palavra.charAt(i);
		 }
		System.out.println(inversa);
	}

}
