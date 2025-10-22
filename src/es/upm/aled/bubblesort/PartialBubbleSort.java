package es.upm.aled.bubblesort;

import java.util.Arrays;

public class PartialBubbleSort {
	/*
	 * Burbuja parcial:
	- Crea un método que ordene solo los primeros k elementos de un array usando Bubble Sort.
	(Por ejemplo, ordenar solo los primeros 5 de un arreglo de 20)
	 */
	public static void main(String[] args) {
		int[] arr = {4,6,1,213,2,7,8,0,2,10,15,23,24,68,54,26,27,43,29,30,20};
		int k = 5;
			bubbleSortParcial(arr, k);
		
	}

	public static void bubbleSortParcial(int[] arr, int k) {
			// Recorremos primero el array general
			for (int i = 0; i<k; i++) {
			// Recorremos ahora cada elemento del array dentro del primer bucle (va haciéndose más pequeño y el último elemento no se puede mover)
				for (int j = 0; j<k-i-1; j++) {
					if (arr[j] > arr[j+1]) {
			// Nos creamos una variable auxiliar:
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
			System.out.println(Arrays.toString(arr));
		}
	
}
