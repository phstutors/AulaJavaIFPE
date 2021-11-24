//Notas com herença
public class Notas {

	public int nota1;
	public int nota2;
	private int nota3;
	private int nota4;
	public Notas(int n1, int n2, int n3, int n4) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.nota4 = n4;
		
	}
public int calcularMedia() {
	int media = (nota1+nota2+nota3+nota4)/4;
	return media;
		
	}
}