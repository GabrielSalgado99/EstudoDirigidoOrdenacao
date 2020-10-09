import java.util.Random;

public class Main {

	public static void main(String[] args) {
		QuicksortMeio ordenador = new QuicksortMeio();
		Random R = new Random();
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = R.nextInt(100);
		}
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		ordenador.ordenarCrescente(valores, 0, valores.length-1);
		System.out.println();
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		ordenador.ordenarDecrescente(valores, 0, valores.length-1);
		System.out.println();
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
		
		

	}

}
