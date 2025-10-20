package es.upm.aled.busquedabinaria;

public class Ocurrencias {
	/*
	 * Primera y última ocurrencia

En un arreglo ordenado con posibles duplicados, modifica la búsqueda binaria para encontrar:
1. La primera ocurrencia de un número (índice más bajo donde aparece la clave)
2. La última ocurrencia de un número (índice más alto donde aparece la clave)
	 */
	public static void main(String[] args) {
		int[] arr = {1,1,3,5,7,7,9,11,13,13,13,13,15,17};
		int clave = 13;
		System.out.println("Primera ocurrencia de " + clave + " : " + primeraOcurrencia(arr, clave));
		System.out.println("Última ocurrencia de " + clave + " : " + ultimaOcurrencia(arr, clave));
	}
	public  static int primeraOcurrencia (int[] arr, int clave) {
		// Nos creamos los límites del array
		int resultado = -1;
		int inicio = 0;
		int fin = arr.length-1;
		
		do {
			// Nos calculamos la mitad del array
		int mitad = ((inicio +fin)/2);
		// Podemos también obtener la posición media del array usando otra varaible auxiliar:
		int m = arr[mitad];
			// Comparamos el valor mitad con la clave:
		if (m ==  clave) {
			// Seguimos buscando en la mitad izquierda, pero devolvemos el valor de la posición:
			fin = mitad -1; //Primera ocurrencia
			resultado = mitad;
			
		}
		// Vemos si cada mitad es mayor o menor que el número (clave) que estamos buscando
		// El valor en el centro es menor que la clave --> clave solo puede estar en la mitad derecha del arreglo.
		if (m < clave) {
			inicio = mitad +1;
		}
		// El valor en el centro es mayor que la clave --> clave solo puede estar en la mitad izquierda del arreglo.
		if (m > clave) {
			fin = mitad -1;
		}
		} while (inicio <= fin); // Mientras haya elementos en el rango
		return resultado; // Si en el array no se ha encontrado el valor esperado, devolverá -1
	}
	public  static int ultimaOcurrencia (int[] arr, int clave) {
		// Nos creamos los límites del array
		int resultado = -1;
		int inicio = 0;
		int fin = arr.length-1;
		
		do {
			// Nos calculamos la mitad del array
		int mitad = ((inicio +fin)/2);
		// Podemos también obtener la posición media del array usando otra varaible auxiliar:
		int m = arr[mitad];
			// Comparamos el valor mitad con la clave:
		if (m ==  clave) {
			// Seguimos buscando en la mitad izquierda, pero devolvemos el valor de la posición:
			inicio = mitad +1 ; // Última ocurrencia
			resultado = mitad;
			
		}
		// Vemos si cada mitad es mayor o menor que el número (clave) que estamos buscando
		// El valor en el centro es menor que la clave --> clave solo puede estar en la mitad derecha del arreglo.
		if (m < clave) {
			inicio = mitad +1;
		}
		// El valor en el centro es mayor que la clave --> clave solo puede estar en la mitad izquierda del arreglo.
		if (m > clave) {
			fin = mitad -1;
		}
		} while (inicio <= fin); // Mientras haya elementos en el rango
		return resultado; // Si en el array no se ha encontrado el valor esperado, devolverá -1
	}
}
