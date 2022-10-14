package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

public class EstruturasSequenciais010 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double temperaturaC = sc.nextDouble();
		
		double temperaturaF = temperaturaC * 1.8 + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + temperaturaF);
		
		sc.close();
		
	}

}
