package ex4;

public class Exercicio4 {
	public int somarMultiplos3E5(int numero) {
		int total = 0;
		
		for(int i = 3; i <= (numero -1); i++) {			
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				total = total + i;
			}
		}
		
		return total;
	}
}
