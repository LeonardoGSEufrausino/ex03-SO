package project;

public class controller {
	
	public void Vetor(int[] vetor) {
		for (int numero : vetor) {
			if (numero % 2 != 0) {
				System.out.println(numero + " é um número ímpar.");
			} else if (numero % 10 == 0) {
				System.out.println(numero + " é um número par e múltiplo de 10.");
			}
		}
	}
}
