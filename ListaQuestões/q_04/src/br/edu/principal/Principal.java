package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, a, b, i;
		for ( cont = 1; cont <= 5; cont++) {
			System.out.println("Digite o primeiro número: ");
			a = sc.nextInt();
			System.out.println("Digite o segundo número: ");	
			b = sc.nextInt();
			for (i = a; i <= b; i++) {
				if ( i % 2 == 0) {
					System.out.println("Número Inteiro Par: " + i);
				}
			}
		}

	}

}
