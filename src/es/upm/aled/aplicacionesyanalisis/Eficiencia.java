package es.upm.aled.aplicacionesyanalisis;

public class Eficiencia {
	/*
	 * Comparar eficiencia

Genera un arreglo grande (por ejemplo, de 1 millón de elementos) y mide el tiempo de ejecución de:

Búsqueda lineal

Búsqueda binaria
Usa System.nanoTime() para comparar los tiempos y comenta los resultados.
	 */
	public static void main(String[] args) {
		int[] arr = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = i;		
		}
		int clave = 700000;
		// Búsqueda lineal:
		long inicio1 = System.nanoTime();
		int resultadoLineal = buscarLineal(arr,clave);
		long fin1 = System.nanoTime();
		System.out.println("Búsqueda lineal: " + resultadoLineal);
		System.out.println("Tiempo que se tarda: " + (fin1-inicio1));
		
		// Búsqueda binaria:
		long inicio2 = System.nanoTime();
		int resultadoBinario = buscarLineal(arr,clave);
		long fin2 = System.nanoTime();
		System.out.println("Búsqueda binaria: " + resultadoBinario);
		System.out.println("Tiempo que se tarda: " + (fin2-inicio2));

		/*
		 * - Búsqueda lineal: 5000
				- Tiempo que se tarda: 81300
		   - Búsqueda binaria: 5000
				- Tiempo que se tarda: 78900 --> Se puede observar que la búsqueda binaria tarda un poco menos que la lineal para el elemento 5000
				
			Si lo comparamos con el de 700.000:
		- Búsqueda lineal: 700000
			- Tiempo que se tarda: 3116000
		- Búsqueda binaria: 700000
 			- Tiempo que se tarda: 1566600 --> Aquí se observa una mayor diferencia debido a que búsqueda binaria
 			presenta una complejidad algorítmica O(logn), mientras que la búsqueda lineal O(n)
		 */
	}
	// Copiamos y pegamos los métodos de búsqueda lineal y binaria:
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
}


