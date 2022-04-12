package ExercicioRepeticao;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int idade, sexo, opcao;
		int contPC = 0, contMN = 0, contHA = 0;
		int contOC = 0, contN40 = 0, contC18 = 0;
		int contInt = 0;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu sexo: ");
			System.out.print("(1 - Feminino | 2 - Masculino | 3 - Outro) - ");
			sexo = leia.nextInt();
			
			System.out.println("Como você se define?");
			System.out.print("(1 - Calma | 2 - Nervosa | 3 - Agressiva) - ");
			opcao = leia.nextInt();
			
			if (opcao == 1) {
				contPC++;
			}
			if (sexo == 1 && opcao == 2) {
				contMN++;
			}
			if (sexo == 2 && opcao == 3) {
				contHA++;
			}
			if (sexo == 3 && opcao == 1) {
				contOC++;
			}
			if (idade > 40 && opcao == 2) {
				contN40++;
			}
			if (idade < 18 && opcao == 1) {
				contC18++;
			}
			contInt++;
			
			while (contInt < 150 && idade>=1 && sexo>=1 && sexo<=3 && opcao>=1 && opcao<=3) {
				
				System.out.println("PRÓXIMO!");
				System.out.print("Digite sua idade: ");
				idade = leia.nextInt();
				
				System.out.println("Digite seu sexo: ");
				System.out.print("(1 - Feminino | 2 - Masculino | 3 - Outro) - ");
				sexo = leia.nextInt();
				
				System.out.println("Como você se define? ");
				System.out.print("(1 - Calma | 2 - Nervosa | 3 - Agressiva) - ");
				opcao = leia.nextInt();
				
				if (opcao == 1) {
					contPC++;
				}
				if (sexo == 1 && opcao == 2) {
					contMN++;
				}
				if (sexo == 2 && opcao == 3) {
					contHA++;
				}
				if (sexo == 3 && opcao == 1) {
					contOC++;
				}
				if (idade > 40 && opcao == 2) {
					contN40++;
				}
				if (idade < 18 && opcao == 1) {
					contC18++;
				}
				contInt++;
			}
		}
		
		System.out.println("O número de pessoas calmas é: " + contPC);
		System.out.println("O número de mulheres nervosas é: " + contMN);
		System.out.println("O número de homens agressivos: " + contHA);
		System.out.println("O número de outros calmos: " + contOC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + contN40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + contC18);

	}

}
