package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char turno = 0, categoria = 0;
		double sal_min = 150, sal_inicial, aux, sal_final;
		double nht, valor = 0;
		int codigo, cont;
		
		for (cont = 1; cont <= 10; cont++) {
			
			System.out.println("Digite a letra (Maiuscula) correpodente ao seu Turno: "
					+ "\n(M) - Matutinno | (V) - Vespertino | (N) - Noturno ");
			turno = sc.next().toUpperCase().charAt(0);
			
			System.out.println("Digite a letra (Maiuscula) correspondente a sua Categoria: "
		    		+ "\n(O) - Operário | (G) - Gerente ");
			
		    categoria = sc.next().toUpperCase().charAt(0);
			
			System.out.println("Digite o seu código empresarial");
			codigo = sc.nextInt();
			
			System.out.println("Digite o número de horas trabalhadas");
			nht = sc.nextDouble();
			
			
			while (turno != 'M' & turno != 'V' & turno != 'N') {
				System.out.println("Opção inválida, tente novamente");
				System.out.println("Digite a letra (Maiuscula) correpodente ao seu Turno: "
						+ "\n(M) - Matutinno | (V) - Vespertino | (N) - Noturno ");
				turno = sc.next().toUpperCase().charAt(0);
			}
			
			while (categoria != 'G' & categoria != 'O') {
				System.out.println("Opção inválida, tente novamente");
				System.out.println("Digite a letra (Maiuscula) correspondente a sua Categoria: "
			    		+ "\n(O) - Operário | (G) - Gerente ");
			    categoria = sc.next().toUpperCase().charAt(0);
			}
		    
			if (categoria == 'G') {
				if(turno == 'N') {
					valor = (18/100.0) * sal_min;
				}
				else {
					valor = (15/100.0) * sal_min;
				}
			}
			else {
				if(turno == 'N') {
					valor = (13/100.0) * sal_min;
				}
				else {
					valor = (10/100.0) * sal_min;
				}
			}
			
			sal_inicial = nht * valor;
			
			if (sal_inicial <= 300) {
				aux = (20/100.0) * sal_inicial;
			}
			
			else if (sal_inicial < 600) {
				aux = (15/100.0) * sal_inicial;
			}
			
			else {
				aux = (5/100.0) * sal_inicial;
			}
			
			sal_final = sal_inicial + aux;
			
			System.out.println("\nTabela " + cont +"\nCódigo: " + codigo + "\nHoras trabalhadas: " + nht + "\nValor: " + valor + "\nSalário inicial: " + sal_inicial + "\nAuxílio: " + aux + "\nSalário Final: " + sal_final);
		    System.out.println();
		    
		    

		}
	}

}
