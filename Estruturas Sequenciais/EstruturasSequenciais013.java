package EstruturasSequenciais;

import java.util.Scanner;

/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/

public class EstruturasSequenciais013 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Agora digite sua altura: ");
		double altura = sc.nextDouble();
		
		double pesoIdealHomens = (72.7 * altura) - 58;
		double pesoIdealMulheres = (62.1 * altura) - 44.7;
				
		System.out.printf("Peso ideal para Homens: %.2f%n" , pesoIdealHomens);
		System.out.printf("Peso ideal para Mulheres: %.2f" , pesoIdealMulheres);

		
		sc.close();
		
	}

}
