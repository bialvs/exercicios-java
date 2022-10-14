package EstruturasSequenciais;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius

public class EstruturasSequenciais009 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temperaturaF = sc.nextDouble();
		
		double temperaturaC = 5 * ((temperaturaF - 32)/9);
		
		System.out.println("Temperatura em Celsius = " + temperaturaC);
		
		sc.close();
	}
	
	

}
