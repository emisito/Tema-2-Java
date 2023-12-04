package IntentoBurbuja;

import java.util.Arrays;

public class IntentoBurbuja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {6, 4, 1, 5, 2, 9, 10, 3};
		int guardar = array[0];
		
		System.out.print("Este es mi array desordenado " + Arrays.toString(array));
		for (int i = 0; i < array.length
				; i++) {
			for (int h = 0; h < array.length - i - 1; h++) {
				if (array[h] > array[(h + 1)]) {
					guardar = array[h];
					array[h] = array[(h + 1)];
					array[(h + 1)] = guardar;
				}
				
			}
		}
		System.out.print("\nEste es mi array ordenado " + Arrays.toString(array));
	}

}
