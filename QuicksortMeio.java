
public class QuicksortMeio {

	public void ordenarCrescente(int[] valores, int inicio, int fim) {
		int pivo;
		if (inicio < fim) {
			pivo = particionarCrescente(valores, inicio, fim);
			ordenarCrescente(valores, inicio, pivo);
			ordenarCrescente(valores, pivo + 1, fim);
		}
	}

	public void ordenarDecrescente(int[] valores, int inicio, int fim) {
		int pivo;
		if (inicio < fim) {
			pivo = particionarDecrescente(valores, inicio, fim);
			ordenarDecrescente(valores, inicio, pivo);
			ordenarDecrescente(valores, pivo + 1, fim);
		}
	}

	public int particionarCrescente(int[] valores, int inicio, int fim) {
		int esquerda, direita, pivo, aux;
		esquerda = inicio;
		direita = fim;
		pivo = valores[(inicio + fim) / 2];
		while (esquerda < direita) {
			while (valores[esquerda] < pivo && esquerda < fim)
				esquerda++;
			while (valores[direita] > pivo && direita > inicio)
				direita--;
			if (esquerda < direita) {
				aux = valores[esquerda];
				valores[esquerda] = valores[direita];
				valores[direita] = aux;
				direita--;
			}
		}
		return direita;
	}

	public int particionarDecrescente(int[] valores, int inicio, int fim) {
		int esquerda, direita, pivo, aux;
		esquerda = inicio;
		direita = fim;
		pivo = valores[(inicio + fim) / 2];
		while (esquerda < direita) {
			while (valores[esquerda] > pivo && esquerda < fim)
				esquerda++;
			while (valores[direita] < pivo && direita > inicio)
				direita--;
			if (esquerda < direita) {
				aux = valores[esquerda];
				valores[esquerda] = valores[direita];
				valores[direita] = aux;
				direita--;
			}
		}
		return esquerda;
	}
}
