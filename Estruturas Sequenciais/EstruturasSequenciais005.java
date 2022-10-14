package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.

public class EstruturasSequenciais005 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para converter: ");
		double numero = sc.nextDouble();
		
		double conversao = numero * 100;
		
		System.out.println(numero + "m = " + conversao + "cm");
		
		sc.close();
	}

}
