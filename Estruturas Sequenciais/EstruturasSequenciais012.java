package EstruturasSequenciais;

import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class EstruturasSequenciais012 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.printf("Seu peso ideal é: %.2f" , pesoIdeal);
		
		sc.close();
	}

}
