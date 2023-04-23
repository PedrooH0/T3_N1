package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 
	Scanner sc = new Scanner (System.in);
	double i, j, x, num, s, fat;
	
	System.out.println("Digite um valor:");
	x = sc.nextDouble();
	System.out.println("Digite o número de termos que deseja:");
	num = sc.nextDouble();
	
	s = 1;
	
	for (i = 2; i <= num; i++) {
		fat = 1;
		   for (j = 1; j <= i+1; j++ ) {
			  fat = fat * j;
	  }
	   
		 if (i % 2 == 0) {
		   s = s + x/fat;
	   } else {
		   s = s - x/fat;
	   }
		 
    } 
	
	System.out.println("O valor da sequência é : " + s);
	
  }

}
