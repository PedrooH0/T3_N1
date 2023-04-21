package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont_time, cont_jog, idade;
		double peso = 0, alt = 0, qtde, media_idade;
		double media_altura = 0, porc, total80;
		qtde = 0;
		total80 = 0;
		
		for (cont_time = 1; cont_time <= 5; cont_time++) {
			media_idade = 0;
			for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
				System.out.println("Digite a idade do jogador " + cont_jog + " do time " + cont_time);
				idade = sc.nextInt();
				
				System.out.println("Digite o peso do jogador " + cont_jog + " do time " + cont_time);
				idade = sc.nextInt();
				
				System.out.println("Digite a altura do jogador " + cont_jog + " do time " + cont_time);
				idade = sc.nextInt();
				
				System.out.println();
				
				if (idade < 18) {
					qtde = qtde + 1;
					media_idade = media_idade + idade;
					media_altura = media_altura + alt;
				}
				
				if (peso > 80) {
					total80 = total80 + 1;
				}
			}
			media_idade = media_idade/11.0;
			System.out.println("\nMédia das idades do time " + cont_time);
			System.out.println();
		}
		System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
		
		media_altura = media_altura/55.0;
		System.out.println("Média das alturas de todos os jogadores do campeonato: " + media_altura);
		
		porc = total80 * (100.0/55.0);
		System.out.println("Porcentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato: " + porc + " %");
		
		

	}

}
