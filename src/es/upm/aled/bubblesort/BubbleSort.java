package es.upm.aled.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	/*
	 * Implementación básica:
	Implementa el algoritmo Bubble Sort que ordene un arreglo de enteros en orden ascendente.

		- Entrada: [5, 2, 9, 1, 5, 6]

		- Salida: [1, 2, 5, 5, 6, 9]
	 */
	public static void main(String[] args) {
		int[] arrInput = {5,2,9,1,5,6};
		bubbleSortAscendiente(arrInput);
		bubbleSortDescendiente(arrInput);
		bubbleSortContador(arrInput);

	}
	public static void bubbleSortAscendiente(int[] arr) {
		// Recorremos primero el array general
		for (int i = 0; i<arr.length; i++) {
		// Recorremos ahora cada elemento del array dentro del primer bucle (va haciéndose más pequeño y el último elemento no se puede mover)
			for (int j = 0; j<arr.length - i -1; j++) {
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
	/*
	 * Orden descendente:
	- Modifica tu método para ordenar el mismo arreglo pero en orden descendente.
	 */
	public static void bubbleSortDescendiente(int[] arr) {
		// Recorremos primero el array general
		for (int i = 0; i<arr.length; i++) {
		// Recorremos ahora cada elemento del array dentro del primer bucle (va haciéndose más pequeño y el último elemento no se puede mover)
			for (int j = 0; j<arr.length - i -1; j++) {
				if (arr[j] < arr[j+1]) {
		// Nos creamos una variable auxiliar:
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
	}
	/*
	 * Contar intercambios:
	- Añade un contador que indique cuántos intercambios se realizaron durante el ordenamiento.
	 */
	public static void bubbleSortContador(int[] arr) {
		int contador = 0;
		// Recorremos primero el array general
		for (int i = 0; i<arr.length; i++) {
		// Recorremos ahora cada elemento del array dentro del primer bucle (va haciéndose más pequeño y el último elemento no se puede mover)
			for (int j = 0; j<arr.length - i -1; j++) {
				if (arr[j] > arr[j+1]) {
		// Nos creamos una variable auxiliar:
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			contador++;
			}
		}
	}
		System.out.println(("Se han realizado " + contador + " intercambios durante la ordenación"));
	}

}
