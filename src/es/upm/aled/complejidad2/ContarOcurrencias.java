package es.upm.aled.complejidad2;

public class ContarOcurrencias {
	/* 
	 * Dado un arreglo de enteros, usa búsqueda lineal para contar cuántas veces aparece un valor dado.

		Ejemplo: [1, 2, 3, 2, 2, 5] con clave 2 → salida: 3.
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,2,2,5};
		int clave = 2;
		System.out.println("Cuantas veces aparece el valor " + clave + " repetido: " + contarOcurrencias(arr, clave) + " veces");
		
	}
	public static int contarOcurrencias(int[] arr, int clave) {
		// Nos creamos un contador
		int contador = 0;
		// Nos recorremos el array
		for (int i = 0; i < arr.length; i++) {
		// Si nos encontramos el mismo número en distintas posiciones:
			if (clave == arr[i]) {
		// Aumentamos el contador
				contador++;
			}
		}
		// Devolvemos el contador
		return contador;
	}
}
