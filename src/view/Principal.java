package view;

import controller.ElementosNegativosController;

public class Principal {

	public static void main(String[] args) {
		ElementosNegativosController eleNegativos = new ElementosNegativosController();
		int vet[] = { 2, 4, -5, -10, -3, 10, 42, 14, -30 };
		int tamanho = vet.length;
		int qtdeNumNegativos = 0;
		int resultado = eleNegativos.qtdeElementosNegativos(vet, tamanho, qtdeNumNegativos);
		System.out.println("Quantidade de elementos negativos: " + resultado);
	}
}
