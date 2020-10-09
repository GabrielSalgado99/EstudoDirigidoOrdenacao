
public class Selecao implements IOrdenação {

	@Override
	public void ordenarCrescente(int[] valores) {
		int menor;
		for (int i = 0; i < valores.length; i++) {
			menor = i;
			for (int j = i; j < valores.length; j++) {
				if (valores[j] < valores[menor]) {
					menor = j;
				}
			}
			if (menor != i) {
				int aux = valores[i];
				valores[i] = valores[menor];
				valores[menor] = aux;
			}
		}

	}

	@Override
	public void ordenarDecrescente(int[] valores) {
		int maior;
		for (int i = 0; i < valores.length; i++) {
			maior = i;
			for (int j = i; j < valores.length; j++) {
				if (valores[j] > valores[maior]) {
					maior = j;
				}
			}
			if (maior != i) {
				int aux = valores[i];
				valores[i] = valores[maior];
				valores[maior] = aux;
			}
		}

	}

}
