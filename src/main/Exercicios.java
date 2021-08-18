package main;

import ex1.Exercicio1;
import ex2.Exercicio2;
import ex3.Exercicio3;
import ex4.Exercicio4;

public class Exercicios {

	public static void main(String[] args) {
		
		Exercicio1 ex1 = new Exercicio1();
		
		System.out.println(ex1.percentVotosValidosEleitores());
		System.out.println(ex1.percentBrancosEleitores());
		System.out.println(ex1.percentNulosEleitores());
		
		
		Exercicio2 ex2 = new Exercicio2();
		
		int v[] = ex2.ordenaArray();
		
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		
		Exercicio3 ex3 = new Exercicio3();		
		System.out.println(ex3.fatorial(9));
		
		
		Exercicio4 ex4 = new Exercicio4();
		System.out.println(ex4.somarMultiplos3E5(10));
	}

}
