package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char turno = 0, categoria = 0;
		double sal_min, sal_inicial, aux, sal_final;
		double cont, codigo, nht, valor;
		for (cont = 0; cont <= 10; cont++) {
			
			System.out.println("Digite a letra (Maiuscula) correpodente ao seu Turno: "
					+ "\n(M) - Matutinno | (V) - Vespertino | (N) - Noturno ");
			turno = sc.next().toUpperCase().charAt(0);
			
			System.out.println("Digite a letra (Maiuscula) correspondente a sua Categoria: "
		    		+ "\n(O) - Operário | (G) - Gerente ");
			
		    categoria = sc.next().toUpperCase().charAt(0);
			
			System.out.println("Digite o seu código empresarial");
			codigo = sc.nextDouble();
			
			System.out.println("Digite o número de horas trabalhadas");
			nht = sc.nextDouble();
			
			
			while (turno != 'M' & turno != 'V' & turno != 'N') {
				System.out.println("Opção inválida, tete novamente");
				System.out.println("Digite a letra (Maiuscula) correpodente ao seu Turno: "
						+ "\n(M) - Matutinno | (V) - Vespertino | (N) - Noturno ");
				turno = sc.next().toUpperCase().charAt(0);
			}
			
			while (categoria != 'G' & categoria != 'O') {
				System.out.println("Opção inválida, tete novamente");
				System.out.println("Digite a letra (Maiuscula) correspondente a sua Categoria: "
			    		+ "\n(O) - Operário | (G) - Gerente ");
			    categoria = sc.next().toUpperCase().charAt(0);
			}
		    
		    
		    
		    

		}
	}

}
