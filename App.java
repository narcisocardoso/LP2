package h1846;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int[] numeros;
		int tamanho, soma = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite tamnho de array: ");
		tamanho = scanner.nextInt();

		numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Digite %2d numero: ", i + 1);
			numeros[i] = scanner.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}

		System.out.printf("Soma dos numeros: %d\n", soma);

		scanner.close();
	}

}
