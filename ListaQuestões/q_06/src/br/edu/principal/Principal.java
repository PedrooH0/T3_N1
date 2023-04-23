package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cont, cod, num_vei, num_acid;
		int maior = 0, cid_maior = 0, menor = 0,cid_menor = 0;
		int media_vei, soma_vei, media_acid;
		int soma_acid, cont_acid;
		
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		
		for(cont = 1; cont <= 5; cont++) {
			System.out.println("Digite o código da cidade:");
			cod = sc.nextInt();
			System.out.println("Digite o número de veículos:");
			num_vei = sc.nextInt();
			System.out.println("Digite o número de acidentes de trânsito com vítimas:");
			num_acid = sc.nextInt();
			
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;
			} else {
				if (num_acid > maior) {
					maior = num_acid;
					cid_maior = cod;
				}
				if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
							
				}
			}
			soma_vei = soma_vei + num_vei;
			 if (num_vei < 2000) {
				 soma_acid = soma_acid + num_acid;
				 cont_acid = cont_acid + 1;
			 }
		}
		
		System.out.println("Maior índice de acidentes: " + maior);
		System.out.println("Pertence a cidade: " + cid_maior);
		
		System.out.println("Menor índice de acidentes: " + menor);
		System.out.println("Pertence a cidade: " + cid_menor);
		
	}

}
