package es.upm.aled.complejidad2;

public class BusquedaLineal {
/* 
 * Crea un método buscarLineal(int[] arr, int clave) que devuelva el índice del elemento buscado o -1 si no existe.

		Analiza su complejidad temporal y espacial.
 */
	public static void main(String[] args) {
		int[] miArray = {1,3,5,7,9};
		int clave = 5;
		System.out.println("Posiciones de mi array: " + buscarLineal(miArray, clave));

	}
	public static int buscarLineal(int[] arr, int clave) {
		int indice = -1;
		// Recorremos las posiciones del array dado
		for (int i = 0; i <arr.length; i++) {
			if (clave == arr[i]) {
				indice = i;
				break;
			}
			
		}
		return indice;
	}
	// Funciona!
}
