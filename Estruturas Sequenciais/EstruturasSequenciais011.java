package EstruturasSequenciais;

import java.util.Scanner;

/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
- produto do dobro do primeiro com metade do segundo .
- soma do triplo do primeiro com o terceiro.
- terceiro elevado ao cubo. */

public class EstruturasSequenciais011 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite dois numeros inteiros e um real: ");
			int inteiro1 = sc.nextInt();
			int inteiro2 = sc.nextInt();
			double real = sc.nextDouble();
			
			int produto = (inteiro1 * 2) * (inteiro2 / 2);
			double soma = (inteiro1 * 3) + real;
			double cubo = Math.pow(real, 3);
			
			System.out.println("Produto do dobro do primeiro com metade do segundo = " + produto);
			System.out.println("Soma do triplo do primeiro com o terceiro = " + soma);
			System.out.printf("Terceiro elevado ao cubo = %.2f", cubo);
			
			sc.close();
		}
}
