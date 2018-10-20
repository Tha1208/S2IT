package main.br.com.s2it.questao8;

//Author Thatiane Kawabata

public class Questao8 {

	public int criarC(int numA, int numB) {

		String a = Integer.toString(numA);
		String b = Integer.toString(numB);
		String c = "";

		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();

		//verifica qual o tamanho maximo do array
		int maximoTamanho = arrayA.length > arrayB.length ? arrayA.length : arrayB.length;

		for (int i = 0; i < maximoTamanho; i++) {
			if (i < arrayA.length)
				c += arrayA[i];
			if (i < arrayB.length)
				c += arrayB[i];
		}

		Integer resultado = Integer.parseInt(c);

		//verifica se o resultado e maior que 1000000
		if (resultado > 1000000) {
			return -1;
		}

		return resultado;
	}

}
