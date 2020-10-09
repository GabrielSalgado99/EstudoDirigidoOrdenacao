
public class QuicksortFim {

	public void ordenarCrescente(int valores[], int inicio, int fim) {
		if (inicio < fim) {
			int pivo = particionarCrescente(valores, inicio, fim);
			ordenarCrescente(valores, inicio, pivo - 1);
			ordenarCrescente(valores, pivo + 1, fim);
		}
	}

	public void ordenarDecrescente(int valores[], int inicio, int fim) {
		if (inicio < fim) {
			int pivo = particionarDecrescente(valores, inicio, fim);
			ordenarDecrescente(valores, inicio, pivo - 1);
			ordenarDecrescente(valores, pivo + 1, fim);
		}
	}

	public int particionarCrescente(int valores[], int inicio, int fim) {
		int esquerda, direita, aux, pivo;
		esquerda = inicio;
		direita = fim;
		pivo = valores[inicio];
		while (esquerda < direita) {
			while (valores[esquerda] <= pivo && esquerda < fim)
				esquerda++;
			while (valores[direita] > pivo && direita > inicio)
				direita--;
			if (esquerda < direita) {
				aux = valores[esquerda];
				valores[esquerda] = valores[direita];
				valores[direita] = aux;
			}

		}
		valores[inicio] = valores[direita];
		valores[direita] = pivo;
		return direita;
	}

	public int particionarDecrescente(int valores[], int inicio, int fim) {
		int esquerda, direita, aux, pivo;
		esquerda = inicio;
		direita = fim;
		pivo = valores[inicio];
		while (esquerda < direita) {
			while (valores[esquerda] >= pivo && esquerda < fim) {
				esquerda++;
			}
			while (valores[direita] < pivo && direita > inicio) {
				direita--;
			}
			if (esquerda < direita) {
				aux = valores[esquerda];
				valores[esquerda] = valores[direita];
				valores[direita] = aux;
			}
		}
		valores[inicio] = valores[direita];
		valores[direita] = pivo;
		return direita;
	}

}
