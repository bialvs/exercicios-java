package EstruturasSequenciais;

import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

public class EstruturasSequenciais014 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do peixe: ");
		double peso = sc.nextDouble();
		
		if (peso >= 50) {
			
		double excesso = peso - 50;
		double multa = excesso * 4;
		
		System.out.printf("O valor da multa é de: R$%.2f" , multa);
		
		} else {
			System.out.println("O valor da multa é de: R$0.00");
		}
		
		sc.close();
		
	}
}
