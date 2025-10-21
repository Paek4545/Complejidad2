package es.upm.aled.aplicacionesyanalisis;

public class PuntoInsercion {
	/*
	 * Buscar el punto de inserción

Dado un arreglo ordenado, encuentra la posición donde se debería insertar un nuevo valor para mantener el orden.

Ejemplo: [1, 3, 5, 6], insertar 4 → índice 2.
	 */
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int clave = 4;
		System.out.println("El número " + clave + " se inserta en la posición " + puntoInsercion(arr, clave) + " del array");
	}
	public static int puntoInsercion(int[] arr, int clave) {
		int inicio = 0;
		int fin = arr.length -1;
while(inicio <= fin) {
		int mitad = (inicio+fin) / 2;
		int m = arr[mitad];
		if (m == clave) {
			return mitad;
		}
		else if(m < clave) {
			inicio = mitad + 1;
		}
		else {
			fin = mitad - 1;
		}
		}
	return inicio;	// Punto de inserción --> En vez de devolver donde se encuentra la posición del número de array
	// lo que hace es ver entre que posiciones se inserta un número.
	}
}
