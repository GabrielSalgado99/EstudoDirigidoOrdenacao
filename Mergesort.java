
public class Mergesort {

	public void ordenarCrescente(int[] valores, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenarCrescente(valores, inicio, meio);
			ordenarCrescente(valores, meio + 1, fim);
			mergeCrescente(valores, inicio, meio, fim);
		}
	}

	public void ordenarDecrescente(int[] valores, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenarDecrescente(valores, inicio, meio);
			ordenarDecrescente(valores, meio + 1, fim);
			mergeDecrescente(valores, inicio, meio, fim);
		}
	}

	public void mergeCrescente(int[] valores, int inicio, int meio, int fim) {
		int[] vetorAux = new int[valores.length];
		int primeiraParte = inicio;
		int posicaoLivre = inicio;
		int segundaParte = meio + 1;
		
		while (primeiraParte <= meio && segundaParte <= fim) {
			if (valores[primeiraParte] <= valores[segundaParte]) {
				vetorAux[posicaoLivre] = valores[primeiraParte];
				primeiraParte++;
			} else {
				vetorAux[posicaoLivre] = valores[segundaParte];
				segundaParte++;
			}
			posicaoLivre++;
		}
		for (int i = primeiraParte; i <= meio; i++) {
			vetorAux[posicaoLivre] = valores[i];
			posicaoLivre++;
		}
		for (int i = segundaParte; i <= fim; i++) {
			vetorAux[posicaoLivre] = valores[i];
			posicaoLivre++;
		}
		for (int i = inicio; i <= fim; i++) {
			valores[i] = vetorAux[i];
		}
	}

	public void mergeDecrescente(int[] valores, int inicio, int meio, int fim) {
		int[] vetorAux = new int[valores.length];
		int primeiraParte = inicio;
		int posicaoLivre = inicio;
		int segundaParte = meio + 1;
		
		while (primeiraParte <= meio && segundaParte <= fim) {
			if (valores[primeiraParte] >= valores[segundaParte]) {
				vetorAux[posicaoLivre] = valores[primeiraParte];
				primeiraParte++;
			} else {
				vetorAux[posicaoLivre] = valores[segundaParte];
				segundaParte++;
			}
			posicaoLivre++;
		}
		for (int i = primeiraParte; i <= meio; i++) {
			vetorAux[posicaoLivre] = valores[i];
			posicaoLivre++;
		}
		for (int i = segundaParte; i <= fim; i++) {
			vetorAux[posicaoLivre] = valores[i];
			posicaoLivre++;
		}
		for (int i = inicio; i <= fim; i++) {
			valores[i] = vetorAux[i];
		}
	}

}
