package POOsobrecarga;

public class ClienteMain {

	public static void main(String[] args) {
		ExercicioCliente cliente = new ExercicioCliente();
		
		cliente.cadastro = true;
		cliente.nome = "Cate";
		cliente.idade = 19;
		cliente.saldo = 566763.33;
		
		cliente.status();
		cliente.entrada();

	}

}
