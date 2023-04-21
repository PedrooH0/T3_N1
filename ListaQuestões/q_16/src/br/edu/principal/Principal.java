package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma, mult, i;
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("\nDigite outro número: ");
		num2 = sc.nextInt();
		soma = 0;
		mult = 1;
		
		if (num1 == num2) {
			if ((num1 % 2) == 0) {
				soma = soma + num1;
			}
			else {
				mult = mult * num1;
			}
		}
		
		if (num1 < num2) {
			for (i = num1; i <= num2; i++) {
				if ((i % 2) == 0) {
					soma = soma + i;
				}
				else {
					mult = mult * i;
				}
			}
		}
		
		if (num1 > num2) {
			for (i = num2; i <= num1; i++) {
				if ((i % 2) == 0) {
					soma = soma + i;
				}
				else {
					mult = mult * i;
				}
			}
		}
		
		System.out.println();
		System.out.println("A soma dos números pares desse intervalo de números é: " + soma);
		System.out.println("A multiplicação dos números ímpares desse intervalo de números é: " + mult);
	}

}
