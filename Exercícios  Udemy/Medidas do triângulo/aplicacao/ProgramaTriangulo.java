package aplicacao;

import java.util.Scanner;
import entidades.Triangulo;

public class ProgramaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo(); // Instanciando o objeto
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A área do triângulo X é %.4f%n", areaX);
		System.out.printf("A área do triângulo Y é %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior área é a de X");
		} else {
			System.out.println("A maior área é a de Y");
		}
		sc.close();
	}

}
