package es.upm.aled.bubblesort;

import java.util.Arrays;

public class BubbleSortOptimized {
	/*
	 * Optimización temprana:
	- Mejora tu Bubble Sort para que, si en una pasada completa no se hace ningún intercambio, 
	el algoritmo termine antes.
	 */
	public static void main(String[] args) {
		int[] arrInput = {5,2,9,1,5,6};
		bubbleSortMejorado(arrInput);

	}
	// En este, sería buscar el mejor caso
	public static void bubbleSortMejorado(int[] arr) {
		// Recorremos primero el array general
		for (int i = 0; i<arr.length; i++) {
			boolean swapped = false; // Reiniciamos en cada pasada
		// Recorremos ahora cada elemento del array dentro del primer bucle (va haciéndose más pequeño y el último elemento no se puede mover)
			for (int j = 0; j<arr.length - i -1; j++) {
				if (arr[j] > arr[j+1]) {
		// Nos creamos una variable auxiliar:
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			swapped = true;
			}
		}
			if (!swapped) {
				break;
				}
	}
		System.out.println(Arrays.toString(arr));
	}
}
