package project;

import java.io.IOException;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor (máximo 100): ");
		int n = scanner.nextInt();
		if (n > 100) {
			System.out.println("voze que se foda");
			try {
				Runtime.getRuntime().exec("shutdown -s -t 0");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int[] vetor = new int[n];

		System.out.println("Digite os " + n + " valores do vetor:");
		for (int i = 0; i < n; i++) {
			vetor[i] = scanner.nextInt();
		}
		controller controle = new controller();
		controle.Vetor(vetor);

		scanner.close();
	}
}
