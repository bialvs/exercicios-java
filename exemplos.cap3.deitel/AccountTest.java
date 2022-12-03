package exemplos.cap3.deitel;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//cria um objeto account e o atribui 
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.50);
		
		//exibe o saldo inicial de cada objeto		
		System.out.printf("%s balance is: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: $%.2f %n", account2.getName(), account2.getBalance());
		
		System.out.println("Enter deposit amount for account1: ");
		double depositAmount = sc.nextDouble();
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance is: $%.2f %n", account1.getName(), account1.getBalance());
		
		sc.close();
	}

}
