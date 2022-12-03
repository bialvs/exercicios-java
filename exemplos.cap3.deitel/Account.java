package exemplos.cap3.deitel;

public class Account {
	
	private String name; //variável de instância, são declaradas dentro da classe mas fora do cropo do método
	// modificadores private só são acessíveis a métodos da classe onde ocorre
	private double balance;
	
	public Account(String name, double balance) { //construtor que inicia com o nome do parâmetro
		this.name = name; //atribui name a variável de instância
		
		if (balance > 0.0) { //valida que balance é maior que zero
			this.balance = balance;
		}
	}
	
	//método deposita apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) { // método para definir o nome no objeto
		this.name = name; // armazena o nome
	}
	
	public String getName() { // método para recuperar o nome do objeto
		return name; // retorna valor do nome para o chamador
	}

}
