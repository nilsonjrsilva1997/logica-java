package ex3;

public class Exercicio3 {
	public int fatorial(int numero) {
		int fatorial = 0;
		
		for(int i = numero; i >= 2; i--) {
			if(i == numero) {				
				fatorial = fatorial + (i * (i - 1));
			} else {
				fatorial = fatorial * (i - 1);
			}
		}
		
		return fatorial;
	}
}
