package controller;

public class ElementosNegativosController {

	public ElementosNegativosController() {
		super();
	}

	public int qtdeElementosNegativos(int[] vet, int tamanho, int qtdeNumNegativos) {
		// A condição de parada será quando o vetor não tiver mais posições, e o retorno
		// será a quantidade de números negativos encontrados.
		if (tamanho == 0) {
			return qtdeNumNegativos;
		} else {
			// O código irá verificar se o valor contido no vetor é negativo, começando da
			// última posição. Caso seja, um contador aumentará em 1.
			int ultimaPosicao = tamanho - 1;
			if (vet[ultimaPosicao] < 0) {
				qtdeNumNegativos++;
			}
			tamanho--;
			return qtdeElementosNegativos(vet, tamanho, qtdeNumNegativos);
			// E então irá chamar a função novamente, mas com a posição do vetor reduzida em
			// 1, até chegar na condição de parada.
		}
	}

}
