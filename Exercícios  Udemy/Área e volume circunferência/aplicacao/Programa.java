package aplicacao;

import java.util.Scanner;

import utilitarios.Calculo;

//Fazer um programa para ler um valor numérico quaquer e mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com cinco casas decimais

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculo.circunferencia(raio);
		
		double v = Calculo.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculo.PI);
		
		sc.close();
	}

}
