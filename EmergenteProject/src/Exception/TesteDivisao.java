package Exception;

public class TesteDivisao {

	public static void main(String[] args) {

		Divisao div = new Divisao();
		
		try {
			System.out.println(div.dividir(2, 0));
		} catch (DivisaoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
}
