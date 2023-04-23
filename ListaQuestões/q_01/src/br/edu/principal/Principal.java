package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ano_atual;
		double i, salario,nov_salario, percentual;
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		salario = 1000.0;
		percentual = 0.015;
		nov_salario = salario + percentual * salario;
		
		for (i = 1997; i <= ano_atual; i++) {
			percentual *= 2;
			int nov_salarioInt = (int)nov_salario + (int)percentual * (int)nov_salario; 
		}

		System.out.println("Esse é o seu novo salário: " + nov_salario);

	}

}
