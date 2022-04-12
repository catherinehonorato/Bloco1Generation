package ExercicioRepeticao;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int idade, cont21 = 0, cont50 = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
			while (idade != -99) {
				if (idade < 21 && idade >= 0) {
					cont21++;
				}
				else if (idade > 50) {
					cont50++;
				}
				System.out.print("Digite outra idade: ");
				idade = leia.nextInt();
			}
		}
		
		System.out.println("Pessoas com menos de 21 anos: " + cont21);
		System.out.println("Pessoas com mais de 50 anos: " + cont50);
		System.out.println("FIM DO PROGRAMA!");

	}

}
