package es.upm.aled.bubblesort;

import java.util.Arrays;

public class BubbleSortEficiencia {
	
	/*
	 * Comparar tiempos:
	-	Genera un array de 10 000 elementos aleatorios y mide el tiempo que tarda tu Bubble Sort en ordenarlo.
	- 	Luego compara ese tiempo con Arrays.sort(arr) (que internamente usa una mezcla de Merge y Quick Sort).
	 */
	public static void main(String[] args) {
		int [] arr = {4,6,1,213,2,7,8,0,2,10,15,23,24,68,54,26,27,43,29,30,20};
		int[] superArr = new int[10000];
		for (int i = 0; i < superArr.length; i++) {
			superArr[i] = (int) (Math.random() * 10000);
		}
		long t1 = System.nanoTime();
		bubbleSortAscendente(superArr);
		long t2 = System.nanoTime();
		System.out.println("Tiempo que ha tardado: " + (t2-t1));
		
		long t3 = System.nanoTime();
		bubbleSortAscendente(arr);
		long t4 = System.nanoTime();
		System.out.println("Tiempo que ha tardado: " + (t4-t3));
}
	public static void bubbleSortAscendente(int[] arr) {
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
}


