package EstruturasSequenciais;

import java.util.Scanner;

// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
public class EstruturasSequenciais008 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double salarioHora = sc.nextDouble();
		System.out.println("Quanats horas você trabalhou no mês (em decimal): ");
		double horasTrabalhadas = sc.nextDouble();
		
		double salarioMensal = salarioHora * horasTrabalhadas;
		
		System.out.println("Seu salário é de: " + salarioMensal);
		
		sc.close();
	}

}
