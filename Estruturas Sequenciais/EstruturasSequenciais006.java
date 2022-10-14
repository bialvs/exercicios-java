package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class EstruturasSequenciais006 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		double area = 3.141592 * Math.pow(raio, 2);
		
		System.out.println("Área = " + area);
		
		sc.close();
	}

}
