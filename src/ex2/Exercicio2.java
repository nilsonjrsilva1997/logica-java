package ex2;

public class Exercicio2 {
	
	public int[] ordenaArray() {		
		int v[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < (v.length - 1); j++) {
				if(v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		
		return v;
	}
}
