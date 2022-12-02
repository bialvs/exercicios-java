package exemplos_cap2_deitel;

import java.util.Scanner; //a declaração import que ajuda o compilador a localizar uma classe utilizada nesse programa. Isso indica que o programa usa a classe Scanner predefinida

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); /* Cria um scanner para obter a entrada a partir da janela de comando é uma instrução de declaração de variável que especifica o nome (input) 
		e o tipo (Scanner) de uma variável utilizada nesse programa. O sinal de = indica que a variável deve ser inicializada*/
		
		int num1, num2, sum; // Declaração das variáveis para soma !! Variável é uma posição na memória
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt(); // lê o primeiro número fornecido pelo usuário 
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt(); // lê o segundo número fornecido pelo usuário
		
		sum = num1 + num2; // soma os números e armazena na variável sum
		
		System.out.printf("A soma é %d%n", sum); // exibe a soma
		
				
		sc.close(); // Encerra a classe Scanner
	} // fim do método main

} // fim da classe Addition
