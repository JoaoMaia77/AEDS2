import java.util.Scanner;

class TP01Q01 {
	private static Boolean ehPalindromo(String palavra) {
		int tam = palavra.length() - 1;

		char[] palavraArray = palavra.toCharArray();

		for (int i = 0; i <= tam/2; i++) {
			if (palavraArray[i] != palavraArray[tam - i])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra;

		palavra = sc.nextLine();

		while (!palavra.equals("FIM")) {
			if (ehPalindromo(palavra))
				System.out.println("SIM");
			else
				System.out.println("NAO");

			palavra = sc.nextLine();
		}

		sc.close();
	}
}