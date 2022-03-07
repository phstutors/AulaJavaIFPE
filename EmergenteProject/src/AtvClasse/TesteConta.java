package AtvClasse;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		try {
			System.out.println(c1.debitar(100));
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
	}
}
