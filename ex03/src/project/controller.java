package project;

public class controller {
	
	public void Vetor(int[] vetor) {
		for (int numero : vetor) {
			if (numero % 2 != 0) {
				System.out.println(numero + " � um n�mero �mpar.");
			} else if (numero % 10 == 0) {
				System.out.println(numero + " � um n�mero par e m�ltiplo de 10.");
			}
		}
	}
}
