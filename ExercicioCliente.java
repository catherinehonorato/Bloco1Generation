package POOsobrecarga;

public class ExercicioCliente {
	boolean cadastro;
	String nome;
	int idade;
	double saldo;

	public void entrada() {
		if (cadastro == false) {
			System.out.println("ERRO! Não há cadastro deste cliente.");
		}
		else {
			System.out.println("Seja Bem-Vindo!");
		}
	}
	public void cadastrar() {
		this.cadastro = true;		
	}
	public void desistencia() {
		this.cadastro = false;
	}
	public void status() {
		System.out.println("Cliente é cadastrado? " + this.cadastro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Saldo do cliente: " + String.format("%.2f", this.saldo));
}
}