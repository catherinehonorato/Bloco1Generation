package ExercicioRepeticao;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int num, resto, contPar = 0, contImpar = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			for (int n = 1; n <= 10; n++) {
				System.out.print("Digite um n�mero: ");
				num = leia.nextInt();
				resto = num % 2;
						
				if (resto == 0) {
					contPar++;
				}
				else {
					contImpar++;
				}
			}
		}
		
		System.out.println("A quantidade de n�meros pares inseridos �: " + contPar);
		System.out.println("A quantidade de n�meros impares inseridos �: " + contImpar);

	}

}
