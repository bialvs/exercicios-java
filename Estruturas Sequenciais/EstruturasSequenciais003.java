package EstruturasSequenciais;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma

public class EstruturasSequenciais003 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		System.out.println("Soma = " + (numero1 + numero2));
		
		sc.close();
		
	}

}
