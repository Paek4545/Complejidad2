package es.upm.aled.busquedabinaria;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,13,15,17,19};
		int clave = 19;
		System.out.println("El valor " + clave + " se encuentra en la posición: " + busquedaBinaria(arr, clave));
		System.out.println("El valor " + clave + " se encuentra en la posición: " + busquedaBinariaRecursiva(arr, clave, 0, arr.length-1));

	}
	public  static int busquedaBinaria (int[] arr, int clave) {
		// Nos creamos los límites del array
		int inicio = 0;
		int fin = arr.length -1;
		
		do {
			// Nos calculamos la mitad del array
		int mitad = ((inicio +fin)/2);
		// Podemos también obtener la posición media del array usando otra varaible auxiliar:
		int m = arr[mitad];
			// Comparamos el valor mitad con la clave:
		if (m ==  clave) {
			return mitad;
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
		return -1; // Si en el array no se ha encontrado el valor esperado, devolverá -1
	}

	// Hacerlo ahora mediante recursividad:
	public static int busquedaBinariaRecursiva(int[] arr, int clave, int inicio, int fin) {
	    // Caso base: si los límites se cruzan, no se encontró la clave
	    if (inicio > fin) {
	        return -1;
	    }

	    // Calculamos la posición media
	    int mitad = (inicio + fin) / 2;
	    // Nos creamos una variable auxiliar para la posición media:
	    int m = arr[mitad];
	    // Comparamos el valor central con la clave
	    if (m == clave) {
	        return mitad;
	    }
	    // Si la clave es menor, buscar en la mitad izquierda
	    else if (m > clave) {
	        return busquedaBinariaRecursiva(arr, clave, inicio, mitad - 1);
	    }
	    // Si la clave es mayor, buscar en la mitad derecha
	    else {
	        return busquedaBinariaRecursiva(arr, clave, mitad + 1, fin);
	    }
	}

}
