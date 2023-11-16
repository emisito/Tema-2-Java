package IntentoBurbuja;

public class IntentoBurbuja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matriz1 = {1,2,3,4,6,3,8,5,2,8,6,7};
		
		for (int i = 0; i <= matriz1.length; i++) {
			
			for (int h = 1; h <= matriz1[i]; h++) {
				if (matriz1[h] < matriz1[i]) {
					int guardar = matriz1[h];
					
				}
			}
		}
	}

}
