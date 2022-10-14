package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

public class EstruturasSequenciais007 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = sc.nextDouble();
		double area = Math.pow(lado,2);
		double dobroDaArea = area * 2;
		
		System.out.println("Área = " + area);
		System.out.println("Dobro da área = " + dobroDaArea);
		
		sc.close();
		
	}

}
