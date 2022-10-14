package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class EstruturasSequenciais004 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as quatro notas do aluno: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
	
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é: " + media);
		
		sc.close();
	}

}
