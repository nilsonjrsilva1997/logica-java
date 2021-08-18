package ex1;

public class Exercicio1 {
	private float totalEleitores = 1000;
	private float validos = 800;
	private float votosEmBranco = 150;
	private float nulos = 50;
	
	public float percentVotosValidosEleitores() {
		return (this.validos / this.totalEleitores) * 100;
	}
	
	public float percentBrancosEleitores() {
		return this.votosEmBranco / this.totalEleitores * 100;
	}
	
	public float percentNulosEleitores() {
		return this.nulos / this.totalEleitores * 100;
	}
}
