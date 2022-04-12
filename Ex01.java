package ExercicioRepeticao;

public class Ex01 {

	public static void main(String[] args) {
			int num = 1000, resto;
		
			for (num = 1000; num < 2000; num++) {
			resto = num % 11;
			
					if (resto == 5) {
						System.out.print(num + " ");
					}
			}

	}

}
