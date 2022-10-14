package EstruturasSequenciais;

import java.util.Scanner;

// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]
public class EstruturasSequenciais002 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		System.out.println("O número informado foi " + numero);
		
		sc.close();
		
	}

}
