package es.upm.aled.complejidad2;

public class MayorYMenorValor {
	/*
	 * Mayor y menor valor

		- Usando una búsqueda lineal, encuentra el máximo y mínimo en un arreglo
	Pseudocódigo:
	- Variable temporal que actuará como el máximo y el mínimo
	- Bucle for para el resto de arreglo
	- En cada iteración tenemos que ver si el valor del elemento de esa posición es mayor o menor que la variable temporal
	- Actualizamos ambos valores y lo devolvemos
	 */
	public static void main(String[] args) {
		int[] arr = {10,90,50,1,2,5,7};
		System.out.println("El valor mínimo del array es: " + busquedaLinealMenor(arr));
		System.out.println("El valor máximo del array es: " + busquedaLinealMayor(arr));
	}
	
	public static int busquedaLinealMayor(int arr[]) {
		// Variable temporal para luego actualizarla (inicializamos con el primer elemento del array)
		int max = 0; // Si el array fuese solo de número negativos no funcionaría. Poner también arr[0]
		// Recorremos el array
		for (int i = 0; i <arr.length; i++) {
		// Si el valor de la posición del array que iteramos es mayor que el valor de la variable temporal
			if (arr[i] > max) {
		// El valor de la posición del array se convertirá en el nuevo máximo
				max = arr[i];
			}
		}
		// Devolvemos el valor máximo
		return max;
	}
	public static int busquedaLinealMenor(int arr[]) {
		// Variable temporal para luego actualizarla (en este caso será el tamaño del array)
		int min = arr.length; // Esto tiene el problema de que si los valores del array es mayor que las 
		//posiciones no funcionará. Para que sea correcto se tendría que inicializar en su primera posición
		// arr[0]
		// Recorremos el array
		for (int i = 0; i < arr.length; i++) {
		// Si el valro de la posición del array es menor que el tamaño del array
			if (arr[i] < min) {
		// El valor de la posición del array se convertirá en el nuevo mínimo
				min = arr[i];
			}
		}
		// Devolvemos el mínimo
		return min;
	}
}
