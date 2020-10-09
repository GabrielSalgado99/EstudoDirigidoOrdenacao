
public class Insercao implements IOrdenação {

	@Override
	public void ordenarCrescente(int[] valores) {
		for (int i = 1; i < valores.length; i++) {
			int eleito = valores[i];
			int j = i - 1;
			while (j >= 0 && valores[j] > eleito) {
				valores[j + 1] = valores[j];
				j = j - 1;
			}
			valores[j + 1] = eleito;
		}

	}

	@Override
	public void ordenarDecrescente(int[] valores) {
		for (int i = 1; i < valores.length; i++) {
			int eleito = valores[i];
			int j = i - 1;
			while (j >= 0 && valores[j] < eleito) {
				valores[j + 1] = valores[j];
				j = j - 1;
			}
			valores[j + 1] = eleito;
		}

	}

}
