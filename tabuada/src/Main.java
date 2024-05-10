import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Deseja a tabuada para qual valor? ");
		int numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.printf("%d x %d = %d%n", numero, i, resultado);

		}
		scanner.close();

	}

}
