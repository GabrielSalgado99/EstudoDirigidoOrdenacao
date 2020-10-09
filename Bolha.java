
public class Bolha implements IOrdenação {

	@Override
	public void ordenarCrescente(int[] valores) {
		int n = 0;
		int troca = 1;
		while (n < valores.length || troca == 1) {
			troca = 0;
			for (int i = 0; i < valores.length - 1; i++) {
				if (valores[i + 1] < valores[i]) {
					int aux = valores[i];
					valores[i] = valores[i + 1];
					valores[i + 1] = aux;
					troca = 1;
				}
			}
			n++;
		}
	}

	@Override
	public void ordenarDecrescente(int[] valores) {
		int n = 0;
		int troca = 1;
		while (n < valores.length || troca == 1) {
			troca = 0;
			for (int i = 0; i < valores.length - 1; i++) {
				if (valores[i + 1] > valores[i]) {
					int aux = valores[i];
					valores[i] = valores[i + 1];
					valores[i + 1] = aux;
					troca = 1;
				}
			}
			n++;
		}
	}

}
