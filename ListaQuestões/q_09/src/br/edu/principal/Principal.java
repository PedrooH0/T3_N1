package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont_func, cont_mes;
		double pont_total, maior_pont, media_pont, pont;
		
		maior_pont = 0;
		
		for (cont_func = 1; cont_func <=15; cont_func++) {
			
			pont_total = 0;
			
			for (cont_mes = 1; cont_mes <=3; cont_mes++) {
				System.out.println("Digite a sua pontuação no mês " + cont_mes + " funcionário " + cont_func + ":");
				pont = sc.nextDouble();
				pont_total = pont_total + pont;
				if (pont > maior_pont) {
					maior_pont = pont;
				}
			}
			System.out.println("\nPontuação total: " + pont_total);
			media_pont = pont_total/3.0;
			System.out.println("Média das pontuações " + new DecimalFormat(".##").format(media_pont));
			System.out.println();
		}
		System.out.println("Maior pontuação atingida: " + maior_pont);

	}

}
